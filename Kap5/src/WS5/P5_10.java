/**
 * 
 */
package WS5;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-10-02
 *
 */
public class P5_10 {

	/**
	 * @param args
	 */
	public static Scanner scan = new Scanner(System.in);
	public static double readDouble(String promt) {
		
		System.out.println(promt);
		double value = 0.0; 
		value = scan.nextDouble();
		return value;
	}
	
	public static void main(String[] args) {

		double salary = readDouble("Please enter your salary: ");
		double precentageRaise = readDouble("What precentage would you like?: ");
		scan.close();
		
		double newSalary = salary + (salary *  precentageRaise/100);
		System.out.println("Your new salary is: " + newSalary);
	}

}
