
public class MainClass4 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle();
		System.out.println(rec);
		rec.setOffset(4, 7);
		System.out.println(rec);
		
		System.out.println(rec.toString());
		
		Rectangle rec2 = new Rectangle(new Point(1,1), 8, 6);
		System.out.println(rec2);
		
		Rectangle rec3 = new Rectangle(new Point(2,2), new Point(5,8));
		System.out.println(rec3);
		
		System.out.println(rec3.getArea());
		System.out.println(rec3.getPoint());
		
		Rectangle rec4 = new Rectangle(new Point(5,6),10,8);
		System.out.println(rec4);
		System.out.println("" + rec4.getTopLeft() +
				", " + rec4.getTopRightPoint() +
				", " + rec4.getBottomLeftPoint() +
				", " + rec4.getBottomRightPoint());
		
	}
}
