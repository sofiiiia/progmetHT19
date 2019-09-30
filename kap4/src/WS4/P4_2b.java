/**
 * 
 */
package WS4;

import java.util.Scanner;

/**Program som skriver ut antal udda och jämna nummer.
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-23
 *
 */
public class P4_2b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv fem heltal: ");
		
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < 5; i++) {
			int y = input.nextInt();
			if(y %2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even: " + even + " Odd: " + odd);
		
		input.close();
	}

}
