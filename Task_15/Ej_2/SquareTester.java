package Task_15.Ej_2;

public class SquareTester {

	public static void main(String[] args) {

		Square squ = new Square(5);
		Rectangle rect = new Rectangle(5,7);
		Cube cube = new Cube(6);


		System.out.println("I am the method area of the class "+ squ.getClass().getSimpleName()+" : " + squ.getArea());
		System.out.println("I am the method area of the class "+ rect.getClass().getSimpleName()+" : " + rect.getArea());
		System.out.println("I am the method area of the class "+ cube.getClass().getSimpleName()+" : " + cube.getArea());

	}

}
