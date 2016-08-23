//P 161 How to creat submenu, check or disable menu items
//This applet creates menus and submenus.  The menu itens may be disable
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class menuWin2 extends Applet implements ActionListener
{
    Button b1 ,b2;
    menuFrame win;
    public void init ()
    {
	b1 = new Button ("Show Window");
	add (b1);
	b1.addActionListener (this);
	b2 = new Button ("Hide Window");
	add (b2);
	b2.addActionListener (this);
	win = new menuFrame ("Menu and Window");
	win.setSize (200, 100);
    } //init


    public void actionPerformed (ActionEvent e)
    {
	if (e.getSource () == b1)
	    win.setVisible (true);
	if (e.getSource () == b2)
	    win.setVisible (false);
    } //actionPerformed
} //menuwin2
class menuFrame extends Frame implements ActionListener
{
    Menu mu, sm;
    MenuBar mbar;
    TextField txt;
    MenuItem m1, m2, m4;
    CheckboxMenuItem m3;
    menuFrame (String title)
    {
	super (title);
	txt = new TextField ("Do U want to be a millionaire?");
	setLayout (new GridLayout (1, 1));
	add (txt);
	mbar = new MenuBar ();
	mu = new Menu ("Pick"); //new menu on menubar
	m1 = new MenuItem ("50-50"); //first menu item
	m1.addActionListener (this);
	mu.add (m1);
	m2 = new MenuItem ("audience");
	m2.addActionListener (this);
	mu.add (m2);
	mu.addSeparator (); //separate items for easy reading

	m3 = new CheckboxMenuItem ("Final Answer");
	m3.addActionListener (this);
	mu.add (m3);
	mu.addSeparator ();

	sm = new Menu ("Money"); //submenus
	sm.add (new MenuItem ("$1000"));
	sm.add (new MenuItem ("$2000"));
	sm.add (new MenuItem ("$4000"));

	mu.add (sm);
	mbar.add (mu);
	setMenuBar (mbar);

	mu.addSeparator ();

	m4 = new MenuItem ("Exit");
	m4.addActionListener (this);
	mu.add (m4);

    } //constructor


    public void actionPerformed (ActionEvent e)
    {
	if (e.getSource () == m1)
	    txt.setText ("50-50");
	if (e.getSource () == m2)
	{
	    m2.setEnabled (false);                 //deactivate menu item
	    txt.setText ("poll audience");
	}
	if (e.getSource () == m3)
	    ((CheckboxMenuItem) e.getSource ()).setState (true);//set check mark
	if (e.getSource () == m4)
	    setVisible (false);
    } //actionPerformed
} //class menuGrame
