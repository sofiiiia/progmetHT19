/**
 * 
 */
package soag01;

/**
 * @author Sofia Ågren
 * @version 2019-10-25
 *
 */
public class P8_egen1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dice dice = new Dice();
		dice.roll();
		System.out.println("The dice gave you a: " + dice.getValue());
	}

}
