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
	public static int[] byteAvFörstaOchSista(int[] array) {
		
		int första = array [0];
		array [0] = array [array.length-1];
		array [array.length-1] = första;
		System.out.print(array [0] + " " + array [array.length-1] + " ");
		return array;
		
	}
	
	public static int[] flyttaHöger(int[] array) {
		
		int sista  = array[array.length-1];
		for(int i = array.length-1; i > 0; i-- ) {
			array[i] = array[i-1];
		}
		array[0] = sista;
		return array;
	}
	//d
	public static int[]  swap(int[] array) {
		
		int[] temp = new int[array.length];
		temp[0] = array[0];
		temp[array.length-1] = array[array.length-1];
		for(int i= 1; i < array.length-1; i++) {
			if(array[i] < array[i+1]) {
			 temp[i] = array[i+1];
				}else {
					temp[i] = array[i];
				}
		}
			return temp;
	}
	
	//e
	public static int[] removeMiddle(int[] array) {
		
		int[] temp;
		int counter = 0;
		if(array.length%2 != 0) {
			temp = new int[array.length-1];
			for(int i = 0; i < array.length; i++) {
				if(i != (array.length)/2) {
					temp[counter++] = array[i];
				}
			}
		}else {
			temp = new int[array.length-2];
			for(int i = 0; i < array.length; i++) {
				if(i != (array.length)/2 && i != ((array.length)/2)-1) {
					temp[counter++] = array[i];
				}
			}
		}
		return temp;
	}
	
	//h
	public static boolean sorted(int[] array) {
		
		boolean sorted = false;
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] <= array[i+1]) {
				sorted = true;
				}else {
					return false;
				}
		}
		return sorted;
	}
	public static void main(String[] args) {
		int[] tal = {1,2,3,4,5};
		System.out.println(Arrays.toString(tal));
		int[] swopped = byteAvFörstaOchSista(tal.clone());
		System.out.println(Arrays.toString(swopped));
		System.out.println(Arrays.toString(flyttaHöger(tal.clone())));
		System.out.println(Arrays.toString(swap(tal.clone())));
		System.out.println(Arrays.toString(removeMiddle(tal.clone())));
		System.out.println((sorted(tal.clone())));
	}

}
