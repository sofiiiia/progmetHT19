/**
 * 
 */
package WS5;

import java.util.Scanner;

/**
 * @author (sofia Ågren, Anel Duisemaliyeva)
 *
 */
public class ParProg_4 {

	/**
	 * @param args
	 */
	public static Scanner in = new Scanner(System.in);
	static double summa = 0.0;
	static double största = 0.0;
	static double minsta = 0.0;
	static boolean avsluta = false;

	public static void kollarMinOchMax() {

		boolean första = true;

		while (!avsluta) {
			while (!avsluta && !in.hasNextDouble()) {
				String s = in.next();
				if ("stop".equals(s.trim().toLowerCase()) || "avsluta".equals(s.trim().toLowerCase())) {
					System.out.println("Avslutar");
					avsluta = true;
				} else {
					System.out.println("Fel, mata in ett nytt tal");
					System.out.print("Mata in ett tal: ");
				}
			}
			if (!avsluta) {
				double tal = in.nextDouble();
				summa += tal;
				if (tal < minsta || första)
					minsta = tal;
				if (tal > största || första)
					största = tal;
				första = false;	
				System.out.print("Mata in ett tal (eller Stop eller Avsluta): ");
				System.out.printf("Summa %f, Min %f Max %f%n", summa, minsta, största);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Mata in flyttal tills du skriver in Stop eller Avsluta");
		System.out.println("För varje tal skriver du ut den accumulativa summan");
		System.out.println("samt det så långt minsta och största talet");
		System.out.print("Mata in ett tal: ");
		kollarMinOchMax();
	
		System.out.printf("Summa %f, Min %f Max %f%n", summa, minsta, största);
		System.out.println("Tack för att du använt programmet");

		in.close();
		System.exit(0);
	}
}