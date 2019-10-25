/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * @author Sofia Ågren
 * @version 2019-10-25
 * 
 *
 */
public class P8_14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = input.nextDouble();
		System.out.println("Enter the heigth: ");
		double height = input.nextDouble();
		System.out.println("The volume from Geometry is: " + Geometry.cylinderVolume(radius, height));
		System.out.println("The surface area from Geometry is: " + Geometry.cylinderSurfaceArea(radius, height));
		SodaCan sodaCan = new SodaCan(height, radius);
		System.out.println("The volume from Sodacan is: " + sodaCan.getVolume());
		System.out.println("The surface area from Sodacan is: " + sodaCan.getSurfaceArea());
		input.close();
	}

}
