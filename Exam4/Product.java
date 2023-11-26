package Exam4;

import Calculos.MyMath;

public class Product {

	// Attributes
	// Non static
	private static int totalcont=0;
	private static int cont=0;
	private String description;
	private double price;
	private static int id=++cont;
	

	// Constructor

	public Product(String description, double price) {
		this.description = description;
		this.price = price;
		++totalcont;
	}

	// Setters
	public void setDescription(String description) {this.description = description;}
	public void setPrice(double price) {this.price = price;}


	// Getters
	public String getDescription() {return description;}
	public double getPrice() {return price;}
	public static int getCount() {return totalcont;}

	/**
	 * @param Parameter must be introduced without being divided by 100
	 */
	public void updatePricePercent(double percent) {
		this.price = this.price + (this.price * (percent/100));
	}
	@Override
	public String toString() {
		return "Product [idProd: " + ++cont + ", description: " + description + ", price: " + MyMath.round(price) + "]";
	}

}
