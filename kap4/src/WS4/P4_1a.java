/**
 * 
 */
package WS4;

/**Ett program som räknar summan av alla jämna nummer från
 * 2 till och med 100.
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-23
 * 
 *
 */
public class P4_1a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 0;
		int summa = 0;
		
		while (i <= 100) {
			if(i%2 == 0) {
				summa += i;
			}
			
			i++;
		}
		System.out.print(summa);
		

	}

}
