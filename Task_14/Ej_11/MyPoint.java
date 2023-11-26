package Task_14.Ej_11;

public class MyPoint {

	// *** attributes
	private double x; //x value of the point
	private double y; //y value of the point
	// first constructor
	public MyPoint() {
	}
	// second constructor
	public MyPoint(double abs, double ord) {
		x = abs;
		y = ord;
	}
	// third constructor
	public MyPoint(double coord) {
		x = coord;
		y = coord;
	}
	public double getX() {
		return (x);
	}
	public double getY() {
		return (y);
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
	public double getDistance(MyPoint p) {
		
		double sqX=Math.pow(this.x -p.x, 2);
		double sqY=Math.pow(this.y -p.y, 2);

		return Math.sqrt(sqX+sqY);

	}
	
	public String toString(){
		return "("+x+","+y+")";
	}


} // end of the class

