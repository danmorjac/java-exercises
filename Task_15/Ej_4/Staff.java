package Task_15.Ej_4;

public class Staff extends Person{
	
	protected String School;
	protected double pay;
	
	
	public Staff(String n,String a,String school,double pay) {
		super(n,a);
		this.School=school;
		this.pay=pay;
	}

	public String getSchool() {return School;}
	public void setSchool(String school) {School = school;}
	public double getPay() {return pay;}
	public void setPay(double pay) {this.pay = pay;}
	
	@Override
	public String toString() {return "Student [Person[ name=" + name + ", address=" + address + ", school="+School+", pay="+pay+"]";}
}
