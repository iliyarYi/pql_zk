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
import org.zkoss.zul.*;
import org.zkoss.zk.ui.*;
import org.zkoss.zk.ui.util.*;
import org.pql.query.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.*;
import org.pql.api.PQLAPI;
import org.pql.core.PQLTask;
import org.pql.ini.PQLIniFile;
import org.pql.query.PQLQueryResult;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;

import java.util.List;
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
    Label errorLabel;
    Iterator var29;
    private Listbox resultListbox;
    private ListModelList modelList;
    private Listbox attListbox;
    private ListModelList modelattList;
    private Listbox locListbox;
    private ListModelList modellocList;
    private Listbox taskListbox;
    private ListModelList modeltaskList;


    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }

    // Function to be executed when OK button is clicked
    public void onClickOk(Event event) throws Exception{
        // Get value entered in ace editor
        String textValue = aceTextBox.getValue();
        // Ignore empty spaces and lines
    //    textValue = textValue.trim();
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

            PQLQueryResult myQueryResult = null;
            // Assign result of the query into queryResult
            queryResult = pqlAPI.query(textValue);
            myQueryResult = pqlAPI.query("SELECT * FROM *;");

//            System.out.println(queryResult.getSearchResults());
            // Set the result label value to show in frontend
            // resultLabel ID is set in .zul
            errorLabel.setValue(null);
          //  resultLabel.setValue(getResult());
         //   attributeLabel.setValue(getAttributes());
//            locationLabel.setValue(getLocations());
//            variableLabel.setValue(getVariables());
 //           taskLabel.setValue(getTasks());
            // Result listbox
            List<String> resultData = new ArrayList<String>(queryResult.getSearchResults());
            System.out.println("[Search Result]: " + myQueryResult.getSearchResults() + "[Error]: " + myQueryResult.getNumberOfParseErrors());
            modelList = new ListModelList(resultData, true);
            resultListbox.setModel(modelList);
            // Attribute Listbox
            String tempattStr = String.valueOf(queryResult.getAttributes());

            System.out.println(tempattStr);
            tempattStr = tempattStr.substring(1, tempattStr.length()-1);
            List<String> attList = new ArrayList<String>(Arrays.asList(tempattStr.split(",")));
            modelattList = new ListModelList(attList, true);
            attListbox.setModel(modelattList);
            // Location Listbox
            String templocStr = String.valueOf(queryResult.getLocations());
            templocStr = templocStr.substring(1, templocStr.length()-1);
            List<String> locList = new ArrayList<String>(Arrays.asList(templocStr.split(",")));
            modellocList = new ListModelList(locList, true);
            locListbox.setModel(modellocList);

            readTasks();
            // Show notification to user
            Clients.showNotification("Query Successful!", "info", null, null, 1000);

        } catch (Exception e) {
            //Get error message and show it to user as error notification when bad things happen
            String error = e.getMessage();
            Clients.showNotification("Syntax Error! " + error, "error", null, null, 5000);
            errorLabel.setValue(error);
          //  resultLabel.setValue(null);
//            attributeLabel.setValue(null);
//            locationLabel.setValue(null);
//            variableLabel.setValue(null);
//            taskLabel.setValue(null);
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
      //  textValue = textValue.trim();
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


    public List<String> getResult() {
        List<String> resultList;

        // Function to convert Sets to String so it can be printed on frontend
        String Result = String.join(",",queryResult.getSearchResults());
        System.out.println(Result);
        resultList = new ArrayList<String>(queryResult.getSearchResults());
        return resultList;
//        return "Results: " + String.join(",",Result);
    }

    public List<String> getAttributes() {
        // Function to convert Sets to String so it can be printed on frontend
//        String Attribute = String.join(",", queryResult.getAttributes());
        List<String> attList;
        String tempStr = String.valueOf(queryResult.getAttributes());
        attList = new ArrayList<String>(Arrays.asList(tempStr.split(",")));

       // System.out.println("Attribute type: " + attList);

  //      return "Attributes: " + String.valueOf(queryResult.getAttributes());
        return attList;
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


    public void readTasks() {
        taskListbox.getItems().clear();
        //  System.out.println("doing readTasks");
//        ArrayList<String> Tasks = new ArrayList<String>();
//        ArrayList<String> Threshold = new ArrayList<String>();
//        ArrayList<String> Results = new ArrayList<String>();

        var29 = queryResult.getTaskMap().entrySet().iterator();
        Entry<String,org.pql.core.PQLTask> map = null;
        if(var29.hasNext()) {
            while(var29.hasNext()) {
                map = (Entry)var29.next();
//                Tasks.add(map.getValue().toString().substring(0,3));
//                Threshold.add(map.getValue().toString().substring(4,12));
//                Results.add(map.getValue().toString().substring(14,(map.getValue().toString()).length()));

                Label temp1 = new Label();
                Label temp2 = new Label();
                Label temp3 = new Label();
                Listitem listItem1 = new Listitem();
                Listcell listCell1 = new Listcell();
                Listcell listCell2 = new Listcell();
                Listcell listCell3 = new Listcell();
      //          org.pql.core.PQLTask pqlTask = (org.pql.core.PQLTask) map.getValue();
//                System.out.println("Type is: " + map.getValue().getLabel());
                temp1.setValue(map.getValue().getLabel());
                temp2.setValue(Double.toString(map.getValue().getSimilarity()));
                temp3.setValue(String.join(",", map.getValue().getSimilarLabels()));

                listCell1.appendChild(temp1);
                listCell2.appendChild(temp2);
                listCell3.appendChild(temp3);
                listItem1.appendChild(listCell1);
                listItem1.appendChild(listCell2);
                listItem1.appendChild(listCell3);

                taskListbox.appendChild(listItem1);
//                taskListbox.appendItem(map.getValue().toString().substring(0,3), map.getValue().toString().substring(0,3));
//                taskListbox.appendItem(map.getValue().toString().substring(4,12),map.getValue().toString().substring(4,12));
//                taskListbox.appendItem(map.getValue().toString().substring(14,(map.getValue().toString()).length()),
//                        map.getValue().toString().substring(14,(map.getValue().toString()).length()));
//                returnedTasks = returnedTasks +  "Task:\t" + Tasks + " -> Threshold:\t " + Threshold + " -> Results:\t" + Results + "\n";
//                System.out.println(returnedTasks);
            }
        }else{
            System.out.println("Tasks Not Available");
        }
    }
}




