package pql_zk;


import com.sun.org.apache.bcel.internal.generic.NEW;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.pql.antlr.PQLLexer;
import org.pql.antlr.PQLParser;
import org.pql.label.ILabelManager;
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


import org.antlr.v4.runtime.*;

public class Composer extends GenericForwardComposer {


    Map<String, String> myMap = new HashMap();
    Hlayout container;
    Textbox aceTextBox;
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }

    public void onClickOk(Event event) throws Exception{


        String textValue = aceTextBox.getValue();
        StringBuilder returnedResult = new StringBuilder();
        ILabelManager labelMngr = null;
        Set<Double> indexedLabelSimilarities = null;
        LabelManagerType labelManagerType = null;

        textValue = textValue.replaceAll("\\s+","");
//        if(!textValue.endsWith(";")) {
//            Clients.showNotification("Syntax error", "error", null, null, 2000);
//        }else {
//            Clients.showNotification(aceTextBox.getValue(), "info", null, null, 1000);
//        }
//
//        PQLIniFile iniFile = new PQLIniFile();
//        if (!iniFile.load()) {
//            iniFile.create();
//            if (!iniFile.load()) {
//                System.out.println("ERROR: Cannot load PQL ini file.");
//                return;
//            }
//        }

        CharStream stream = new ANTLRInputStream(textValue);
        PQLLexer lexer = new PQLLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PQLParser parser = new PQLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        try {
            parser.query();
            PQLQueryResult result = new PQLQueryResult(1, "jdbc:mysql://localhost:3306/pql", "root", "password", textValue, labelMngr, "localhost", "themis", "user", "password", "./lucene/", 0.75, indexedLabelSimilarities,
            labelManagerType);
            Clients.showNotification("Query Ok!", "info", null, null, 5000);
        } catch (Exception e) {
            String error = e.getMessage();System.out.println(""+e);
            Clients.showNotification("Syntax Error! " + error, "error", null, null, 5000);
        }

    }
    public void onClickCancel(Event event) throws Exception{
        Clients.showNotification("Clicked Cancel button","info",null,null,5000);
    }

}




