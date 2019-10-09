/**
 * 
 */
package WS6;


import java.util.Scanner;

/**
 * @author 19soag01 (sofia Ågren)
 * @version 2019-10-09
 *
 */
public class P6_7 {

	/**
	 * @param args
	 */
	public static int[] readInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Write 10 numbers & watch them come back in reverse: ");
		 
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i]= input.nextInt();
		}
		input.close();
		return arr;
		
	}
	public static int[] reverse(int[] array) {
		System.out.println("Reverse: ");
		for(int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		return array;
	}
	public static void main(String[] args) {
	reverse(readInput());
	}

}
