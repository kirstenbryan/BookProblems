package chapter1;

import javax.swing.JOptionPane;

/**
 * 
 * Modify the program from Exercise P1.15 so that the dialog continues with the message "My name is Hal! What would you like
 * me to do?" Discard the user's input and display a message such as 
 * 
 * "I'm sorry, Dave. I'm afraid I can't do that." 
 * 
 * Replace Dave with the name that was provided by the user.
 * 
 * @author Bryan S. Kirsten
 *
 */

public class P1_16 {

	public static void main(String args[]) {
		
		String userName = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
		System.out.println("I'm sorry " + userName + ". I'm afraid I can't do that.");
		
	}
	
	
}
