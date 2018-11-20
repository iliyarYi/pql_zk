package pql_zk;
import org.zkoss.zk.ui.*;
import org.zkoss.zk.ui.event.*;
import org.zkoss.zk.ui.util.*;
import org.zkoss.zk.ui.ext.*;
import org.zkoss.zk.au.*;
import org.zkoss.zk.au.out.*;
import org.zkoss.zul.*;

public class ValidateAceEditor extends GenericForwardComposer{

    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

    }

    Hlayout container;
    Textbox txtbox2;

//    public void onClickButton1(Event event) throws Exception{
//        Textbox textbox = new Textbox();
//        textbox.setSclass("mydb");
//        container.appendChild(textbox);
//    }

    public void onValidate(Event event) throws Exception{
        txtbox2.setStyle("background-color: red;");
    }
}