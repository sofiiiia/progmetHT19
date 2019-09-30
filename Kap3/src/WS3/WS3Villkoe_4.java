/**
 * 
 */
package WS3;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-16
 *
 */
public class WS3Villkoe_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Skriv din ålder");
		int age = input.nextInt();
		input.close();
		String testResult = (age < 13)? "Barn" : "Inte barn";
		System.out.println(testResult);
	}

}
