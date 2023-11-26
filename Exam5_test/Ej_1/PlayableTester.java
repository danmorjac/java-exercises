package Exam5_test.Ej_1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class PlayableTester {

	public static double totalToPay(LinkedList <Payable> l) {
		double total = 0;

		Iterator <Payable> it = l.iterator();
		while(it.hasNext()) total += it.next().getAmountToPay();

		return total;
	}

	public static void incrementBaseSalaryOfCommissionEmployee(LinkedList <Payable> l, double percent) {
		Iterator <Payable> it = l.iterator();
		while(it.hasNext()) {
			Payable py = it.next();

			if (py instanceof CommissionEmployee) {
				CommissionEmployee comEmp = (CommissionEmployee)py;

				double baseSalary = comEmp.getBaseSalary();
				comEmp.setBaseSalary(baseSalary + (baseSalary * percent));
			}
		}
	}

	public static void displayPayables(LinkedList <Payable> l) {
		//		Si no le paso "l.size()" no funciona.
		ListIterator <Payable> lit = l.listIterator(l.size());

		while(lit.hasPrevious()) System.out.println(lit.previous());
	}
	public static void main(String[] args) {
		LinkedList <Payable> l = new LinkedList<Payable>();
		l.add(new Invoice(233, 12, 4));
		l.add(new Invoice(235, 50, 10));
		l.add(new Invoice(239, 38, 21));
		l.add(new Invoice(232, 26, 21));
		l.add(new CommissionEmployee("4015", "Pablo", 1500, 50, 20));
		l.add(new CommissionEmployee("4016", "Manu", 1300, 40, 10));
		l.add(new CommissionEmployee("4017", "Dani", 1600, 30, 15));
		l.add(new HourlyEmployee("4018", "Miguel Angel", 1400, 8));
		l.add(new HourlyEmployee("4019", "Fernando", 1300, 7));
		l.add(new HourlyEmployee("4020", "Mario", 1500, 6));

		displayPayables(l);System.out.println();

		System.out.println("Total amount to pay: " + totalToPay(l) + "$\n");

		double percent = 0.3;
		System.out.println("If I change the base salary of the Commission Employees by " + (percent * 100) + '%');
		incrementBaseSalaryOfCommissionEmployee(l, percent);
		displayPayables(l);
	}
}