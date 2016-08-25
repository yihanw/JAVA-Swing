// Peter's
import java.awt.*;
import hsa.Console;
//From Peter
import javax.swing.*;
public class JLabelDemo
{


    public static void main (String[] args)
    {
	String st = "THIS IS A LABEL";
	Font f = new Font ("Serif", Font.ITALIC + Font.BOLD, 33);

	JLabel demoLabel1 = new JLabel (st);
	demoLabel1.setFont (f);
	demoLabel1.setForeground (Color.red);

	// creates a JLabel object called demoLabel1
	//containing the string st
	// give it some Font stuff!
	JLabel imageLabel1 = new JLabel ("NEW LABEL");
	imageLabel1.setFont (f);
	imageLabel1.setForeground (Color.blue);
	imageLabel1.setIcon (new ImageIcon ("STEWY.jpg"));
	// creates a JLabel object called imageLabel1 to hold an image object
	//here is an object("Stewy.jpg") nested inside another objectthe JLabel
	// give it some Font stuff

	JOptionPane.showMessageDialog (null, demoLabel1,
		"JLABEL1",
		JOptionPane.INFORMATION_MESSAGE);
	JOptionPane.showMessageDialog (null, imageLabel1,
		"JIMAGELABEL1",
		JOptionPane.INFORMATION_MESSAGE);
	JLabel imageLabel2 = new JLabel (" \nTalk to me!\n ");
	imageLabel2.setFont (f);
	imageLabel2.setForeground (Color.blue);
	imageLabel2.setIcon (new ImageIcon ("STEWY.jpg"));
	st = JOptionPane.showInputDialog (imageLabel2);


    } // main method
} // JLabelDemo class
