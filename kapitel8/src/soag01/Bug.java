package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-25
 *
 */

public class Bug {

	int initialPosition = 1;
	boolean moveRight = true;

	public Bug(int initialPosition) {
		this.initialPosition = initialPosition;
	}

	public void turn() {
		moveRight = !moveRight;
	}

	public void move() {
		System.out.println("Bugsy says 'I am here': " + initialPosition);
		if (moveRight == true) {
			initialPosition++;
		} else {
			initialPosition--;
		}
		//System.out.println(initialPosition);
	}

	public int getPosition() {
		return initialPosition;
	}

}
