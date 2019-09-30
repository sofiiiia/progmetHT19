/**
 * 
 */
package WS4;

/**Program som skriver ut summan av alla kvadrater upp till 100.
 * 
 * @author 19soag01
 * @version 2019-09-23
 *
 */
public class P4_1b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 1;
		int summa = 0;
		
		while(i <=100) {
			summa += i*i;
			i++;
		}
		System.out.print(summa);
		
	}

}
