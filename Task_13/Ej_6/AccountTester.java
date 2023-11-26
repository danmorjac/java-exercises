package Task_13.Ej_6;

public class AccountTester {

	public static void depositMoney(Account ac, double amount) {

		ac.depositMoney(amount);

		System.out.println("Deposit " + amount + " to account " + ac.getIdAccount() + ". New balance: " + ac.getBalance());
	}
	public static void withdrawMoney(Account ac, double amount) {

		System.out.println("Withdraw " + amount + " to account " + ac.getIdAccount() + ". Current balance: "+ ac.getBalance());

		if 
		(ac.withdrawMoney(amount)) System.out.println("Success! New balance: " + ac.getBalance());

		else 
			System.out.println("Operation canceled. No further information");
	}
	public static void cancelAccount(Account acToCancel, Account target) {
		System.out.println("Cancel account: " + acToCancel.getIdAccount());
		System.out.println("Transfer balance to: " + target.getIdAccount());

		if (acToCancel.cancelAccount(target)) {
			System.out.println("Success! New balance of " + target.getIdAccount() + ": " +target.getBalance());
			System.out.println("New Balance of " + acToCancel.getIdAccount() + ": " +acToCancel.getBalance());
		}
		else 
			System.out.println("Operation canceled. No further information");
	}
	public static void main(String[] args) {

		System.out.println("Create two accounts");

		Account ac1 = new Account("1111"); System.out.println("Account 1: " + ac1.getIdAccount());
		Account ac2 = new Account("2222"); System.out.println("Account 2: " + ac2.getIdAccount());

		System.out.println();
		depositMoney(ac1, 1000);
		depositMoney(ac2, 1500);
		System.out.println();

		withdrawMoney(ac1, 350);
		System.out.println();
		withdrawMoney(ac2, 3000);
		System.out.println();

		cancelAccount(ac1, ac2);
		System.out.println();

		cancelAccount(ac1, ac2);
	}
}

