/**
 * 
 */
package soag01;

/**
 * @author Sofia Ågren
 * @version 2019-10-23
 *
 */
public class P8_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TallyCounter counter = new TallyCounter();
		counter.count();
		System.out.println(counter.getValue());
		counter.undo();
		counter.undo();
		counter.undo();
		System.out.println(counter.getValue());
		
	}

}
