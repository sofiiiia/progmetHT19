package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-21
 *
 */

public class Ws8_ver2 {

	public static void main(String[] args) {
		

		Point2D p1 = new Point2D();
		p1.setXValues(4);
		p1.setYValues(4);
		
		Point2D p2 = new Point2D(-4, 3); 
		
		System.out.println("(" + p1.getXValues() + ", " + p1.getYValues() + ")");
		System.out.println("(" + p2.getXValues() + ", " + p2.getYValues() + ")");
	
		System.out.println("Number of Point2D objects: " + Point2D.getObjectCounter());
	}

}
