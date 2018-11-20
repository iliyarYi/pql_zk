package pql_zk;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Hlayout;
import org.zkoss.zul.Textbox;

public class Composer extends GenericForwardComposer {

    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }

    Hlayout container;
    Textbox aceTextBox;

//    public void onClickButton1(Event event) throws Exception{
//        Textbox textbox = new Textbox();
//        textbox.setSclass("mydb");
//        container.appendChild(textbox);
//    }

    public void onClickOk(Event event) throws Exception{
     //   aceTextBox.setStyle("background-color: green;");
        Clients.showNotification("Ok","info",null,null,1000);
    }
    public void onClickCancel(Event event) throws Exception{
        Clients.showNotification("Cancel","info",null,null,1000);
    }
    public void onValidate(Event event) throws Exception{
     //   aceTextBox.setStyle("background-color: red;");
    }
}


