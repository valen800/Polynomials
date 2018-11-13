
public class Segment {

	private Point startPoint;
	private Point endPoint;
	
	public Segment() {
		startPoint = new Point(0,0);
		endPoint = new Point(0,0);
		
	}
	
	public Segment(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public double module() {
		int x1 = startPoint.getX();
		int y1 = startPoint.getY();
		int x2 = endPoint.getX();
		int y2 = endPoint.getY();
		int c1 = x2 - x1;
		int c2 = y2 - y1;
		
		return Math.sqrt(c1 * c1 + c2 * c2);
	}
	
	public String toString() {
	
		return startPoint.toString() + "," + endPoint.toString();
	}
	
	public void setOffset ( int offX, int offY) {
		
		startPoint.setOffset(offX, offY);
		endPoint.setOffset(offX, offY);
		
	}
	
	public void setStartPoint(Point startPoint) {
		
		this.startPoint = startPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		
		this.endPoint = endPoint;
	}
	
	public Point getStartPoint() {
		
		return startPoint;
	}
	
	public Point getEndPoint() {
		
		return endPoint;
	}
}
