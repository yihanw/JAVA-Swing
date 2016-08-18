/* how to create a form for user response using text fields.  The info is saved
after clicking on the button, "ENTER" */
import java.awt.*;
import java.awt.event.*;
public class dataEntry
{
    class userWindow extends Frame implements ActionListener
    {
	TextField fname = new TextField (40);
	TextField lname = new TextField (40);
	TextField homeForm = new TextField (5);
	Button enterB = new Button ("ENTER");
	Label entries = new Label ();
	public userWindow ()
	{
	    super ("Enter info below"); //window title
	    setLayout (new GridLayout (4, 2));
	    add (new Label ("First Name -> ")); // add first name
	    add (new Label ("Last Name -> ")); // add last name
	    add (new Label ("Hone Form -> ")); // add HF
	    add (enterB);
	} //constructor


	public void actionPerformed (ActionEvent e)
	{
	    entries.setText (fname.getText () + " " + lname.getText () + " " + homeForm.getText ());
	} //action performed
    } //class


    public static void main ()
    {
	new userWindow ();
    }//main
} //class dataEntry
