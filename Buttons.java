//an applet create buttons that serve as multiple choice.  the response is 
//shown in text field.
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Buttons extends Applet implements ActionListener //create button
{
    TextField txt;
    Button b1, b2, b3;
    public void init ()
    {
	txt = new TextField (20);
	add (txt);
	b1 = new Button ("A");
	add (b1);
	b1.addActionListener (this);
	b2 = new Button ("B");
	add (b2);
	b2.addActionListener (this);
	b3 = new Button ("C");
	add (b3);
	b3.addActionListener (this);
    } //init


    public void actionPerformed (ActionEvent e)
    {
	if (e.getSource () == b1)
	    txt.setText ("Final Answer: A?");
	if (e.getSource () == b2)
	    txt.setText ("Final Answer: B?");
	if (e.getSource () == b3)
	    txt.setText ("Final Answer: C?");
    } //actionPerformed
} //end applet


