/**
 * P2.1 - Write a program that displays the dimensions of a letter-size (8.5 x 11 inches) sheet of paper in 
 * millimeters. There are 25.4 millimeters per inch. Use constants and comments in your program.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_1 {
	
	public static void main(String[] args) {
		
		// Constant for the conversion between millimeters and inches
		final double MILLI_PER_INCH = 25.4;
		
		System.out.printf("Letter-size: %.2f", 8.5 * MILLI_PER_INCH);
	   	System.out.printf(" x %.2f millimeters", 11 * MILLI_PER_INCH);
	    
	}
	
}
