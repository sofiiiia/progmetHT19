/**
 * 
 */
package soag01;
import java.util.Scanner;

/**Testprogram
 * 
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-09-13
 *
 */
public class P2_4 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.print("skriv in två tal: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println((x+y)/2);
		System.out.println(Math.abs(x-y));
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		
		scan.close();
		
	}
}
