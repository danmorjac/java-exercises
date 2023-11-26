package Exam4;

class Point {
	private double x; //x value of the point
	private double y; //y value of the point
	
	public Point() {}
	// second constructor
	public Point(double x, double y) {
		this.x = x; 
		this.y = y;
		
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX(){
		return x;
		
	}
	public double getY(){
		return y;
		
	}
	public void setValues(double x, double y) {
		this.x = x; 
		this.y = y;	
	}
	public double distance(Point p2) {
		return Math.sqrt(Math.pow(p2.x-this.x, 2)+Math.pow(p2.y-this.y, 2));
	}
	public String toString(){
		return "("+x+", "+y+")";
	}


} // end of the class

