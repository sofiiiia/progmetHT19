/**
 * 
 */
package WS4;

import java.util.Scanner;



/**Programgenomgån whileLoopar
 * 
 * 
 * 
 * @author 19soag01 (sofia Ågren)
 * @version 2019-09-23
 *
 *
 *
 */
public class WS4_loopar2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("mata in ett tal: ");
		int indata = in.nextInt();
		
		int summa = 0;
		while (indata != 0 ) {
			System.out.println(indata);
			summa += indata;
			
			System.out.print("Mata in ett tal: ");
			indata = in.nextInt();
			
		}
		
		/*summa = 0;							//går att göra så här också
		while ((indata = in.nextInt()) != 0 ) {
			System.out.println(indata);
			summa += indata;
			
			System.out.print("Mata in ett tal: ");
			
		}*/
		
		System.out.printf("Summan är %d%n", summa);
		
		in.close();
		

	}

}
