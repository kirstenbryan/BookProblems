package chapter3;
import java.util.Scanner;

/**
 * P3.20 - Write a program that prompts for the day and month of the user's birthday and then prints a horoscope. 
 * Make up fortunes for the fortunes. Each fortune should contain the name of the astrological sign. (You will 
 * find the names and data ranges of the signs at a distressingly large number of sites on the Internet.)
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your birthday (Example: 02 13): ");
		int month = input.nextInt();
		int day = input.nextInt();
		input.close();

		if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
			System.out.println("Capricorn are ...");
		else if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
			System.out.println("Aquarius are ...");
		else if ((month == 2 && day >= 19) || (month == 3 && day <= 20))
			System.out.println("Pisces are ...");
		else if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
			System.out.println("Aries are ...");
		else if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
			System.out.println("Taurus are ...");
		else if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
			System.out.println("Gemini are ...");
		else if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
			System.out.println("Cancer are ...");
		else if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
			System.out.println("Leo are ...");
		else if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
			System.out.println("Virgo are ...");
		else if ((month == 9 && day >= 23) || (month == 10 && day <= 21))
			System.out.println("Libra are ...");
		else if ((month == 10 && day >= 22) || (month == 11 && day <= 21))
			System.out.println("Scorpio are ...");
		else
			System.out.println("Sagittarius are ...");

	}

}