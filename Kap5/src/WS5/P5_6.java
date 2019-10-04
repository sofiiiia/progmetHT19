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
public class P5_6 {
	
	public static int CountVowels(String str) {
		
		int countVowels = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i)== 'A'|| str.charAt(i)== 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' ||
					str.charAt(i) == 'U' || str.charAt(i) == 'y' || str.charAt(i) == 'Y' ||
					str.charAt(i) == 'å' || str.charAt(i) == 'Å' || str.charAt(i) == 'ä' || str.charAt(i) == 'Ä' || 
					str.charAt(i) == 'ö' || str.charAt(i) == 'Ö') {
				countVowels ++;	
			}
		}
		return countVowels;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett ord");
		String str= input.nextLine();
		
		System.out.println("Antal vokaler: " + CountVowels(str));
		input.close();
	}
	
	

}
