/**
 * 
 */
package WS4;

import java.util.Scanner;

/**Program som räknar ut summan av en bas 
 * och en exponent.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-25
 *
 */
public class P4_egen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv en bas");
		int x = input.nextInt();
		System.out.println("Skriv en exponent");
		int n = input.nextInt();
		int produkt = x;
		
		
		
		for (int i = 1; i < n; i++) {
		
			produkt *= x;
			
		}
		System.out.printf("Produkten är %d", produkt);
		input.close();
	}

}
