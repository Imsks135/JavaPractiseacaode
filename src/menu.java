import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class menu extends JFrame{
	static JMenuBar mb;
	static JMenu x;
	static JMenuItem m1,m2,m3;
	static JFrame f;
	public static void main(String args[])
	{
		f=new JFrame("Menu demo");
		mb=new JMenuBar();
		x=new JMenu("Menu");
		m1=new JMenuItem("MenuItem1");
		m2=new JMenuItem("MenuItem2");
		m3=new JMenuItem("MenuItem3");
		x.add(m1);
		x.add(m2);
		x.add(m3);
		mb.add(x);
		f.setJMenuBar(mb);
		f.setSize(500,500);
		f.setVisible(true);
		
	}
}