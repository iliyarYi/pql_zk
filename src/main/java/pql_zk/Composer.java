package pql_zk;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.*;
import org.pql.antlr.PQLBaseListener;
import org.pql.antlr.PQLLexer;
import org.pql.antlr.PQLParser;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;
import org.zkoss.zk.ui.*;
import org.zkoss.zk.ui.util.*;
import org.pql.query.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.*;
import org.pql.ini.*;
import org.pql.api.*;
import java.util.Map.Entry;

public class Composer extends GenericForwardComposer {

    private static PQLAPI pqlAPI = null;
    PQLQueryResult queryResult = null;
    Hlayout container;
    // Textbox (ace editor) ID in zul
    Textbox aceTextBox;
    // Result Label ID in zul
    Label resultLabel;
    Label attributeLabel;
    Label locationLabel;
    Label variableLabel;
    Label taskLabel;
    Iterator var29;

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
            // Set the result label value to show in frontend
            // resultLabel ID is set in .zul
            resultLabel.setValue(getResult());
            attributeLabel.setValue(getAttributes());
            locationLabel.setValue(getLocations());
            variableLabel.setValue(getVariables());
            taskLabel.setValue(getTasks());
        } catch (Exception e) {
            //Get error message and show it to user as error notification when bad things happen
            String error = e.getMessage();
            Clients.showNotification("Syntax Error! " + error, "error", null, null, 5000);
        }

    }

    public void onClick$btn(Event e) throws InterruptedException{
        Window window = (Window) Executions.getCurrent().createComponents("g4file.zul", null, null);
        window.setWidth("1000px");
        window.setHeight("800px");
        window.setStyle("z-index:100;");
        window.setClosable(true);
        window.doModal();
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


    public String getResult() {
        // Function to convert Sets to String so it can be printed on frontend
        String Result = String.join(",",queryResult.getSearchResults());
        System.out.println(Result);
        return "Results: " + String.join(",",Result);
    }

    public String getAttributes() {
        // Function to convert Sets to String so it can be printed on frontend
//        String Attribute = String.join(",", queryResult.getAttributes());
        System.out.println(queryResult.getAttributes());
        return "Attributes: " + String.valueOf(queryResult.getAttributes());
//        return String.join(",",String.join(",",queryResult.getSearchResults()));
    }

    public String getLocations() {
        // Function to convert Sets to String so it can be printed on frontend
//        String Attribute = String.join(",", queryResult.getAttributes());
        System.out.println(queryResult.getLocations());
        return "Locations: " + String.valueOf(queryResult.getLocations());
//        return String.join(",",String.join(",",queryResult.getSearchResults()));
    }

    public String getVariables() {
        var29 = queryResult.getVariables().entrySet().iterator();
        String returnedVariables = "";
        Entry map = null;
        if(var29.hasNext()) {
            while(var29.hasNext()) {
                map = (Map.Entry)var29.next();
                System.out.println("Variable:\t" + (String)map.getKey() + " = " + map.getValue());
                returnedVariables = returnedVariables + "Variable:\t" + (String)map.getKey() + " = "
                        + map.getValue() + "\n";
            }
            return "Variables: Available";
        }else{
            System.out.println("Variables Not Available");
            return "";
        }
    }

    public String getTasks() {

        var29 = queryResult.getTaskMap().entrySet().iterator();
        String returnedTasks = "";
        Entry map = null;
        if(var29.hasNext()) {
            while(var29.hasNext()) {
                map = (Entry)var29.next();
                System.out.println("Task:\t" + map.getKey() + " -> " + map.getValue());
                returnedTasks = returnedTasks +  "Task:\t" + map.getKey() + " -> " + map.getValue() + "\n";
            }

            return returnedTasks;
        }else{
            System.out.println("Tasks Not Available");
            return "";
        }
    }
}




