package Task_13.Ej_1;

public class Point {
	// *** attributes
	protected double x; //x value of the point
	protected double y; //y value of the point
	// first constructor
	public Point() {
	}
	// second constructor
	public Point(double abs, double ord) {
		x = abs;
		y = ord;
	}
	// third constructor
	public Point(double coord) {
		x = coord;
		y = coord;
	}
	public double getX() {
		return (x);
	}
	public double getY() {
		return (y);
	}
	public String toString(){
		return "("+x+","+y+")";
	}
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public void setXY(double abs, double ord) {
		x = abs;
		y = ord;
	}
	public double distOrigin() {
		return(Math.sqrt(x*x + y*y));
	}

} // end of the class

