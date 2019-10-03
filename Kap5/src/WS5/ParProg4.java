/**
 * 
 */
package sofia;

import java.util.Scanner;

/**
 * @author Sofia
 *
 */
public class ParProg_4 {

	/**
	 * @param args
	 */
	public static Scanner in = new Scanner(System.in);
	static double summa =0.0;
	static double största = 0.0;
	static double minsta = 0.0;

	public static double tal(double a, double b, double c) {
		double summa = a + b + c;
		double största = Math.max(Math.max(a, b), c);
		double minsta = Math.min(Math.min(a, b), c);
		return 0.0;
		
	}	
	public static boolean avsluta(String str) {
		String s = in.next();
		boolean första = true;
		boolean avsluta = false;
		while (!avsluta) {
			if (!avsluta) {
				double tal = in.nextDouble();
				summa += tal;
				if (tal < minsta || första)
					minsta = tal;
				if (tal > största || första)
					största = tal;
				första = false;
			}
		}if ("Stop".equals(s.trim()) || "Avsluta".equals(s.trim())) {
			System.out.println("Avslutar");
			boolean avslutar = true;
			} else {
				System.out.println("Fel, mata in ett nytt tal");
				System.out.print("Mata in ett tal: ");
		}
		while ( ! avsluta && ! in.hasNextDouble()) {
		}
		return avsluta;
	}
	public static void main(String[] args) {
		System.out.println("Mata in flyttal tills du skriver in Stop eller Avsluta");
		System.out.println("För varje tal skriver du ut den accumulativa summan");
		System.out.println("samt det så långt minsta och största talet");
		System.out.print("Mata in ett tal: ");
		System.out.print("Mata in ett tal (eller Stop eller Avsluta): ");
		System.out.printf("Summa %f, Min %f Max %f%n", summa, minsta, största);
		System.out.printf("Summa %f, Min %f Max %f%n",summa,minsta,största);
		System.out.println("Tack för att du använt programmet");
		
		in.close();
		System.exit(0);
		}
	} 
