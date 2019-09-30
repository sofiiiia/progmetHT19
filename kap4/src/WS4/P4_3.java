/**
 * 
 */
package WS4;

import java.util.Scanner;

/**Tre olika program som skriver ut endast stora bokstäver, 
 * skriver ut varannan bokstav och som byter ut vokaler med 
 * understräck och sedan räknar dem.
 *  
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-25
 *
 */
public class P4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = "";
		
		System.out.print("Skriv en mening: ");
		text = input.nextLine();
		
		for(int i = 0; i < text.length(); i++) {
			if(Character.isUpperCase(text.charAt(i))) {
				System.out.print(text.charAt(i));
			}
		}
		System.out.println();
		for(int i = 0; i < text.length(); i++) {
			if(i%2 == 0) {
				System.out.print(text.charAt(i));
			}
		}
		System.out.println();
		
		String NyText = "";
		int AntalVokaler = 0;
		for(int i = 0; i < text.length(); i++) {
			if(text.charAt(i) == 'a'|| text.charAt(i)== 'A'|| text.charAt(i)== 'e' || text.charAt(i) == 'E' || text.charAt(i) == 'i' || text.charAt(i) == 'I' || 
					text.charAt(i) == 'o' || text.charAt(i) == 'O' || text.charAt(i) == 'u' || text.charAt(i) == 'U' || text.charAt(i) == 'y' || text.charAt(i) == 'Y' ||
					text.charAt(i) == 'å' || text.charAt(i) == 'Å' || text.charAt(i) == 'ä' || text.charAt(i) == 'Ä' || text.charAt(i) == 'ö' || text.charAt(i) == 'Ö') {
				NyText += '_';
				AntalVokaler ++;
		
			}else {
				NyText += text.charAt(i);
			}
		}
		System.out.print(NyText + " " + "Antal vokaler är: " + AntalVokaler);
		
		
		input.close();
	}

}
