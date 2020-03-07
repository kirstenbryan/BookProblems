package chapter3;
import java.util.Scanner;

/**
 * P3.26 - Roman numbers. Write a program that converts a positive integer into the Roman number system. The Roman 
 * number system has digits 
 * 		I	 	1 
 * 		V 		5 
 * 		X 		10 
 * 		L 		50 
 * 		C 		100 
 * 		D 		500 
 * 		M 		1,000 
 *  Numbers are formed according to the following rules: 
 *		a. Only numbers up to 3,999 are represented.
 *		b. As in the decimal system, the thousands, hundreds, tens, and ones are expressed separately.
 *		c. The  numbers 1 to 9 are express as:
 *  		I  		1 
 *  		II  	2 
 *  		III  	3 
 *  		IV  	4 
 *  		V  		5 
 *  		VI  	6 
 *  		VII  	7		 
 *  		VIII  	8 
 *  		IX  	9 
 *  As you can see, an I preceding a V or X is subtracted from the value, and you can never have more than three I’s in 
 *  a row. 
 *  	d. Tens and hundreds are done the same way, except that the letters X, L, C and C, D, M are used instead of I,
 *  	   V, X, respectively. 
 *  Your program should take an input, such as 1978, and convert it to Roman numerals, MCMLXXVIII. 
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String romanNumber = "";

		System.out.print("Integer number (1-4000): ");
		int number = input.nextInt();
		input.close();

		if (number < 1) {
			System.out.println("Number must be an integer between 1 and 4000");
			return;
		}

		int digit = number / 1000;

		if (digit == 3)
			romanNumber = "MMM";
		else if (digit == 2)
			romanNumber = "MM";
		else if (digit == 1)
			romanNumber = "M";

		digit = (number % 1000) / 100;

		if (digit == 9)
			romanNumber += "CM";
		else if (digit == 4)
			romanNumber += "CD";
		else {
			if (digit >= 5) {
				romanNumber += "D";
				digit -= 5;
			}
			if (digit == 3)
				romanNumber += "CCC";
			else if (digit == 2)
				romanNumber += "CC";
			else if (digit == 1)
				romanNumber += "C";
		}

		digit = (number % 100) / 10;

		if (digit == 9)
			romanNumber += "XC";
		else if (digit == 4)
			romanNumber += "XL";
		else {
			if (digit >= 5) {
				romanNumber += "L";
				digit -= 5;
			}
			if (digit == 3)
				romanNumber += "XXX";
			else if (digit == 2)
				romanNumber += "XX";
			else if (digit == 1)
				romanNumber += "X";
		}

		digit = number % 10;

		if (digit == 9)
			romanNumber += "IX";
		else if (digit == 4)
			romanNumber += "IV";
		else {
			if (digit >= 5) {
				romanNumber += "V";
				digit -= 5;
			}
			if (digit == 3)
				romanNumber += "III";
			else if (digit == 2)
				romanNumber += "II";
			else if (digit == 1)
				romanNumber += "I";
		}

		System.out.println("Roman numeral: " + romanNumber);

	}

}