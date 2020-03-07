package chapter3;
import java.util.Scanner;

/**
 * P3.17 - When two points in time are compared, each given as hours (in military time, ranging from 0000 and 2300)
 * and minutes, the following pseudocode determines which comes first.
 * 		If hour1 < hour2
 * 			time1 comes first.
 * 		Else if hour1 and hour2 are the same
 * 			If minute1 < minute2
 * 				time1 comes first.
 * 			Else if minute1 and minute2 are the same
 * 				time1 and time2 are the same.
 * 			Else
 * 				time2 comes first.
 * 		Else
 * 			time2 comes first.
 * Write a program that prompts the user for two points in time and prints the time that comes first, then the other
 * time. 
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter time 1: ");
		int time1 = input.nextInt();
		System.out.println("Enter time 2: ");
		int time2 = input.nextInt();
		input.close();
		
		int hours1 = time1 / 100;
		int minutes1 = time1 % 100 + hours1 * 60;
		
		int hours2 = time2 / 100;
		int minutes2 = time2 % 100 + hours2 * 60;
		
		if(hours1 < hours2) {
			System.out.println(time1);
			System.out.println(time2);
		}
		else if (hours1 == hours2) {
			if(minutes1 < minutes2) {
				System.out.println(time1);
				System.out.println(time2);
			}
			else if(minutes1 == minutes2) System.out.println("Both times are the same");
			else {
				System.out.println(time2);
				System.out.println(time1);
			}
		}
		else {
			System.out.println(time2);
			System.out.println(time1);
		}
		
	}

}