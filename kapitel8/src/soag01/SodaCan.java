package soag01;
/**
 * 
 * @author Sofia Ågren
 * @version2019-10-25
 *
 */

public class SodaCan {

	double height = 0.0f;
	double radius = 0.0f;
	
	public SodaCan(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	public double getSurfaceArea() {
		double area = (2.0f*Math.PI*Math.pow(radius,2)+2.0f*Math.PI*radius*height);
		return area;
		
	}
	public double getVolume() {
		double volume = (Math.PI*Math.pow(radius, 2)*height);
		return volume;
		
	}
}

