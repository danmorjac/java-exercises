package Task_14.Ej_9;


public class Employee {

	private static int count =0;
	final private static double INITIAL_SALARY=1200;
	private static double totalSalary;
	private int numberID=0;
	private String name;
	private String birthday;
	private double salary= INITIAL_SALARY;

	public Employee (String name) {
		this.setEmployeeData(name); 
	}
	public Employee(String name, String birthday) {
		this.setEmployeeData(name);
		this.setBirthday(birthday);;
	}

	//Setters

	public void setName(String name) {	this.name = name;}
	public void setBirthday(String birthday) {this.birthday = birthday;}
	public void setSalary(double salary) {
		this.salary = salary;
		incrementTotalSalary();
	}

	public static int getCount() {return count;}
	public static double getInitialSalary() {return INITIAL_SALARY;}
	public static double getTotalSalary() {return totalSalary;}

	public int getNumberID() {return numberID;}
	public String getName() {return name;}
	public String getBirthday() {	return birthday;}
	public double getSalary() {	return salary;}


	//Mehods

	public void  modifySalary(double percent) {
		this.decrementTotalSalary();
		this.salary += percent * this.salary;
		this.incrementTotalSalary();

	}

	@Override
	public String toString() {
		return "ID= " + numberID + ", name= " + name + ", birthday= " + birthday + ", salary= " + salary
				+ "";
	}
	private void setEmployeeData(String name) {
		this.name=name;
		this.generateID();
		this.incrementTotalSalary();
	}
	private void generateID() {this.numberID= ++count;}
	private void decrementTotalSalary() {totalSalary -= this.salary;}
	private void incrementTotalSalary() {totalSalary += this.salary;}
}




