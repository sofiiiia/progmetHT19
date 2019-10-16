/**
 * 
 */
package WS7;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author 19soag01 Sofia Ågren
 * @version 2019-10-14
 *
 */
public class FilePrintWithTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ange filens namn:");
		String fileName = scan.nextLine();
		
		
		try{
			FileWriter fileWriter = new FileWriter(fileName, true);
			BufferedWriter buffWriter = new BufferedWriter(fileWriter);
			PrintWriter printWriter = new PrintWriter(buffWriter);
			//PrintWriter printWriter = new PrintWriter(fileName);
			printWriter.println("Detta är första raden");
			printWriter.println("Detta är andra raden");
			printWriter.close();
		}
		catch(FileNotFoundException e){
			System.err.println("Konrtrollera filnamnet "); //err istället för out gör att texten blir röd.
		}
		catch(IOException e) {
			System.err.println(e.getMessage());
		}
		finally {
			scan.close();
			}
		}

}
