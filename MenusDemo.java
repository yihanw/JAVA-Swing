/* P 160 how to add buttons on a panel with a grid layout
This applet creates different layouts to contain the components like buttons and panels */
import java.awt.*;
import java.awt.event.*;

public class MenusDemo extends Frame implements ActionListener, WindowListener
{
    private MenuItem exit = new MenuItem("Exit"); //set up menu items
    private MenuItem info = new MenuItem("Rule");
    private MenuItem one = new MenuItem("One");
    private MenuItem two = new MenuItem("Two");
    public MenusDemo ()
    {
	super ("Let's play");
	MenuBar mb = new MenuBar (); //create menu bar
	Menu file = new Menu ("File");
	file.add (info); //menu items under file menu
	info.addActionListener (this);
	file.add (exit);
	exit.addActionListener (this);
	mb.add (file); //         add File menu to menubar
	Menu play = new Menu ("Play");
	play.add (one); //menu items under file menu
	one.addActionListener (this);
	play.add (two);
	two.addActionListener (this);
	mb.add (play); //         add Play menu to menubar
	setMenuBar (mb); //insert menubar to frame
	addWindowListener (this);
	setSize (20, 200);
	show ();
    } //MemoDemo constructor


    public void actionPerformed (ActionEvent e)
    {
	if (e.getSource () == exit)
	{
	    dispose ();
	    System.exit (0);
	} //if exit
	if (e.getSource() == info) System.out.println("Games rule here.");
	if (e.getSource() == one) System.out.println("One Player.");
	if (e.getSource() == two) System.out.println("Two Players.");
    }//actionPerformed
    public void windowClosing(WindowEvent e)
    {
	dispose();
    }//windowClosing
    public static void main(String args[])
    {
	new MenusDemo();
    }//main
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
} //end MemoDemo
