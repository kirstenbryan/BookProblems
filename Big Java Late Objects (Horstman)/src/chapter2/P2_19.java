package chapter2;
import java.util.Scanner;
/**
 * P2.19 - Write a program that transforms numbers 1, 2, 3, ..., 12 into the corresponding month names January, 
 * February, March, ..., December. Hint: Make a very long string "January February March ...", in which you add
 * spaces such that each month has the same length. Then use a substring to extract the month you want.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_19 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which month would you like to return?");
		int monthNumber = input.nextInt();
        input.close();
		
        String months = "January   February  March     April     May       June      July      ";
        months += "August    September October   November  December  ";

        String monthToReturn = months.substring(-10 + (monthNumber * 10), (monthNumber * 10));
        
        System.out.println(monthToReturn);  
		
	}

}