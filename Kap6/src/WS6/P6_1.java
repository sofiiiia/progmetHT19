/**
 * 
 */
package WS6;

import java.util.Arrays;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-10-07
 *
 */
public class P6_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] heltal = new int [10];
		
		for(int i = 0; i < 10; i++) {
			heltal [i] = (int) (Math.random()*10);
		}
		System.out.println(Arrays.toString(heltal));
		
		for(int i = 0; i < 10; i++) {
			if(i%2 == 0) {
				System.out.print(heltal[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Alla jämna: ");
		for(int i = 0; i < 10; i++) {
			if(heltal[i]%2 == 0) {
				System.out.print(heltal[i] + " ");
			}
		}
		
		System.out.println();
		System.out.print("Baklänges: ");
		for(int i = 10; i > 0; i--) {
			System.out.print(heltal[i-1] + " ");
		}
		System.out.println();
		
		System.out.print("Första: " + heltal[0] + "\nSista: " + heltal[9]); 
	}

}
