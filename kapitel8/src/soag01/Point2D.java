package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-21
 *
 */

public class Point2D {
	
	public int xValue,
						yValue;
	
	static private int objectCounter = 0;
	
	static public int getObjectCounter() {
		return objectCounter;	
	}
	public void setXValues(int x) {
		xValue = x;
	}
	public int getXValues() {
		return xValue;
	}
	public void setYValues(int y) {
		yValue = y;
	}
	public int getYValues() {
		return yValue;
	}
	public Point2D(int x, int y) {
		xValue = x;
		yValue = y;
		objectCounter++;
	}
	
	public Point2D() {
	}
	public String toString() {
		return String.format("Point 2D: %d %d ", xValue, yValue);
	}
}
