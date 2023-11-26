package Exam5_test.Ej_1;

public abstract class Employee implements Payable {
//	Attributes
	protected String SSN;
	protected String name;
	
//	Constructors
	public Employee(String SSN, String name) {
		this.SSN = SSN;
		this.name = name;
	}
//	Setters
	public void setSSN(String sSN) {SSN = sSN;}
	public void setName(String name) {this.name = name;}
	
//	Getters
	public String getSSN() {return SSN;}
	public String getName() {return name;}
	
//	Methods
	@Override
	public String toString() {
		return "Employee [" + this.simpleToString() + "]";
	}
	public String simpleToString() {
		return "SSN: " + SSN + ", name: " + name;
	}
}