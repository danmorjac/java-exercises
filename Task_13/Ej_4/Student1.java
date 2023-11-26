package Task_13.Ej_4;

public class Student1 {

	private String name;
	private int age;
	private double marks1;
	private double marks2;
	private double marks3;

	public Student1() {}
	public Student1 (String name, int age) {

		this.name=name;
		this.age=age;
	}
	public Student1(String name, int age, int mk1, int mk2, int mk3) {
		this.name=name;
		this.age=age;
		this.marks1=mk1;
		this.marks2=mk2;
		this.marks3=mk3;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMarks1() {
		return marks1;
	}
	public void setMarks1(double marks1) {
		this.marks1 = marks1;
	}
	public double getMarks2() {
		return marks2;
	}
	public void setMarks2(double marks2) {
		this.marks2 = marks2;
	}
	public double getMarks3() {
		return marks3;
	}
	public void setMarks3(double marks3) {
		this.marks3 = marks3;
	}
	public void setMarks(double marks1,double marks2,double marks3) {
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	@Override
	public String toString(){
		return name+ " , "+ age+ " Marks: " + marks1+" , "+marks2+ " , "+marks3;
		
	}
}
