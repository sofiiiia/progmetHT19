/**
 * 
 */
package WS7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author 19soag01 Sofia Ågren
 * @version 2019-10-14
 *
 */
public class SimplestFileReadEver {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		File fileObject = new File("SimpleWriteTest.txt");
		Scanner fileScan = new Scanner(fileObject);
		
		while(fileScan.hasNextLine()) {
			String fileRow = fileScan.nextLine();
			System.out.println(fileRow);
			
		}
		fileScan.close();
	}

}
