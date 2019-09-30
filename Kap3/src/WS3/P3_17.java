/**
 * 
 */
package WS3;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-18
 *
 */
public class P3_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in en tid i militärform (ex 1234)");
		int time1 = input.nextInt();
		System.out.println("Skriv in en tid i militärform (ex1234)");
		int time2 = input.nextInt();
		int hour1 = time1/100;
		int hour2 = time2/100;
		int minute1 = time1%100;
		int minute2 = time2%100;
		
		if(hour1 > hour2) {
			System.out.println("Tid 1 är efter tid 2");
		} else if(hour1 < hour2) {
			System.out.println("Tid 2 är efter tid 1");
		} else {
			if(minute1 > minute2) {
				System.out.println("Tid 1 är efter tid 2");
		} else if(minute1 < minute2) {
			System.out.println("Tid 2 är efter tid 1");
		} else {
			System.out.println("Tiderna är lika");
			
		}
		}
		input.close();
		

	}

}
