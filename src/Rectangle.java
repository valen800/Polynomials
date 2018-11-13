
public class Rectangle extends Point{
	
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		width = 0;
		height = 0;
		
	}
	public Rectangle(Point p, int newWidth, int newHeight) {
		setX(p.getX());
		setY(p.getY());
		width = newWidth;
		height = newHeight;
		
	}
	public Rectangle(Point p1, Point p2) {
		
		setX(p1.getX());
		setY(p1.getY());
		width = p2.getX() - p1.getX();
		height = p2.getY() - p1.getY();
	}
	public Rectangle(Segment segment) {
		/*int x1 = segment.getStartPoint().getX();
		int x2 = segment.getEndPoint().getX();
		int y1 = segment.getStartPoint().getY();
		int y2 = segment.getEndPoint().getY(); */
		
		int xMin = segment.getStartPoint().getX();
		if (segment.getEndPoint().getX() < xMin) {
			xMin = segment.getEndPoint().getX();
		}
		int yMin = segment.getStartPoint().getY();
		if (segment.getEndPoint().getY() < yMin) {
			yMin = segment.getEndPoint().getY();
		}
		setX(xMin);
		setY(yMin);
		
		width = Math.abs(segment.getStartPoint().getX() -
				segment.getEndPoint().getX());
		height = Math.abs(segment.getStartPoint().getY() - 
				segment.getEndPoint().getY());
		/*width = Math.abs(x1 -x2);
		width = Math.abs(y1 -y2);*/
	}
	
	public int getArea() {
		int area = 0;
		area = width * height;
		return area;
	
	}
	public Point getPoint() {
		
		return new Point(getX(), getY());
		
	}
	public Point getTopLeft() {
		
		Point p = new Point(getX(), getY() + height);
		return p;
		
	}
	public Point getTopRightPoint() {
		
		Point p = new Point(getX() + width, getY() + height);
		return p;
		
	}
	public Point getBottomLeftPoint() {
		return  getPoint();
	}
	
	public Point getBottomRightPoint() {
		Point p = new Point(getX() + width, getY());
		return p;
	}
	
	
	@Override
	public String toString() {
		return "("+ getX() +","+ getY() +") (width= " + width + " height= " + height + ")";
		
	}

}
