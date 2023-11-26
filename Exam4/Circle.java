package Exam4;

public class Circle {
	private Point center;
	private double radius;
	public Circle() {}
	public Circle (Point center, double radius) {
		this.center=center;
		this.radius=radius;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Point getCenter(){
		return center;
	}
	public double getRadius(){
		return radius;
	}
	public void setValues(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	public boolean isContained(Point o) {
		
		boolean contained=false;
		
		if(this.radius<(center.distance(o)))
			
			contained=true;
			
		
		return contained;
		
	}
	
	public boolean intersectsWith (Circle c2) {
		
		boolean intersect=false;
		
		if(this.radius + c2.radius < this.center.distance(c2.center))
			
			intersect = true;
			
		return intersect;
		
	}
}
