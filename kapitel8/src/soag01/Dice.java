package soag01;

/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-23
 *
 */

public class Dice {
	
	int value = 1;
	
	public Dice() {
		
	}
	public void roll() {
		value = (int)(Math.random()*6)+1; 
	}
	public int getValue() {
		return value;
	}

}
