/**
 * 
 */
package kap7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Sofia Ågren	
 * @version 2019-10-14
 *
 */
public class P7_1 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		File fileName = new File("Hello.txt");
		PrintWriter printWriter =  new PrintWriter("Hello.txt");
		printWriter.println("Hello world!");
		printWriter.close();
		fileName = new File("Hello.txt");
		Scanner in = new Scanner(fileName);
		
		while(in.hasNextLine()) {
			String fileRow = in.nextLine();
			System.out.println(fileRow);
			}
		in.close();
		

		
		
		
		
		
		
		
		
	}

}
