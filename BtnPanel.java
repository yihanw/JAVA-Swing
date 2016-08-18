/* P 155 how to add buttons on a panel with a grid layout
This applet creates different layouts to contain the components like buttons and panels */
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class BtnPanel extends Applet
{
    private Panel p;
    private Button btn[]; //creates an array of buttons
    public void init ()
    {
	p = new Panel ();
	btn = new Button [4];
	p.setLayout (new GridLayout (2, 2));
	for (int i = 0 ; i < btn.length ; i++)
	{
	    btn [i] = new Button (String.valueOf ((char) (i + 65))); //conver to Unicode A,B,C,D
	    p.add (btn [i]);
	} //for
	setLayout (new BorderLayout ());
	add (p, BorderLayout.SOUTH);//try NORTH,EAST,..
    } //init
} //end applet
