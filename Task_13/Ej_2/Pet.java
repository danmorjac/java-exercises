package Task_13.Ej_2;

public class Pet {

	private String name;
	private int age;
	private double weight;

	public Pet() {}

	public Pet(String name,int age, double weight) {

		this.name=name;
		this.age=age;
		this.weight=weight;
	}

	public Pet(double initialWeight) {}
	public Pet(int initialAge) {}
	public Pet(String name) {this.name=name;}

	public void set(String name,int age,double weight) {

		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	//setters
	public void setName(String name) {this.name=name;}
	public void setAge(int newAge) {this.age=newAge;}
	public void setWeight(double newWeight) {this.weight=newWeight;}
	//getters
	public String getName() {return name;}
	public int getAge() {return age;}
	public double getWeight() {return weight;}
	
	//toString
	public String toString() {return "Name: "+name +" , Age: "+ age +" , Weight: "+ weight;}

}


