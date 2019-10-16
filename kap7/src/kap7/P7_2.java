/**
 * 
 */
package kap7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Sofia Ågren
 * @version 2019-10-14
 *
 */
public class P7_2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Name the input file name:");
		String input = scan.nextLine();
		System.out.println("Name the output file name:");
		String output = scan.nextLine();		
		int counter = 1;
		
		File file = new File(input);
		try {
			FileWriter fileWriter = new FileWriter(output, true);
			BufferedWriter buffWriter = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(buffWriter);
			Scanner in = new Scanner(file);
			while(in.hasNextLine()) {
				printWriter.println("/*" + counter++ + "*/" + in.nextLine());
			}
			printWriter.close();
			in.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("Error check file name.");
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		finally {
			scan.close();
		}
		
		
	}

}
