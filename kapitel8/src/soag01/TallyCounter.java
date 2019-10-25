package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-23
 *
 */

public class TallyCounter {
	
	private int counter = 0;
	private int limit = 0;

	public TallyCounter() {
	}
	public void count() {
		if(counter < limit) {
			counter++;
		}else {
			System.err.println("Limit exceeded");
		}
	}
	public int getValue() {
		return this.counter;
	}
	public void reset() {
		this.counter = 0;
	}
	public void undo() {
		if(counter > 0) {
			counter--;
		}
	}
	public void setLimit(int maximum) {
		this.limit = maximum;
	}
	

}
