/**
 * 
 */
package WS3;

import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-16
 *
 */
public class P3_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temperatur = 0;
		double meter = 0;
		System.out.println("Skriv C för Celsius eller F för Fahrenheit");
		String grader = input.next();
		if (grader.equalsIgnoreCase("C")) {
			System.out.println("Skriv en temperatur i Celsius");
		} else {
			System.out.println("Skriv temperatur i Fahrenheit");
		}
		if (input.hasNextDouble()) {
			temperatur = input.nextDouble();
		}
		if (grader.equalsIgnoreCase("C")) {
			System.out.println("Skriv höjden i meter");
		} else {
			System.out.println("Skriv höjden i feet");
		}
		if (input.hasNextDouble()) {
			meter = input.nextDouble();
		}
		/*
		 * } else { System.out.println("Error inte ett tal"); }
		 */

		if (grader.equalsIgnoreCase("F")) {
			temperatur = ((temperatur - 32)/1.8);
			meter = (meter / 3.281);
		}
		double boilingTemp = (100 - (meter / 300));

		System.out.printf("Grader i Celsius är %2.2f och ", temperatur);
		if (temperatur <= 0) {
			System.out.println("is");
		} else if (temperatur > 0 && temperatur < boilingTemp) {
			System.out.println("flytande");
		} else {/* if(temperatur > 100) { */
			System.out.println("gas");
		}

		input.close();

	}

}
