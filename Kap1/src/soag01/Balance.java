/**
 * 
 */
package soag01;

/**
 * Testprogram för utmatning
 * 
 * @author 19soag01
 * @version 2019-09-09
 */
public class Balance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double balance = 1000.0;
		
		System.out.print(balance );
		
		balance = balance + (balance * 0.05);
		System.out.print(balance);
		
		balance = balance * 1.05;
		System.out.println(balance);
		
		balance = balance * 1.05;
		System.out.println(balance);
			

	}

}
