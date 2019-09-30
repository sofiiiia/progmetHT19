/**
 * 
 */
package WS4;

/**Program som skriver ut multiplikationstabellen
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-27
 *
 */
public class P4_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print(i*j + "\t ");
			}
			System.out.println();
		}
	}

}
