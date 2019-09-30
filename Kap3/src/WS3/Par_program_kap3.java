/**
 * 
 */
package WS3;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia & Kim)
 * @version 2019-09-18
 * 
 *
 */
public class Par_program_kap3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv temperaturen");
		double 	temp1 = input.nextDouble(),
				temp2 = input.nextDouble(),
				temp3 = input.nextDouble(),
				temp4 = input.nextDouble(),
				temp5 = input.nextDouble(),
				temp6 = input.nextDouble(),
				temp7 = input.nextDouble(),
				temp8 = input.nextDouble(),
				temp9 = input.nextDouble(),
				temp10 = input.nextDouble();
		
		int counter = 0;
				
		if(temp1 >= 38.0) {
			counter++; 
		} 
		
		if(temp2 >= 38.0) {
			counter++;
		}
		
		if(temp3 >= 38.0) {
			counter++; 	
		} 
		
		if(temp4 >= 38.0) {
			counter++;
		}
			
		if(temp5 >= 38.0) {
			counter++;
		}
		
		if(temp6 >= 38.0) {
			counter++;
		}
		
		if(temp7 >= 38.0) {
			counter++;
		}
		
		if(temp8 >= 38.0) {
			counter++;
		}
		
		if(temp9 >= 38.0) {
			counter++;
		}
		
		if(temp10 >= 38.0) {
			counter++;
		}
		if(counter < 2) {
			System.out.println("Simma lungt, du har knappt feber vekling!");
		} else {
			if(counter >= 2 && counter <= 4) {
				System.out.println("Oj då, ta två magnecyl");
			} else if(counter >= 5 && counter <= 6) {
				System.out.println("Oj då, ta tre magnecyl");
			} else if(counter >= 7 && counter <= 9) {
				System.out.println("Ta en stor congac");
			} else {
				System.out.println("Ring 112 och håll tummarna!");
			}
		}
		input.close();
	}
	
}
