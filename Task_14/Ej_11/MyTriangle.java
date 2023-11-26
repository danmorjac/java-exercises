package Task_14.Ej_11;

import Calculos.MyMath;

public class MyTriangle {

	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;

	public MyTriangle (int x1, int x2, int x3, int y1, int y2, int y3) {

		this.v1 = new MyPoint (x1,y1);
		this.v2 = new MyPoint (x2,y2);
		this.v3 = new MyPoint (x3,y3);

	}

	public MyTriangle (MyPoint v1,MyPoint v2,MyPoint v3) {

		this.v1=v1;
		this.v2=v2;
		this.v3=v3;

	}

	//	Getters

	private double getSide1() {
		return MyMath.round(this.v1.getDistance(this.v2)); 

	}
	private double getSide2() {
		return MyMath.round(this.v2.getDistance(this.v3));

	}
	private double getSide3() {
		return MyMath.round(this.v3.getDistance(this.v1));
	}
	public double getPerimeter() {	
		return this.getSide1()+this.getSide2()+this.getSide3();
	}

	public String getType() {
		String type="";

		if (this.getSide1()==this.getSide2()&&this.getSide1()==this.getSide3()&&this.getSide2()==this.getSide3()) {type="equilateral";}
		else if (this.getSide1()!=this.getSide2()&& this.getSide1()!=this.getSide3()){type="escalene";}
		else type="Isosceles";

		return type;
	}
	public void printType() {System.out.println(this.getType());}



	public String toString(){
		return "MyTriangle[v1="+v1+",v2="+v2+",v3=("+v3+"]";
	}
}








