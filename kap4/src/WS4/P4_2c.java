/**
 * 
 */
package WS4;

import java.util.Scanner;

/**program som räknar ut summan av 2 följande nummer.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-23
 *
 */
public class P4_2c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int resultat = 0;
		System.out.println("Skriv in fyra tal med mellanslag emellan:");
		for(int i = 0; i < 4; i++) {
			resultat = resultat + input.nextInt();
			System.out.println(resultat + " ");
		}

		input.close();
	}

}
