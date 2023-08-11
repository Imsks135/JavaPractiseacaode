import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class solution extends JFrame{
 static JFrame f;
 static JButton b;
 static JLabel l;
 public static void main(String args[])
 {
   f=new JFrame("panel");
   l=new JLabel("panel label");
   b=new JButton("button");
   
   JPanel p=new JPanel();
   p.add(b);
   p.add(l);
   p.setBackground(Color.red);
   f.add(p);
   f.setSize(300,300);
   f.show();
}
}
   
