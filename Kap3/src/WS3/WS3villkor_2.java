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
public class WS3villkor_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		
		System.out.println("Skriv din ålder");
		int age = input.nextInt();
		input.close();
		
		if(age < 1 ){
			System.out.println("du är ett spädbarn");
		}else if(age < 13 ){
			System.out.println("Du är ett barn");
		}else if(age < 20){
			System.out.println("Du är tonåring");
		}else if(age < 65){
			System.out.println("Du är vuxen");
		}else{
			System.out.println("Du är pensionär");
		}
				
				
		System.out.printf("Din ålder är: %d", age);
	}

}
