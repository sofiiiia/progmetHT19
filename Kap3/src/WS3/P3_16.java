/**
 * 
 */
package WS3;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 *@version 2019-09-16
 */
public class P3_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Write three names");
		String name1 = input.next();
		String name2 = input.next();
		String name3 = input.next();
		
		if(name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0)
		{
			System.out.println(name1);
			if(name2.compareTo(name3) < 0)
			{
				System.out.println(name2);
				System.out.println(name3);
			}else {
				System.out.println(name3);
				System.out.println(name2);
			}
		}
		else if(name2.compareTo(name1) < 0 && name2.compareTo(name3)< 0)
		{
			System.out.println(name2);
			if(name1.compareTo(name3) < 0)
			{
				System.out.println(name1);
				System.out.println(name3);
			}else {
				System.out.println(name3);
				System.out.println(name1);
			}
		}else {
			System.out.println(name3);
			if(name1.compareTo(name2) < 0) 
			{	
				System.out.println(name1);
				System.out.println(name2);
			}else {
				System.out.println(name2);
				System.out.println(name1);
			}
				
		}
		input.close();
	}

}
