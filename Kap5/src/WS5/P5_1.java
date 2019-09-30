/**
 * 
 */
package WS5;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-30
 *
 */
public class P5_1 {
	
	public static double smallest(double x, double y, double z) {
		if(x<y && z>x) {
			return x;
		}if(y<x && z>y) {
			return y;
		}if(z<x && y>z) {
			return z;
		}
		return 0.0;
	}
	
	public static double average(double x, double y, double z) {
		double average = (x+y+z)/3;
		return average;
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("skriv tre tal");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		input.close();
		System.out.println("Smallest: "+ smallest(x,y,z));
		System.out.println("Average: " + average(x,y,z));
	}

}
