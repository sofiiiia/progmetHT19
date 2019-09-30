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
public class P2_7 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv radien");
		double x = input.nextDouble();
		
		System.out.println(x*x*Math.PI);
		System.out.println(2*Math.PI*x);
		System.out.println(4*Math.PI*x*x);
		System.out.println((4/3)*Math.PI*x*x*x);
		
		input.close();
		
				
	}

}
