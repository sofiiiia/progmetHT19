/**
 * 
 */
package soag01;

import java.util.Scanner;

/**Testprogram
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-13
 *
 */
public class P2_5 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.print("Skriv in två tal: ");
		Scanner scan = new Scanner(System.in);
		double x = scan.nextInt();
		double y = scan.nextInt();
		System.out.printf("Sum:		%.1f%n",x+y);
		System.out.printf("Differnce:	%.1f%n" ,x-y);
		System.out.printf("Product: 	%.1f%n" ,x*y);
		System.out.printf("Average: 	%.1f%n" ,(x+y)/2);
		System.out.printf("Distence: 	%.1f%n" ,Math.abs(x-y));
		System.out.printf("Maximum: 	%.1f%n" ,Math.max(x, y));
		System.out.printf("Minimum: 	%.1f%n" ,Math.min(x, y));
	
		scan.close();
	}

}
