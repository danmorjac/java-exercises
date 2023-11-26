package Task_14.Ej_9;

import java.util.ArrayList;

public class EmployeeTester {

	public static void printEmployees(ArrayList<Employee> Employees) {
		for (int i = 0; i < Employees.size(); i++) System.out.println(Employees.get(i));
	}

	public static void main(String[] args) {


		ArrayList<Employee> Emp = new ArrayList<Employee>(4);
		Emp.add(new Employee("Daniel"));
		Emp.add(new Employee("Pablo","23-6-1996"));
		Emp.add(new Employee("Mario","13-5-1906"));
		Emp.add(new Employee("Juan","23-8-2046"));

		System.out.println("The company have: "+ Employee.getCount()+ " employees");
		printEmployees(Emp);
		System.out.println();

		System.out.println("The initial salary of the company is: "+ Employee.getInitialSalary());
		System.out.println("The total salary of the company is: "+ Employee.getTotalSalary());
		System.out.println();

		String newName = "Miguel Angel";
		System.out.println("However, " + Emp.get(3).getName() + " preferes to be called " + newName +". Let's change it: ");
		Emp.get(3).setName(newName); System.out.println(Emp.get(3));
		System.out.println();

		String birthday = "28-06-1996";
		System.out.println(Emp.get(0).getName() + " hasn't got bithday. Let's set it to " + birthday);
		Emp.get(0).setBirthday(birthday); System.out.println(Emp.get(0));
		System.out.println();

		double newSalaray = 1350;
		double newPercent = 10;
		System.out.println(Emp.get(1).getName() + "'s salary is going to be increase to " + newSalaray);
		Emp.get(1).setSalary(newSalaray);
		System.out.println(Emp.get(2).getName() + "'s salary is going to be modify by " + newPercent + '%');
		Emp.get(2).modifySalary(newPercent);
		System.out.println("So the total salary of the company has increase to: " + Employee.getTotalSalary());
		System.out.println();

		System.out.println("Then, the new employees list is: "); printEmployees(Emp); System.out.println();

		System.out.println("Let's show the info of the first employee");
		Employee first = Emp.get(0);
		System.out.println(first.getName() + " has the ID " + first.getNumberID() + ", his birthday is on "
		+ first.getBirthday() + " and his salary is " + first.getSalary());

	}

}
