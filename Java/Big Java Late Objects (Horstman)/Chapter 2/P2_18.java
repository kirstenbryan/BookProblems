/**
 * P2.18 - Writing Large Numbers. A large letter H can be represented like this: ... It can be declared as a string
 * literal like this: final string LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n"; (The \n escape sequence denotes
 * a "newline" character that causes subsequent characters to be printed on a new line.) Do the same for the letters
 * E, L, and O. Then write the message
 * 			H
 * 			E
 * 			L
 * 			L
 * 			O
 * in large letters.
 * 
 * @author Bryan Kirsten
 *
 */
public class P2_18 {
	
	public static void main(String[] args) {
		
        final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n"; 
        final String LETTER_E = "*****\n* \n*****\n* \n*****\n"; 
        final String LETTER_L = "* \n* \n* \n* \n*****\n"; 
        final String LETTER_O = "*****\n*   *\n*   *\n*   *\n*****\n"; 
        System.out.println(LETTER_H); 
        System.out.println(LETTER_E); 
        System.out.println(LETTER_L); 
        System.out.println(LETTER_L); 
        System.out.println(LETTER_O); 
		
	}

}