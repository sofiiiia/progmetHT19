/**
 * 
 */
package soag01;

import java.util.Scanner;

/**Exempelprogram
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-11
 * 
 *
 */
public class MittExempel2 {
	private static final int ETTHELTAL = 5;
	private static final double ETTFLYTTAL = 12.34e2;
	private static final String ENSTRÄNG = "abc"+ "";
	private static final char ETTTECKEN = 'a';
	private static final boolean ETTSANNINGSVÄRDE = false;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println(ETTHELTAL+ETTFLYTTAL);
		System.out.println(ENSTRÄNG);
		System.out.println(ETTTECKEN);
		System.out.println(ETTSANNINGSVÄRDE);
		
		System.err.println("text här"); //felmeddelande eller varningar
		
		System.out.print("skriv ett heltal: ");
		int inmatatTal = input.nextInt(); input.nextLine();
		System.out.print("skriv ett ord: ");
		String inmatatOrd = input.next(); input.nextLine();
		System.out.print("skriv ett flyttal: ");
		double inmatatFlyttal = input.nextDouble(); input.nextLine();
		System.out.println("skriv en rad med mellanslag");
		String aaa = input.nextLine();
		
//		System.out.println(inmatatTal + " " + inmatatOrd + " "
//				+ " " + inmatatFlyttal);
		
		System.out.println(aaa);
		
		input.close();
		System.exit(0); 

	}

}
