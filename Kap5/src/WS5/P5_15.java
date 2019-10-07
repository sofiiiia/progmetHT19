/**
 * 
 */
package WS5;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-10-04
 *
 */
public class P5_15 {

	/**
	 * @param args
	 */

	public static String reverse(String str) {
	
		if(str.length() > 1) {
			return reverse(str.substring(1) )+ str.charAt(0);
		}
		return str;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv ett ord: ");
		String ord = reverse(input.next());
		System.out.println(ord);
		input.close();
	}
}
