//javaProgramtocreatea
//simpleJSpinner
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class spinner extends JFrame{
//frame
static JFrame f;

//defaultconstructor
spinner()
{
}

//mainclass
public static void main(String[]args)
{
//createanewframe
f=new JFrame("spinner");

//createaJSpinner
JSpinner s=new JSpinner();

//setBoundsforspinner
s.setBounds(70,70,50,40);

//setlayoutforframe
f.setLayout(null);

//addpaneltoframe
f.add(s);

//setframesize
f.setSize(300,300);

f.show();
}
}