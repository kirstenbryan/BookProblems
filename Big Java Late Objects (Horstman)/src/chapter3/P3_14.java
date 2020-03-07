package chapter3;
import java.util.Scanner;

/**
 * P3.14 - Write a program that takes user input describing a playing card in the following shorthand notation:
 * 		A			Ace
 * 		2 ... 10	Card values
 * 		J			Jack
 * 		Q			Queen
 * 		K 			King
 * 		D 			Diamonds
 * 		H			Hearts
 * 		S			Spades
 * 		C			Clubs
 * Your program should print the full description of the card. For example, 
 * 		Enter the card notation: QS
 * 		Queen of Spades
 * 
 * @author Bryan Kirsten
 *
 */
public class P3_14 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String cardName = "";

		System.out.println("Enter the card notation: ");
		String card = input.next();
		input.close();

		String value = card.substring(0, card.length() - 1);
		String suit = card.substring(card.length() - 1);

		if (value.compareTo("A") == 0)
			cardName = "Ace";
		else if (value.compareTo("K") == 0)
			cardName = "King";
		else if (value.compareTo("Q") == 0)
			cardName = "Queen";
		else if (value.compareTo("J") == 0)
			cardName = "Jack";
		else
			cardName = value;

		if (suit.compareTo("D") == 0)
			cardName += " of Diamonds";
		else if (suit.compareTo("H") == 0)
			cardName += " of Hearts";
		else if (suit.compareTo("S") == 0)
			cardName += " of Spades";
		else
			cardName += " of Clubs";

		System.out.println(cardName);

	}
	
}