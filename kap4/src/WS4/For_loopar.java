/**
 * 
 */
package WS4;





/**Programgenomgån forWhileLoopar
 * 
 * 
 * 
 * @author 19soag01 (sofia Ågren)
 * @version 2019-09-23
 *
 *
 *
 */
public class For_loopar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.out.println("första femmans tabell");
		int stegräknare = 0; 
		
		while ( stegräknare <= 4) {
			System.out.printf("%d * 5= %d%n",
					stegräknare, stegräknare*5);
			//stegräknare = stegräknare + 5;
			//stegräknare += 1;	
			 stegräknare++;
			}
		
		System.out.println("andra femmans tabell");
		for (int i = 0; i <= 5; i++) {
			System.out.printf("%d * 5= %d%n",
					i, i*5);
		}
		
	
		

	}

}
