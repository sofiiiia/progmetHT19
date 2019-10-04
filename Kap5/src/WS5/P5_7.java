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
public class P5_7 {
	
	public static int countWords(String str) {
		
		str = str.trim();
		int countWords = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				countWords++;
			}	
		}
		return countWords;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv en mening:");
		String str = input.nextLine();
		System.out.println("Antal ord är: " + countWords(str));
		input.close();

	}

}
