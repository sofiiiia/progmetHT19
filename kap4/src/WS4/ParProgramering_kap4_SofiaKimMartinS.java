/**
 * 
 */
package WS4;



/**
 * @author 19soag01 (Sofia, Kim, Martin Staffas)
 * @version 2019-09-25
 *
 */
public class ParProgramering_kap4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {

				if (j < i) {
					System.out.print(j + ",");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
		for(int k = 9; k >= 1; k--) {
			for(int l = 1 ; l <= k ;++l) {
				if (l<k) {
					System.out.print(l+ ",");
				}
				else	System.out.print(l);
				
			}
			System.out.println();
		}
	}
}
