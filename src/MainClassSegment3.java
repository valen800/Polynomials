import java.lang.reflect.Array;

public class MainClassSegment3 {

	public static void main(String[] args) {
		
		Segment segment = new Segment(new Point(4,5), new Point(6,8));
		segment.setOffset(4, 4);
		System.out.println(segment.toString());
		
		Point[] ps = {new Point(2,2), new Point(2,4), new Point(4,4), new Point(4,2)};
		
		System.out.println(calculatePerimeter(ps));
		
		Polygon polygon1 = new Polygon(ps);
		System.out.println(polygon1);
		

	}
	
	public static double calculatePerimeter(Point[] points) {
		
		double perimeter = 0;
		for (int i=0; i < points.length -1; i++) {
			
			Segment segment = new Segment(points[i], points[i+1]);
			perimeter = perimeter + segment.module();
		}
		Segment s = new Segment(points[0], points[points.length -1]);
		perimeter += s.module();
		return perimeter;
	}

}
