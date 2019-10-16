/**
 * 
 */
package WS7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-10-14
 *
 */
public class SimplestFileWriterEver {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ange filens namn:");
		String name = scan.nextLine();
		scan.close();
		
		PrintWriter printWriter = new PrintWriter(name);
		printWriter.println("Detta är första raden");
		printWriter.println("Detta är andra raden");
		printWriter.close();
	}

}
