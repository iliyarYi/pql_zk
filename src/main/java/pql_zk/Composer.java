package pql_zk;


import com.sun.org.apache.bcel.internal.generic.NEW;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.jbpt.persist.MySQLConnection;
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
import java.util.*;
import org.pql.ini.*;
import org.pql.api.*;

import org.antlr.v4.runtime.*;

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
        textValue = textValue.replaceAll("\\s+","");
        // Load PQL.ini file
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
        System.out.println("Result:\t\t" + queryResult.getSearchResults());

        try {
            // Parse input query using antlr parser
            parser.query();
            // Assign result of the query into queryResult
            queryResult = pqlAPI.query(textValue);
            // Show notification to user
            Clients.showNotification("Query Ok!", "info", null, null, 2000);
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
    public void onClickCancel(Event event) throws Exception{
        // Happens when clicked cancel button
        Clients.showNotification("Clicked Cancel button","info",null,null,5000);
    }

}




