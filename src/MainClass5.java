
public class MainClass5 {
	
	public static final int NUM_ELEMENTS=10;

	public static void main(String[] args) {
		Point[] array;
		Rectangle[] arrayRect;
		array = new Point[10];
		
		array = new Point[NUM_ELEMENTS];
		arrayRect = new Rectangle[NUM_ELEMENTS];
		
		for (int i=0; i < array.length; i++) {
			array[i] = new Point(i,i);
			
		}
		
		for (Point p : array) {
			System.out.println(p);
		}
		
		for (int i=0; i<arrayRect.length; i++) {
			arrayRect[i] = new Rectangle(array[i], 1, 1);
			
		}
		
		for (Rectangle rec : arrayRect) {
			System.out.println(rec);
		}
	}
}
