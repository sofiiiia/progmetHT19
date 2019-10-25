/**
 * 
 */
package soag01;

/**
 * @author Sofia
 *
 */
public class P8_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bug bugsy = new Bug(10);
		bugsy.move();
		bugsy.move();
		bugsy.move();
		bugsy.turn();
		bugsy.move();
		bugsy.move();
		System.out.println("The position is: " + bugsy.getPosition());
	}
}
