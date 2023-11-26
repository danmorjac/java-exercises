package Exam5_test.Ej_1;

public class CommissionEmployee extends Employee {
//	Attributes
	private double baseSalary;
	private double sales;
	private double commission;
//	Constructors
	public CommissionEmployee(String SSN, String name, double baseSalary, double sales, double commission) {
		super(SSN, name);
		this.baseSalary = baseSalary;
		this.sales = sales;
		this.commission = commission;
	}
	
//	Setters
	public void setBaseSalary(double baseSalary) {this.baseSalary = baseSalary;}
	public void setSales(double sales) {this.sales = sales;}
	public void setCommission(double commission) {this.commission = commission;}
	
//	Getters
	@Override
	public double getAmountToPay() {return this.baseSalary + (this.sales * this.commission);}
	public double getBaseSalary() {return baseSalary;}
	public double getSales() {return sales;}
	public double getCommission() {return commission;}
	
//	Methods
	@Override
	public String toString() {
		return "CommissionEmployee [" + super.simpleToString() + "baseSalary: " + baseSalary + ", sales: " + sales + ", commission: " + commission + "]";
	}
}