package Task_15.Ej_1;

import Task_13.Ej_1.Point;

class Point3D extends Point {
private double z;

//constructor

public Point3D(double x, double y, double z) {
	super(x,y); //calling the constructor of the parent class. // It must be the first line
	this.z=z;}
public double getZ() {
	return (this.z);}

// method distOrigin overrides the method in the parent class

public double distOrigin() {
	return (Math.sqrt(x*x+y*y+z*z));}
}
//end of the class