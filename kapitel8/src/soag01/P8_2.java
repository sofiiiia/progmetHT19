/**
 * 
 */
package soag01;

/**
 * @author Sofia Ågren
 * @version 2019-10-23
 *
 */
public class P8_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TallyCounter counter = new TallyCounter();
		counter.setLimit(5);
		counter.count();
		counter.count();
		counter.count();

		System.out.println(counter.getValue());
		
		counter.count();
		counter.count();
		counter.count();

		System.out.println(counter.getValue());
		
		
	}

	
}
