package chapter3;
import java.util.Scanner;

/**
 * P3.16 - Write a program that reads in three strings and sorts them lexicographically.
 * 		Enter three strings: Charlie Able Baker
 * 		Able
 * 		Baker
 * 		Charlie
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter three strings: ");
		String string1 = input.next();
		String string2 = input.next();
		String string3 = input.next();
		input.close();

		if (string1.compareTo(string2) < 0 && string1.compareTo(string3) < 0) {
			System.out.println(string1);
			if (string2.compareTo(string3) < 0) {
				System.out.println(string2);
				System.out.println(string3);
			} else {
				System.out.println(string3);
				System.out.println(string2);
			}
		} else if (string1.compareTo(string2) > 0 && string2.compareTo(string3) < 0) {
			System.out.println(string2);
			if (string1.compareTo(string3) < 0) {
				System.out.println(string1);
				System.out.println(string3);
			} else {
				System.out.println(string3);
				System.out.println(string1);
			}
		} else {
			System.out.println(string3);
			if (string1.compareTo(string2) < 0) {
				System.out.println(string1);
				System.out.println(string2);
			} else {
				System.out.println(string2);
				System.out.println(string1);
			}
		}

	}

}