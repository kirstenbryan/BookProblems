package chapter1;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 * Type in and run the following program:
 * 
 * import java.net.URL;
 * import javax.swing.ImageIcon;
 * import javax.swing.JOptionPane;
 * 
 * public class Test {
 * 
 *    public static void main(String args[]) throws Exception {
 *    
 *       URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
 *       JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
 *       
 *    }
 * 
 * }
 * 
 * Then modify it to show a different greeting and image. (As of 2021, the image does not work).
 * 
 * @author Bryan S. Kirsten
 *
 */

public class P1_17 {
	
	public static void main(String args[]) throws Exception {
		
		URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
		JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		       
	}

}
