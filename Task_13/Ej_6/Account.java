package Task_13.Ej_6;

class Account {

	private String idAccount;
	private double balance;

	public Account(String idAccount) {this.idAccount = idAccount;}

	public String getIdAccount() {return idAccount;}
	public double getBalance() {return balance;}

	public void depositMoney(double money) {this.balance += money;}
	public boolean withdrawMoney(double money) {

		boolean isOk = false;
		if (this.balance >= money) {
			isOk = true;
			this.balance -= money;
		}
		return isOk;
	}
	public boolean doTransfer(Account target, double money) {
		boolean isOk = false;
		if (this != target && this.withdrawMoney(money)) {
			isOk = true;
			target.depositMoney(money);
		}
		return isOk;
	}
	public boolean cancelAccount(Account target) {
		boolean isOk = false;
		if (this.doTransfer(target, this.balance)) isOk = true;
		return isOk;
	}
}




