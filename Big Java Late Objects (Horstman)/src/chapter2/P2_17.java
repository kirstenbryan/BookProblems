package chapter2;
import java.util.Scanner;
/**
 * P2.17 - Write a program that reads two times in military format (0900, 1730) and prints the number of hours and
 * minutes between the two times. Here is a sample run. User inputs on the right:
 * 			Please enter the first time: 0900
 * 			Please enter the second time: 1730
 * 			8 hours 30 mins
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int MINUTES_PER_HOUR = 60;
		final int MINUTES_PER_DAY = 24 * 60;
		
		System.out.println("Please enter the first time: ");
		int firstTime = input.nextInt();
		System.out.println("Please enter the second time: ");
		int secondTime = input.nextInt();
		input.close();
		
		int firstTimeMinutes = firstTime / 100 * MINUTES_PER_HOUR + firstTime % 100;
		int secondTimeMinutes = secondTime / 100 * MINUTES_PER_HOUR + secondTime % 100;
		
		int minutes = secondTimeMinutes - firstTimeMinutes;
		int hours = minutes / 60;
		
		minutes = (MINUTES_PER_DAY + minutes) % MINUTES_PER_DAY;
		minutes = minutes % 60;
		
		System.out.printf("%d hours %d minutes", hours, minutes);
		
	}

}