package pql_zk;


import com.sun.org.apache.bcel.internal.generic.NEW;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.*;
import org.jbpt.persist.MySQLConnection;
import org.pql.antlr.PQLBaseListener;
import org.pql.antlr.PQLLexer;
import org.pql.antlr.PQLParser;
import org.pql.label.ILabelManager;
import org.pql.label.LabelManagerLuceneVSM;
import org.pql.label.LabelManagerType;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.pql.query.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.util.*;
import org.pql.ini.*;
import org.pql.api.*;

import javax.swing.*;

public class Composer extends GenericForwardComposer {

    private static PQLAPI pqlAPI = null;
    PQLQueryResult queryResult = null;
    Hlayout container;
    // Textbox (ace editor) ID in zul
    Textbox aceTextBox;
    // Result Label ID in zul
    Label resultLabel;

    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }
    // Function to be executed when OK button is clicked
    public void onClickOk(Event event) throws Exception{
        // Get value entered in ace editor
        String textValue = aceTextBox.getValue();
        // Ignore empty spaces and lines
        textValue = textValue.trim();
        PQLIniFile iniFile = new PQLIniFile();
        if (!iniFile.load()) {
            iniFile.create();
            if (!iniFile.load()) {
                System.out.println("ERROR: Cannot load PQL ini file.");
                return;
            }
        }
        // Set up pqlAPI using PQL-Tool.jar with configurations in PQL.ini file
        pqlAPI = new PQLAPI(iniFile.getMySQLURL(), iniFile.getMySQLUser(), iniFile.getMySQLPassword(), iniFile.getPostgreSQLHost(), iniFile.getPostgreSQLName(), iniFile.getPostgreSQLUser(), iniFile.getPostgreSQLPassword(), iniFile.getLoLA2Path(), iniFile.getLabelSimilaritySeacrhConfiguration(), iniFile.getIndexType(), iniFile.getLabelManagerType(), iniFile.getDefaultLabelSimilarityThreshold(), iniFile.getIndexedLabelSimilarityThresholds(), iniFile.getNumberOfQueryThreads(), (long)iniFile.getDefaultBotMaxIndexTime(), (long)iniFile.getDefaultBotSleepTime());
        // Convert input textValue to token that can be used by Antlr parser.
        CharStream stream = new ANTLRInputStream(textValue);
        PQLLexer lexer = new PQLLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PQLParser parser = new PQLParser(tokens);
        // Remove console error message
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        // Debug: Show results in console
//        System.out.println("Result:\t\t" + queryResult.getSearchResults());

        try {
            // Parse input query using antlr parser
            parser.query();

            // Assign result of the query into queryResult
            queryResult = pqlAPI.query(textValue);
            // Show notification to user
            Clients.showNotification("Query Successful!", "info", null, null, 1000);
//            System.out.println(queryResult.getSearchResults());
        } catch (Exception e) {
            //Get error message and show it to user as error notification when bad things happen
            String error = e.getMessage();
            System.out.println("Error!"+e);
            Clients.showNotification("Syntax Error! " + error, "error", null, null, 5000);
        }

        // Set the result label value to show in frontend
        // resultLabel ID is set in .zul
        resultLabel.setValue(getResult());
    }

    public String getResult() {
        // Function to convert Sets to String so it can be printed on frontend
        System.out.println(String.join(",",queryResult.getSearchResults()));
        return String.join(",",queryResult.getSearchResults());
    }


    public void onClickParse(Event event) throws Exception{

        // Happens when clicked parse button
        String textValue = aceTextBox.getValue();
       // textValue = textValue.replaceAll("\\s+","");
        textValue = textValue.trim();
      //  System.out.println(textValue);

        try {
          //  pqlAPI.parsePQLQuery(textValue);
            CharStream stream = new ANTLRInputStream(textValue);
            PQLLexer lexer = new PQLLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PQLParser parser = new PQLParser(tokens);
            ParseTree tree = parser.query();
            ParseTreeWalker.DEFAULT.walk(new PQLBaseListener(), tree);

            System.out.println(tree.toStringTree(parser));

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//            Trees.inspect(tree,parser);
            JFrame frame = new JFrame("PQL AST");
            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setScale(1.5);
            panel.add(viewer);
            frame.add(panel);
            frame.setSize(3 * dim.width/4,dim.height/2);
            frame.setVisible(true);
            frame.setAlwaysOnTop(true);
        } catch (Exception e) {
            System.out.println("invalid: " + e.getMessage());
            Clients.showNotification("Syntax Error! " + e.getMessage(), "error", null, null, 5000);
        }


        Clients.showNotification("Parse PQL Query Successful","info",null,null,1000);
    }


    public void onClickCancel(Event event) throws Exception{
        // Happens when clicked cancel button
        Clients.showNotification("Clicked Cancel button","info",null,null,1000);
    }


//    private static void writeUsingOutputStream(String data) {
//        OutputStream os = null;
//        try {
//            os = new FileOutputStream(new File("./myPQL.pql"));
//            os.write(data.getBytes(), 0, data.length());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}




