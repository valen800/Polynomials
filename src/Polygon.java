
public class Polygon {
	
	private Point[] points;
	/*Point p1 = new Point(4, 5);
	Point p2 = new Point(6, 8);
	Point p3 = new Point(10,12);*/

	public Polygon(Point[] points) {
		
		this.points = points;
	}
	public Polygon() {
		
		points = null;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (Point p : points) {
			s = s + p.toString() + " - ";
		}
		s = s + points[0];
		return s;
	}
	
	public static double CalculateLength(Point[] points) {
		
		double perimeter = 0;
		for (int i=0; i < points.length -1; i++) {
			
			Segment segment = new Segment(points[i], points[i+1]);
			perimeter = perimeter + segment.module();
		}
		Segment s = new Segment(points[0], points[points.length -1]);
		perimeter += s.module();
		return perimeter;
	}
	
	public void setOffset(int offX, int offY) {
		
		for (Point p : points) {
			p.setOffset(offX, offY);
		}
		
	}
}
