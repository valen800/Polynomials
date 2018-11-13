
public class MainClassSegment {

	public static void main(String[] args) {
		
		Point p1 = new Point (4,6);
		Point p2 = new Point (6,8);
		Segment segment1 = new Segment(p1, p2);
		System.out.println(segment1);
		System.out.println(segment1.module());
		segment1.setOffset(4,4);
		System.out.println(segment1);
		
		
	}

}
