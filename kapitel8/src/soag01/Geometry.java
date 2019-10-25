package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version 2019-10-25
 *
 */

public class Geometry {
	
	public static double cylinderVolume(double radius, double height) {
		double volume = Math.PI*Math.pow(radius, 2)*height;
		return volume;
		
	}
	public static double cylinderSurfaceArea(double radius, double height) {
		double area = 2.0f*Math.PI*Math.pow(radius,2)+2.0f*Math.PI*radius*height;
		return area;
		
	}

}
