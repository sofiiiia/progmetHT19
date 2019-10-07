/**
 * 
 */
package WS6;

import java.util.Arrays;

/**
 * @author 19soag01 (sofia Ågren)
 * @version 2019-10-07
 *
 */
public class P6_2 {

	/**
	 * @param args
	 */
	public static int[] byteAvFörstaOchSista(int[] heltalArray) {
		
		int första = heltalArray [0];
		heltalArray [0] = heltalArray [heltalArray.length-1];
		heltalArray [heltalArray.length-1] = första;
		System.out.print(heltalArray [0] + " " + heltalArray [heltalArray.length-1] + " ");
		return heltalArray;
		
	}
	
	public static int[] flyttaHöger(int[] arr) {
		
		int sista  = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i-- ) {
			arr[i] = arr[i-1];
		}
		arr[0] = sista;
		return arr;
	}
	
	public static void main(String[] args) {
		int[] tal = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(tal));
		int[] swopped = byteAvFörstaOchSista(tal.clone());
	
		System.out.println(Arrays.toString(swopped));
		
		System.out.println(Arrays.toString(flyttaHöger(tal.clone())));
		
	}

}
