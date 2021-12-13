package chapter1;

import javax.swing.JOptionPane;

/**
 * 
 * Type in and run the following program:
 * 
 * import javax.swing.JOptionPane;
 * 
 * public class DialogViewer
 * {
 *    public static void main(String args[])
 *    {
 *       String name = JOptionPane.showInputDialog("What is your name?");
 *       System.out.println(name);
 *    }
 * }
 * 
 * Then modify the program to print "Hello, name!", displaying the name that the user typed in.
 * 
 * @author Bryan S. Kirsten
 *
 */

public class P1_15 {
	
	public static void main(String args[]) {
		
		String userName = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + userName + "!");
		
	}

}
