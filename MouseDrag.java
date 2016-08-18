/* P 152 how to register mouse movement
This application treacks the mouse movement and reports its coordinate */
import java.awt.*;
import java.awt.event.*;
public class MouseDrag extends Frame
{
    public static void main (String args[])
    {
	new MouseDrag ();
    } //end main


    MouseDrag ()
    {
	super ("MouseDrag.move");
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
    } //MouseDrag constructor


    public class mPanel extends Canvas implements MouseMotionListener
    {
	String motion = "";
	mPanel ()
	{
	    addMouseMotionListener (this);
	    setSize (300, 200);
	} //mPanel constructor
	public void paint (Graphics g)
	{
	    g.drawString (motion, 20, 30);
	} //end paint
	public void mouseMoved (MouseEvent e)
	{
	    motion = "Mouse moved -> (" + e.getX () + "," + e.getY () + ")";
	    repaint ();
	}
	public void mouseDragged (MouseEvent e)
	{
	    motion = "Mouse Dragged -> (" + e.getX () + "," + e.getY () + ")";
	    repaint ();
	}
       
    } //end mPanel 
} //end Class


