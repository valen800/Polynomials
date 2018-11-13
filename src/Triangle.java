
public class Triangle {
	
	private Point v1 = new Point();
	private Point v2 = new Point();
	private Point v3 = new Point();
	
	public Triangle(int x1, int y1, int x2, int y2, 
			int x3, int y3) {
		
		v1 = new Point(x1, y1);
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}
	
	public Triangle(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	@Override
	
	public String toString() {
		return "Triangle @ (" + v1 +"), (" + v2 + "), (" + v3 +")";
	}
	
	public double getPerimeter() {
		
		return Point.distance(v1, v2) + Point.distance(v2, v3) +
				Point.distance(v3, v1);
	}
	
	public void printType() {
		double d1 = Point.distance(v1, v2);
		double d2 = Point.distance(v2, v3);
		double d3 = Point.distance(v1, v3);
		
		if (d1 == d2 && d2 == d3 && d3 == d1) {
			System.out.println("Equilateral");
		} else {
			if (d1 != d2 && d2 != d3 && d3 != d1 ) {
				System.out.println("Escalene");
			} else {
				System.out.println("Isosceles");
			}
		}
	}
}
