package chapter2;
import java.util.Scanner;
/**
 * P2.8 - Write a program that asks the user for the lengths of the sides of rectangle. Then print: the area and
 * perimeter of the rectangle, and the length of the diagonal (use the Pythagorean theorem).
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the two sides of a rectangle: ");
		double sideOne = input.nextDouble();
		double sideTwo = input.nextDouble();
		input.close();

		double area = sideOne * sideTwo;
		double perimeter = sideOne * 2 + sideTwo * 2;
		double diagonalLength = Math.sqrt(sideOne * sideOne + sideTwo * sideTwo);
		
		System.out.printf("Area: %.2f\n", area);
		System.out.printf("Perimeter: %.2f\n", perimeter);
		System.out.printf("Diagonal Length: %.2f\n", diagonalLength);
		
	}

}