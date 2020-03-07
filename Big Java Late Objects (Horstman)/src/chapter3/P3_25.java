package chapter3;
import java.util.Scanner;

/**
 * P3.25 - Write a program that prompts the user to provide a single character from the alphabet. Print Vowel or 
 * Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a 
 * string of length > 1, print an error message.
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter character: ");
		char character = input.next().charAt(0);
		input.close();

		if (Character.isLetter(character)) {
			if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
					|| character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U')
				System.out.println("The character is a vowel.");
			else
				System.out.println("The character is a consonant");

		} else
			System.out.println("Invalid input. Not a character!");

	}

}