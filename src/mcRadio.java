/* this applet creates 4 radio buttons.  When one of them is cled, the response
appears in a textfield */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class mcRadio extends Applet implements ItemListener
{
    private Label question, ans;
    private Checkbox b1, b2, b3, b4;
    private CheckboxGroup options;
    public void init ()
    {
	question = new Label ("What is C in CPU?");
	add (question);
	options = new CheckboxGroup ();
	b1 = new Checkbox ("Cedarbrae", options, false);
	b2 = new Checkbox ("Canadian", options, true);
	b3 = new Checkbox ("Central", options, false);
	b4 = new Checkbox ("Cricket", options, false);
	Panel p = new Panel ();
	p.setLayout (new GridLayout (4, 1)); //set buttons in 4 rows
	p.add (b1); //place button on a panel
	p.add (b2);
	p.add (b3);
	p.add (b4);
	add (p); //add panel
	ans = new Label("__________________________________");//space for answer
	add (ans);
	b1.addItemListener (this);
	b2.addItemListener (this);
	b3.addItemListener (this);
	b4.addItemListener (this);
    } //end init


    public void itemStateChanged (ItemEvent e)
    {
	if (b3.getState ())
	    ans.setText ("Correct, add 2 points"); //correct answer
	else
	    ans.setText ("Incorrect");
	b1.setEnabled (false);
	b2.setEnabled (false);
	b3.setEnabled (false);
	b4.setEnabled (false);
	repaint ();
    } //itemStateChanged
} //mcRadio
