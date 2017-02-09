import java.util.Scanner;
/**
 * P2.13 - Write a program that reads a number between 1,000 and 999,999 from the user, where the user enters a 
 * comma in the input. Then print the number without a comma. Here is a sample dialog; the user input is on the right:
 * 			Please enter an integer between 1,000 and 999,999: 23,456
 * 			23456
 * Hint: Read the input as a string. Measure the length of the string. Suppose it contains n characters. Then extract
 * substrings consisting the first n-4 characters and the last three characters.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_13 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an integer between 1,000 and 999,999: ");
		String number = input.next();
		input.close();

		int stringLen = number.length();
		String firstHalf = number.substring(0, stringLen - 4);
		String secondHalf = number.substring(stringLen - 3, stringLen);
		String numberWithoutComma = firstHalf + secondHalf;
		
		System.out.println(numberWithoutComma);
		
	}

}