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
import org.zkoss.zul.Textbox;
import org.pql.query.*;
import java.util.*;
import org.pql.ini.*;
import org.pql.api.*;

import org.antlr.v4.runtime.*;

public class Composer extends GenericForwardComposer {

    private static PQLAPI pqlAPI = null;

    Map<String, String> myMap = new HashMap();
    Hlayout container;
    Textbox aceTextBox;
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }

    public void onClickOk(Event event) throws Exception{


        String textValue = aceTextBox.getValue();
        PQLQueryResult queryResult = null;
        StringBuilder returnedResult = new StringBuilder();

        MySQLConnection mysql = new MySQLConnection("jdbc:mysql://localhost:3306/pql", "root", "password");

        Set<Double> indexedLabelSimilarities = null;
        LabelManagerType labelManagerType = null;
        PQLIniFile iniFile = new PQLIniFile();
        textValue = textValue.replaceAll("\\s+","");



        indexedLabelSimilarities = new HashSet<Double>();
        indexedLabelSimilarities.add(0.5);
        indexedLabelSimilarities.add(0.75);
        indexedLabelSimilarities.add(1.0);

        labelManagerType = LabelManagerType.LUCENE;


//        ILabelManager labelMngr = labelMngr = new LabelManagerLuceneVSM(
//                mysql.getConnection(),
//                0.75, indexedLabelSimilarities, ""
//        );


//        System.out.println("Label: " + labelManagerType.toString() + " And indexedLabel: " + indexedLabelSimilarities);

        if (!iniFile.load()) {
            //iniFile.create();
            if (!iniFile.load()) {
                System.out.println("ERROR: Cannot load PQL ini file.");
                return;
            }
        }

        CharStream stream = new ANTLRInputStream(textValue);
        PQLLexer lexer = new PQLLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PQLParser parser = new PQLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        System.out.println(iniFile.getMySQLURL());
        queryResult = pqlAPI.query(textValue);
        System.out.println("Result:\t\t" + queryResult.getSearchResults());
        try {
            parser.query();
//            queryResult = new PQLQueryResult(2, "jdbc:mysql://localhost:3306/pql", "root", "password", textValue, labelMngr, "localhost", "themis", "user", "password", "./lucene", 0.75, indexedLabelSimilarities,
//            labelManagerType);
            Clients.showNotification("Query Ok!", "info", null, null, 5000);
//            System.out.println(queryResult.getSearchResults());
        } catch (Exception e) {
            String error = e.getMessage();
            System.out.println("Error!"+e);
            Clients.showNotification("Syntax Error! " + error, "error", null, null, 5000);
        }

    }
    public void onClickCancel(Event event) throws Exception{
        Clients.showNotification("Clicked Cancel button","info",null,null,5000);
    }

}




