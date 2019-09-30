/**
 * 
 */
package soag01;

import java.util.Scanner;

/**Testprogram
 * 
 * @author 19soag01
 * @version 2019-09-11
 *
 */
public class P2_13 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer between 1,000 and 999,999: ");
		
		String integer = input.nextLine();
		integer = integer.trim();
		int length = integer.length();
		String start = integer.substring(0, length - 4);
		String end = integer.substring(length - 3, length );
		
		System.out.println(start + end);
		
		input.close();
	}

}
