import java.util.Scanner;
/**
 * P2.23 - The following pseudocode describes how to turn a string containing a ten-digit phone number 
 * (such as "4155551212") into a more readable string with parentheses and dashes, like this: "(415) 555-1212".
 *			Take the substring of the first three characters and surround it with "(" and ")". This is the
 *			area code.
 *			Concatenate the area code, the substring consisting of the next three characters, a hyphen, and the
 *			substring consisting of the last four characters. THis is the formatted number.
 *Translate this pseudocode into a Java program that reads a telephone number into a string variable, computes
 *the formatted number.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_23 {
	
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Please enter a ten-digit phone number: ");
        String tenDigitPhone = input.next();
        input.close();
        
        String areaCode = tenDigitPhone.substring(0, 3);
        String threeDigits = tenDigitPhone.substring(3, 6);
        String fourDigits = tenDigitPhone.substring(6, tenDigitPhone.length());
        String formattedPhone = "(" + areaCode + ") " + threeDigits + "-" + fourDigits;
        
        System.out.println("The formatted phone numbers is: " + formattedPhone);
        
	}

}