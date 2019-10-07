/**
 * 
 */
package WS5;

import java.util.Scanner;

/**
 * @author 19soag01
 *
 */
public class P5_4 {
	
	public static String middle(String str) {
		
		
		if(str.length() %2 == 0) {
			int början = ((str.length()/2)-1);
			int slutet = ((str.length()/2)+1);
			return str.substring(början, slutet);
		}
		else {
			int word = str.length()/2;
			return str.substring(word, word +1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv ett text");
		
		String word = input.nextLine().trim();
		input.close();
		System.out.println(middle(word));

	}

}
