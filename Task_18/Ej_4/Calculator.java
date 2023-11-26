package Task_18.Ej_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isValidCalculation = false;

		while (!isValidCalculation) {
			try {
				System.out.print("Enter the first number: ");
				double num1 = scanner.nextDouble();

				System.out.print("Enter the operator (+, -, *, /): ");
				String operator = scanner.next();

				System.out.print("Enter the second number: ");
				double num2 = scanner.nextDouble();

				double result = calculate(num1, operator, num2);

				System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

				isValidCalculation = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid number.");
				scanner.nextLine(); // clear scanner buffer
			} catch (WrongOperatorException e) {
				System.out.println(e.getMessage());
			} catch (ArithmeticException e) {
				System.out.println("Cannot divide by zero. Please enter a non-zero second number.");
			}
		}

		scanner.close();
	}

	public static double calculate(double num1, String operator, double num2) throws WrongOperatorException, ArithmeticException {
		switch (operator) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			if (num2 == 0) {
				throw new ArithmeticException();
			}
			return num1 / num2;
		default:
			throw new WrongOperatorException("Invalid operator. Please enter a valid operator (+, -, *, /).");
		}
	}
}

class WrongOperatorException extends Exception {
	public WrongOperatorException(String message) {
		super(message);
	}
}