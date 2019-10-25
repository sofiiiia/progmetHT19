/**
 * 
 */
package soag01;

import java.util.Scanner;

/**
 * @author Sofia Ågren
 * @version 2019-10-23
 *
 */
public class P8_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hur många liter per mil drar bilen?: ");
		float literMil = input.nextFloat();
		System.out.println("Hur många liter vill du tanka?: ");
		float gas = input.nextFloat();	
		System.out.println("Hur långt ska du köra?: ");
		float distance = input.nextFloat();	
		Car car = new Car(literMil);
		
		car.addGas(gas);
		car.drive(distance);
		System.out.println("Kvar i tanken: " + car.getGasLevel() + " Liter");
		
		input.close();
	}

}
