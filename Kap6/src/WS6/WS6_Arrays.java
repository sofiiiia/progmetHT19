/**
 * 
 */
package WS6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author 19soag01 (Sofia Ågren)
 * @version 2019-10-07
 *
 */
public class WS6_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// enkel heltals array
		
		int [] heltalsArray = new int [5];
		//int [] heltalsArray = new int [6];//nu funkar det att göra som rad 34
		heltalsArray [0] = 1;
		heltalsArray [1] = 2;
		heltalsArray [2] = 3;
		heltalsArray [3] = 4;
		heltalsArray [4] = 5;
		
			System.out.println(Arrays.toString(heltalsArray));
		
		for(int i = 0; i < 5; i++) {
			heltalsArray[i] = i + 1;
			//heltalsArray[i+1] = i + 1; //gör ej så om du inte ändrat som till rad 23
		}
		System.out.println(Arrays.toString(heltalsArray));
		
		//enkel double array
			
		double [] enkelDoubleArray = new double [5];
		
		for(int i = 0; i < 5; i++) {
			enkelDoubleArray [i] = i + 1;
			System.out.println(enkelDoubleArray[i]);
		}
			
		//boolean array
		
		boolean [] booleanArray = new boolean [5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println(booleanArray[i]);
		}
		System.out.println("Ändrar i Arrayen");
		
		booleanArray[0] = true;
		booleanArray[2] = true;
		
		System.out.println("Skriver ut hur arrayen " + "ser ut efter ändringen");
		
		System.out.println(Arrays.toString(booleanArray));
		
		//allternativ initziering av en intArray
		
		int [] nyArray = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(nyArray));
	
		
		//stringArray
		
		String [] stringArray = new String [5];
		
		System.out.println(Arrays.toString(stringArray));
		
		stringArray [2] = "bra";
		stringArray [3] = "va";
		stringArray [4] = "?";
		
		System.out.println(Arrays.toString(stringArray));
		
		
		//array av Stringobjekt
		
		String [] nyArr = {"detta","är", "en", "String", "Array"};
		
		System.out.println(Arrays.toString(nyArr));
		
		
		//Dynamisk Array, behöver ej bestämma längd
		
		ArrayList<String> minArrayList = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			minArrayList.add(String.valueOf(i));
			System.out.println(minArrayList.get(i));
		}
		
		System.out.println("Längden är: " + minArrayList.size());
		
		
		//for each loop
		
		ArrayList<Integer> minArrayList2 = new ArrayList<>();
		
		for(int i = 0; i <5; i++) {
			minArrayList2.add(i);
		}
		for(Integer integer : minArrayList2) {
			System.out.println(integer);
		}
		
		//inmatning
		
		Scanner input =new Scanner(System.in);
		ArrayList<Integer> minArrayList3 = new ArrayList<>();
		
		for(int i = 0; i <5; i++) {
			System.out.println("mata in ett tal:");
			minArrayList3.add(input.nextInt());
		}
		for(Integer integer : minArrayList3) {
			System.out.println(integer);
		}
		
		input.close();
		
		
	}

}
