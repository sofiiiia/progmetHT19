/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * @author Sofia
 *
 */
public class P8_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter height value: ");
		float height = input.nextFloat();
		System.out.println("Enter radius value: ");
		float radius = input.nextFloat();		
		SodaCan sodaCan = new SodaCan(height, radius);
		
		System.out.println("Surface area:" + " " + sodaCan.getSurfaceArea());
		System.out.println("Volume:" + " "  + sodaCan.getVolume());
		
		
		input.close();
	}

}
