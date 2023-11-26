package Exam5_test.Ej_1;

public class Invoice implements Payable {
//	Attributes
	private int number;
	private double totalWithoutVAT;
	private int VATPercent;
	
//	Constructor
	
	public Invoice(int number, double totalWithoutVAT, int VATPercent) {
		this.number = number;
		this.totalWithoutVAT = totalWithoutVAT;
		this.VATPercent = VATPercent;
	}
	
//	Setters
	public void setNumber(int number) {this.number = number;}
	public void setTotalWithoutVAT(double totalWithoutVAT) {this.totalWithoutVAT = totalWithoutVAT;}
	public void setVATPercent(int vATPercent) {VATPercent = vATPercent;}
	
//	Getters
	public int getNumber() {return number;}
	public double getTotalWithoutVAT() {return totalWithoutVAT;}
	public int getVATPercent() {return VATPercent;}
	@Override
	public double getAmountToPay() {return this.totalWithoutVAT + (this.totalWithoutVAT * (this.VATPercent/100.0));}
	
//	Methods
	@Override
	public String toString() {
		return "Invoice [number: " + number + ", totalWithoutVAT: " + totalWithoutVAT + ", VATPercent: " + VATPercent + "%" + "]";
	}
}