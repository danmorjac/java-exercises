package Task_19.Ej_1;

class Box<T> {
	// We declare an attribute of type T
	T obj;

	public Box(T obj) { // constructor
		this.obj = obj; 
	}

	public T getObject() { // getter
		return obj; 
	}

	public void setObject(T obj) { // setter
		this.obj = obj;
	}
}

// Driver class to test above
class Main {
	public static void main (String[] args) {
		// instance of Integer type
		Box<Integer> a = new Box<Integer>(15);
		System.out.println(a.getObject());

		// call the setter and print the content of the object
		a.setObject(25);
		System.out.println(a.getObject());

		// create an object b of a Box with a String inside
		Box<String> b = new Box<String>("Hello, World!");
		System.out.println(b.getObject());

		// do the same with an object of a type that you defined in a previous exercise (Point for example)
		Point p = new Point(3, 4);
		Box<Point> c = new Box<Point>(p);
		System.out.println(c.getObject());
	}
}

// Definition of Point class
class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
