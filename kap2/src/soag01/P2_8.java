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
public class P2_8 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("skriv längden");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		System.out.println(2*x+2*y);
		System.out.println(Math.sqrt(x*x+y*y));
		
		input.close();
	}

}
