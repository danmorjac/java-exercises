package Exam4;

import java.util.Scanner;

public class CirclesTester {
	static Scanner tec = new Scanner(System.in);
	private static Point inputPointKeyboard() {
		System.out.println("Type the coordinates of the point (x and y)");
		Point p=new Point(tec.nextDouble(), tec.nextDouble());
		return p;
	}
	private static Circle inputCircleKeyboard() {
		System.out.println("Type the coordinates of the center of the circle (x and y)");
		double x = tec.nextDouble();
		double y = tec.nextDouble();
		Point p=new Point(x, y);
		System.out.println("Enter the radius");
		Circle c =new Circle(p,tec.nextDouble());
		return c;
	}
	private static int inputMenuOption() {
		int resp=0;
		do {
			System.out.println("1. Add a new Circle");
			System.out.println("2. Show the first Circle that contains a Point");
			System.out.println("3. Show the Circles that intersect a Circle");
			System.out.println("4. Exit the program");
			System.out.println("-------------------------------------------------");
			System.out.println("Choose one option (1, 2, 3, 4)");
			resp=tec.nextInt();
		}while (resp<1 && resp>4);
		return resp;
	}
	public static void main(String[] args) {
		int opt =0;
		SetOfCircles s = new SetOfCircles();
		do {
			opt = inputMenuOption();
			switch (opt) {
				case 1: 
					s.addCircle(inputCircleKeyboard());
					break;
				case 2:
					s.showFirstCircleThatContains(inputPointKeyboard());
					break;
				case 3:
					s.showCirclesThatIntersectWith(inputCircleKeyboard());
					break;
			}
			} while (opt!=4);
		

	}

}
