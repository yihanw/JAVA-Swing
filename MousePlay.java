/* this shows the co-ordination of the cursor when the mouse is pressed, cliked,
released or moved over cerain area of the screen */
import java.awt.*;
import java.awt.event.*;
public class MousePlay extends Frame
{
    public static void main (String args[])
    {
	new MousePlay ();
    } //end main


    MousePlay ()
    {
	super ("MousePlay");
	addWindowListener (new WindowAdapter ()
	{
	    public void windowClosing (WindowEvent e)
	    {
		System.exit (0);
	    }
	}
	);
	mPanel mp = new mPanel ();
	add (mp);
	pack ();
	show ();
    } //MousePlay


    public class mPanel extends Canvas implements MouseListener
    {
	String enterExit = "";
	String click = "";
	String press = "";
	String release = "";
	mPanel ()
	{
	    addMouseListener (this);
	    setSize (200, 100);
	} //mPanel
	public void paint (Graphics g)
	{
	    g.drawString (enterExit, 20, 30);
	    g.drawString (click, 20, 50);
	    g.drawString (press, 20, 70);
	    g.drawString (release, 20, 90);
	} //end paint
	public void mouseEntered (MouseEvent e)
	{
	    enterExit = "Mouse Entered -> (" + e.getX () + "," + e.getY () + ")";
	    repaint();
	}
	public void mouseExited (MouseEvent e)
	{
	    enterExit = "Mouse Exited -> (" + e.getX () + "," + e.getY () + ")";
	    repaint();
	}public void mouseClicked (MouseEvent e)
	{
	    click = "Mouse Clicked -> (" + e.getX () + "," + e.getY () + ")";
	    repaint();
	}
	public void mousePressed (MouseEvent e)
	{
	    press = "Mouse Pressed -> (" + e.getX () + "," + e.getY () + ")";
	    repaint();
	}
	public void mouseReleased (MouseEvent e)
	{
	    release = "Mouse Released -> (" + e.getX () + "," + e.getY () + ")";
	    repaint();
	}
    } //end mPanel constructor
} //end Class


