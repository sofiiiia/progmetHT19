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
public class P5_2 {
	
	public static boolean allTheSame(double x, double y, double z) {
		boolean allTheSame = (x == y && x == z && y == z); 
		return allTheSame;
		
	}
	
	public static boolean allDiffrent(double x, double y, double z) {
		boolean allDiffrent = (x != y && x != z && y != z);
		return allDiffrent;
	}

	public static boolean sorted(double x, double y, double z) {
		if(x<=y) { 
			if(y<=z) {
				return true;
			}else return false;
		}
		else return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv tre tal: ");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		input.close();
		System.out.println("All the same: " + allTheSame(x,y,z));
		System.out.println("All diffrent: " + allDiffrent(x,y,z));
		System.out.println("Sorted: " + sorted(x,y,z));

	}

}
