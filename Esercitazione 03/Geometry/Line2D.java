public class Line2D{
	private Point2D start;
	private Point2D end;

	Line2D(Point2D start, Point2D end){
		this.start = start;
		this.end = end;
	}
	
	public Point2D getStart(){
		return this.start;
	}
	public Point2D getEnd(){
		return this.end;
	}
	
	public double getLength(){
		return start.getDistanceTo(end);
	}
	
	public boolean isContiguousWith(Line2D line){
		if(this.start.getDistanceTo(line.getEnd()) == 0 || this.end.getDistanceTo(line.getStart()) == 0)
			return true;
		return false;
	}
}
