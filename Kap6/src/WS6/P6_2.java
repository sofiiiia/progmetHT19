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
	public static int [] byteAvFörstaOchSista(int[] heltalArray) {
		
		int första = heltalArray [0];
		heltalArray [0] = heltalArray [heltalArray.length-1];
		heltalArray [heltalArray.length-1] = första;
		System.out.print(heltalArray [0] + " " + heltalArray [heltalArray.length-1] + " ");
		return heltalArray;
		
	}
	
	public static int [] flyttaHöger(int [] arr) {
		
		int första  = arr [0];
		for(int i = 1; i < arr.length; i++ ) {
			arr[i-1] = arr[i];
		}
		arr [arr.length-1]= första;
		return arr;
	}
	
	public static void main(String[] args) {
		int [] tal = {1,2,3,4,5,6,7,8,9};
		int [] nyArray = byteAvFörstaOchSista(tal);
	
		System.out.println(Arrays.toString(nyArray));
		
		
		
	}

}
