package Task_14.Ej_10;

public class Invoice {

	// Attributes
	// Static
	private static int count = 0;
	// No static
	private int number;
	private double amount;
	private String  date;

	// Constructor
	public Invoice(double amount, String date) {
		this.number = ++count;
		this.amount = amount;
		this.setDate(date);
	}

	// Setters
	public void setDate(String date) {this.date = date;}
	public void setAmount(double amount) {this.amount = amount;}

	// Getters
	public static int getCount() {return count;}
	public int getNumber() {return number;}
	public double getAmount() {return amount;}
	public String getDate() {return date;}

	// Methods
	@Override
	public String toString() {
		return "[number: " + number + ", amount: " + amount + 
				(this.date != null ? ", date: " + this.date : "") + "]";		


	}

}
