import javax.swing.JOptionPane;

import java.awt.Graphics;    // import class Graphics

// Java extension packages
import javax.swing.JApplet;  // import class JApplet

class WelcomeApplet extends JApplet {  

   // draw text on applet's background
   public void paint( Graphics g )
   {
      // call inherited version of method paint
      super.paint( g );

      // draw a String at x-coordinate 25 and y-coordinate 25
      g.drawString( "Welcome to Java Programming!", 25, 25 );

   }  // end method paint

}  // end class WelcomeApplet
