package chapter3;
import java.util.Scanner;
/**
 * P3.13 - Write a program that translates a number between 0 and 4 into the closest letter grade. For example, 
 * the number 2.8 (which might have been the average of several grades) would be converted to B-. Break ties in
 * favor of the better grade; for example 2.85 should be a B.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String letterGrade = "";

		System.out.println("Enter your numeric grade (0.0 - 4.0): ");
		double numGrade = input.nextDouble();
		input.close();

		if (numGrade > 4.0 || numGrade < 0.0) {
			System.out.println("Invalid Grade.");
			return;
		} else if (numGrade == 4 || numGrade >= 3.85)
			letterGrade = "A";
		else if (numGrade > 3.7)
			letterGrade = "A-";
		else if (numGrade > 3)
			letterGrade = "B+";
		else if (numGrade >= 2.85)
			letterGrade = "B";
		else if (numGrade >= 2.7)
			letterGrade = "B-";
		else if (numGrade > 2)
			letterGrade = "C+";
		else if (numGrade >= 1.85)
			letterGrade = "C";
		else if (numGrade >= 1.7)
			letterGrade = "C-";
		else if (numGrade > 1)
			letterGrade = "D+";
		else if (numGrade >= 0.85)
			letterGrade = "D";
		else if (numGrade >= 0.7)
			letterGrade = "D-";
		else
			letterGrade = "F";
		
		System.out.println("Letter Grade: " + letterGrade);

	}

}