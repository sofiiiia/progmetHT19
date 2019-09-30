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
public class P3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv en heltal");
		int number = input.nextInt();
		
		if(number < 0) {
			System.out.println("Negativt");
		}else if(number > 0) {
			System.out.println("Positivt");
		}else {
			System.out.println("Noll");
		}
		
			
		input.close();

	}

}
