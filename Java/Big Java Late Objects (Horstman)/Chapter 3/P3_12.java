import java.util.Scanner;
/**
 * P3.12 - Write a program that translates a letter grade into a number grade. Letter grades are A, B, C, D, and F, 
 * possibly followed by + or -. Their numeric values are 4, 3, 2, 1, and 0. There is no F+ or F-. A + increases the
 * numeric value by 0.3, a - decreases it by 0.3. However, an A+ has value 4.0.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Letter Grade: ");
		String letterGrade = input.next();
		input.close();
		
		double numericalValue = 0;
		
		switch(letterGrade) {
		case "A+": numericalValue = 4.0; break;
		case "A": numericalValue = 4.0; break;
		case "A-": numericalValue = 3.7; break;
		case "B+": numericalValue = 3.3; break;
		case "B": numericalValue = 3.0; break;
		case "B-": numericalValue = 2.7; break;
		case "C+": numericalValue = 2.3; break;
		case "C": numericalValue = 2.0; break;
		case "C-": numericalValue = 1.7; break;
		case "D+": numericalValue = 1.3; break;
		case "D": numericalValue = 1.0; break;
		case "D-": numericalValue = 0.7; break;
		case "F": numericalValue = 0.0; break;
		}
		
		System.out.println(letterGrade + " has a numerical value of: " + numericalValue);
		
	}

}