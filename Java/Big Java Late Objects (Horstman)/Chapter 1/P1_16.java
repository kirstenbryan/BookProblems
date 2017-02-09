import javax.swing.JOptionPane;
/**
 * P1.16 - Modify the program from Exercise P1.15 so that the dialog continues with the message "My name is
 * Hal! What would you like to do?" Discard the user's input and display a message such as "I'm sorry, Dave. I'm
 * afraid I can't do that." Replace Dave with the name that was provided by the user.
 * 
 * @author Bryan Kirsten
 *
 */
public class P1_16 {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + name + "!");
		JOptionPane.showInputDialog("My name is Hal! What would you like to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, " + name + ". I'm afraid I can't do that.");

	}

}