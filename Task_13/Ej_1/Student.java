package Task_13.Ej_1;

public class Student {
	// attributes
	private String name;
	private String surname;
	private int age;
	
	//methods
	// constructors
	public Student() {	}
	public Student(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age= age;
	
	}
	//getters
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getSurnameAndName() {
		return surname + ", "+ name;
	}
	public int getAge() {
		return age;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String toString(){
		return surname+", "+name;
	}
	
}