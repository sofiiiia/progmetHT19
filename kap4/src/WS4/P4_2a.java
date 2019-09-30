/**
 * 
 */
package WS4;

import java.util.Scanner;

/**program som skriver ut de största och minsta värde av 5 tal.
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-23
 *
 */
public class P4_2a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv fem heltal");
		
		int smallest = 1000000;
		int biggest = -1000000; 
		
		for(int i = 0; i < 5; i++) {
			int a = input.nextInt();
			if(a < smallest) {
				smallest = a;
			}else if(a> biggest) {
				biggest = a;
			}
		}
		System.out.println("Smallest: "+ smallest + " Biggest: "+ biggest);
	
		input.close();
	}
	

}
