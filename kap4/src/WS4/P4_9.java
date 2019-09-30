/**
 * 
 */
package WS4;

import java.util.Scanner;

/**Program som skriver ett ord baklänges.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-25
 *
 */
public class P4_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = "";
		String baklänges = "";
		
		System.out.println("Skriv ett ord: ");
		text = input.nextLine();
		char letter ;
		
		for(int i = text.length(); i > 0; i--) {
			letter = text.charAt(i-1);
			baklänges += letter;
		}
		System.out.println(baklänges);
		input.close();
	}

}
