/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * Testprogram för utmatning
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-09
 */
public class HelloWorld 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("mata in lite text: ");
		String text1 = scan.nextLine(); 
		
		System.out.print("mata in ett heltal: ");
		int tal1 = scan.nextInt();
		scan.close();
		
	
		
		//System.out.print(text1 + " world! " + (tal1 + tal2));
		
		System.out.printf("Hejsan på er. %s var texten siffren var %d",text1, tal1);
		
	}

}





