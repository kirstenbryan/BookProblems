package chapter1;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * P1.17 - Type in and run the following program: ... Then modify it to show a different greeting and image.
 * 
 * @author Bryan Kirsten
 *
 */
public class P1_17 {

	public static void main(String[] args) throws Exception {

		URL ImageLocation = new URL(
				"https://s-media-cache-ak0.pinimg.com/736x/1b/1a/a6/1b1aa69250458e622daed46d1d75903b.jpg");
		JOptionPane.showMessageDialog(null,  "\"FUCKIN' RIGHT, CHICAGOOOOOO!!!\"\n - Corey Crawford (2013)", "",
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(ImageLocation));

	}

}