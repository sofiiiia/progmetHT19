/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia �gren)
 * @version 2019-09-09
 * Testprogram f�r utmatning
 */
public class WhatsYourName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in ditt f�rnamn:");
		String Name = scan.nextLine();
		
		System.out.print("Skriv in ditt efternamn:");
		String Lastname = scan.nextLine();
		
		System.out.print("skriv din �lder");
		int Age = scan.nextInt();
		scan.close();
		
		System.out.printf("Hej mitt namn �r %s %s min �lder �r %d", Name, Lastname, Age);
	}
}
