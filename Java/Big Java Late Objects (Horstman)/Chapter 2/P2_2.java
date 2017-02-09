/**
 * P2.2 - Write a program that computes and displays the perimeter of a letter-size (8.5 x 11 inches) sheet of paper
 * and the length of it's diagonal.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_2 {
	
	public static void main(String[] args) {
		
		final double LENGTH = 11.0;
		final double WIDTH = 8.5;
		
		double perimeter = 2 * WIDTH + 2 * LENGTH;
		double diagonal = Math.sqrt(WIDTH * WIDTH + LENGTH * LENGTH);
		
		System.out.printf("Perimeter: %.2f\n", perimeter);
		System.out.printf("Diagonal Length: %.2f", diagonal);
			
	}
	
}