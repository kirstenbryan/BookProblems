import javax.swing.JOptionPane;
/**
 * P1.15 - Type in and run the following program: ... then modify the program to print "Hello, name!", 
 * displaying the name that the user typed in.
 * 
 * @author Bryan Kirsten
 *
 */
public class P1_15 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + name + "!");

	}

}