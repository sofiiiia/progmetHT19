/**
 * 
 */
package soag01;

import java.util.Scanner; 

/**Testprogram
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-0913
 *
 */
public class P2_17 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first time");
		int firstTime = input.nextInt();
		
		System.out.println("Please enter the second time");
		int secondTime = input.nextInt();
		
		int hourFirstTime = (firstTime/100)*60;
		int hourSecondTime = (secondTime/100)*60;
		int
		
		int minuteFirstTime = firstTime%100;
		int minuteSecondTime = secondTime%100;
		
		System.out.println((hourSecondTime-hourFirstTime)+" hours " + (minuteSecondTime-minuteFirstTime));
		
		
				
		
		
		
		
		
		
		input.close(); 

	}

}
