package Exam5_test.Ej_1;

public class HourlyEmployee extends Employee {
//	Attributes
	private double wage;
	private int hours;
	
//	Constructors
	public HourlyEmployee(String SSN, String name, double wage, int hours) {
		super(SSN, name);
		this.wage = wage;
		this.hours = hours;
	}	
	
//	Setters
	public void setWage(double wage) {this.wage = wage;}
	public void setHours(int hours) {this.hours = hours;}
	
//	Getters
	@Override
	public double getAmountToPay() {return this.wage * this.hours;}
	public double getWage() {return wage;}
	public int getHours() {return hours;}
	
//	Methods
	@Override
	public String toString() {
		return "HourlyEmployee [" + super.simpleToString() + "wage: " + wage + ", hours: " + hours + "]";
	}
}