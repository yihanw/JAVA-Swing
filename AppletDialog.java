/* P 163 how to create a dialog box for user response
This applet creates a dialog box for user response */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletDialog extends Applet implements ActionListener
{
    Button btn;
    Label text;
    public void init ()
    {
	btn = new Button ("Final Answer?");
	btn.addActionListener (this);
	add (btn);
	text = new Label ("A, B, C or D");
	add (text);
    } //init


    public void actionPerformed (ActionEvent e)
    {
	Frame fr = new Frame ();
	btnDialog d = new btnDialog (fr);
	d.show ();
	text.setText (d.getPick ());
    } //actionPerformed
} //end AppletDialog
class btnDialog extends Dialog implements ActionListener
{
    Button yes, no;
    CheckboxGroup cbg;
    Checkbox A, B, C, D;
    String pick;
    public btnDialog (Frame fr)
    {
	super (fr, "select Answer", true);
	Panel p1 = new Panel (); //control location of buttons
	yes = new Button ("Yes");
	no = new Button ("No");
	yes.addActionListener (this);
	no.addActionListener (this);
	add ("South", p1);
	p1.add (yes);
	p1.add (no);
	cbg = new CheckboxGroup (); //create 4 radio buttons
	A = new Checkbox ("A", cbg, true);
	B = new Checkbox ("B", cbg, false);
	C = new Checkbox ("C", cbg, false);
	D = new Checkbox ("D", cbg, false);
	Panel p2 = new Panel ();
	add ("Center", p2);
	p2.setLayout (new GridLayout (2, 2)); //Set buttons 2 by 2
	p2.add (A);
	p2.add (B);
	p2.add (C);
	p2.add (D);
	setSize (200, 100);
    } //btnDialog
public void clickedYes()
{
    pick = ("A,B,C or D");
    if (A.getState()) pick = "A";
    if (B.getState()) pick = "B";
    if (C.getState()) pick = "C";
    if (D.getState()) pick = "D";
}//clickedYes

    public void actionPerformed (ActionEvent e)
    {
	Object source = e.getSource ();
	if (source == yes)
	    clickedYes ();
	setVisible (false);
    } //actionPerformed


    public String getPick ()
    {
	return pick;
    } //getPick
} //class
