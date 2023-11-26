package Task_18.Ej_2;

import Task_18.Ej_1.NegativeNumberException;

public class Account {
	private String idAccount;
	private double balance;
	public Account(String idAccount) {
		this.idAccount = idAccount; 
	}
	public String getIdAccount() {
		return idAccount;
	}
	public double getBalance() {
		return balance;
	}
	public String toString() {
		return idAccount + " balance: " + balance;
	}
	public void depositMoney(double money) {
		balance+=money;
	}
	public void withdrawMoney(double money) {
		balance-=money;
	}
	public void doTransfer(Account target, double money) throws NegativeNumberException {
		isNegative(balance);
		sameAccount(target);

		balance-=money;
		target.balance+=money;
	}
	public void cancelAccount(Account target) throws NegativeNumberException {

		sameAccount(target);

		if (!this.idAccount.equalsIgnoreCase(target.idAccount)) {
			doTransfer(target, balance);
		}
	}
	public void isNegative(double balance) throws NegativeNumberException {

		if(this.balance<0) {
			throw new NegativeNumberException("Negative");
		}
	}

	public void sameAccount(Account id) throws NegativeNumberException {

		if(id.equals(idAccount)) {

			throw new NegativeNumberException();

		}

	}
}