public class Point2D{
	private double x;
	private double y;

	Point2D(){
		x = y = 0;
	}
	Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	public double getDistanceTo(Point2D point){
		return (Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2)));
	}
	public double getDistanceTo(double x, double y){
		return (Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)));
	}
}
