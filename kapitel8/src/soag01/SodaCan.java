package soag01;

public class SodaCan {

	float height = 0.0f;
	float radius = 0.0f;
	
	public SodaCan(float height, float radius) {
		this.height = height;
		this.radius = radius;
	}
	public float getSurfaceArea() {
		float area = (float)(2.0f*Math.PI*Math.pow(radius,2)+2.0f*Math.PI*radius*height);
		return area;
		
	}
	public float getVolume() {
		float volume = (float)(Math.PI*Math.pow(radius, 2)*height);
		return volume;
		
	}
}

