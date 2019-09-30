/**
 * 
 */
package WS4;

import java.util.Scanner;

/**program som skriver ut summan av alla udda tal mellan a & b.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-23
 * 
 *
 */
public class P4_1d {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Skriv ett tal: ");
		int a = in.nextInt();
		System.out.println("Skriv ett till tal som är större: ");
		int b = in.nextInt();
		int summa = 0;
		
		while (a <= b) {
			if (a%2 != 0) {
				summa += a;
			}
			a++;
		}
		
		System.out.println(summa);
		
		in.close();
	}
	
	

}
