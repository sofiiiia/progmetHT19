/**
 * 
 */
package WS3;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-18
 *
 */
public class P3_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{ 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett decimaltal");
		float number1 = input.nextFloat();
		System.out.println("Skriv ett nytt decimaltal");
		float number2 = input.nextFloat();
		final float ACCEPT_DIFF_FLOAT = 0.01f; //pga avrundningsfel 
		
		if(Math.abs(number1 - number2) < ACCEPT_DIFF_FLOAT) {
			System.out.println("Dom är lika upp till två decimaler");
		} else {
			System.out.println("Dom är olika");
		}
		
		input.close();

	}

}
