/**
 * 
 */
package WS4;

import java.util.Scanner;

/**program som skriver ut alla primtal 
 * lägre än de inmatade talet.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-27
 *
 */
public class P4_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett heltal: ");
		int tal = input.nextInt();
		
		
		for(int i = 1; i <= tal; i++) {
			boolean ärPrimtal = true;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) { 
					ärPrimtal = false;
					}
				
			}
			if(ärPrimtal == true) {
				System.out.println(i);
			}
			
		}
		
		input.close();
		
	}

}
