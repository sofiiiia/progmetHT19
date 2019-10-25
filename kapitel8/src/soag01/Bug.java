package soag01;

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
		if (moveRight == true) {
			initialPosition++;
		} else {
			initialPosition--;
		}
	}

	public int getPosition() {
		return initialPosition;
	}

}
