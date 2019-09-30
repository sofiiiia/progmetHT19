/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-09
 * Testprogram för utmatning
 */
public class WhatsYourName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in ditt förnamn:");
		String Name = scan.nextLine();
		
		System.out.print("Skriv in ditt efternamn:");
		String Lastname = scan.nextLine();
		
		System.out.print("skriv din ålder");
		int Age = scan.nextInt();
		scan.close();
		
		System.out.printf("Hej mitt namn är %s %s min ålder är %d", Name, Lastname, Age);
	}
}
