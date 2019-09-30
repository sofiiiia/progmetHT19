/**
 * 
 */
package WS4;

import java.util.Scanner;

/**Program som skriver ut minsta talet av ett antal tal.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-25
 *
 */
public class P4_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean first = true;
		int min = Integer.MAX_VALUE;
		
		System.out.println("Skriv ett antal tal, avsluta genom att skriva en bokstav ");
				
				
		while(input.hasNextInt()) {
			int another = input.nextInt();
			if(first) {
				min = another; 
				first = false;
			}else if(min > another) {
				min = another;
				
			}
		} 
		input.close();
		System.out.println("minsta värdet är: " + min);
	}
	
}
