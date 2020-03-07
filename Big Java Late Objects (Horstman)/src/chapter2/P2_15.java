package chapter2;
/**
 * P2.15 - Printing a grid. Write a program that prints the following grid to play tic-tac-toe. Of course, you could
 * simply write seven statements of the form System.out.print("+--+--+--+"); You should do it the smart way, though.
 * Declare string variables to hold two kinds of patterns: a comb-shaped pattern and the bottom line. Print the comb
 * three times and the bottom line four times.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_15 {
	
	public static void main(String[] args) {
		
		String combPart = "|  |  |  |";
		String horizontalLine = "+--+--+--+";
		
		String grid = horizontalLine + "\n" + combPart + "\n" + horizontalLine + "\n" + combPart + "\n" +
					  horizontalLine + "\n" + combPart + "\n" + horizontalLine;
		
		System.out.println(grid);
		
	}

}