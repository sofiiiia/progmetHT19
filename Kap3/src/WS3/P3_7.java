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
public class P3_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv tre heltal");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		if(number1 <= number2 && number2 <= number3) {
			System.out.println("I ordning");
		}else if(number1 >= number2 && number2 >= number3) {
			System.out.println("I ordning"); //baklänges
		}else {
			System.out.println("Inte i ordning");
		}
		
		input.close();
	}

}
