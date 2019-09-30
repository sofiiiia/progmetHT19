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
public class WS3Villkor_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Skriv din ålder");
		int age = input.nextInt();
		input.close();
		
		switch(age) {
			case 1: 	{System.out.println("Du är ett spädbarn");break;}	
			case 13: 	{System.out.println("Du är tonåring");break;}
		
			default: {System.out.println("obestämt!");}
		
		System.out.printf("Din ålder är %d", age);
	}
		

	}
}
