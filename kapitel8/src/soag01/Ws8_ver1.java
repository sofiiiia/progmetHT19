package soag01;

public class Ws8_ver1 {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		System.out.println("(" + p1.xValue + ", " + p1.yValue + ")");
		System.out.println(p1);
		
		p1.xValue = 4;
		p1.yValue = 4;
		System.out.println("(" + p1.xValue + ", " + p1.yValue + ")");
		
		p2.xValue = -1;
		p2.yValue = 3;
		System.out.println("(" + p2.xValue + ", " + p2.yValue + ")");
	}

}
