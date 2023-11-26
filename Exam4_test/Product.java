package Exam4_test;

import Calculos.MyMath;

public class Product {

	// Attributes
	// Non static	
	private int idProd;
	private String description;
	private double price;
	private int stock;
	// Statics
	private static int minStock = 10;

	// Constructor

	public Product(int idProd, String description, double price, int stock) {
		this.idProd = idProd;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}
	// Setters
	public void setDescription(String description) {this.description = description;}
	public void setPrice(double price) {this.price = price;}
	public void setStock(int stock) {this.stock = stock;}
	public static void setMinSock(int _minStock) {minStock = _minStock;}

	// Getters
	public int getIdProd() {return this.idProd;}
	public String getDescription() {return description;}
	public double getPrice() {return price;}
	public int getStock() {return stock;}
	public static int getMinSock() {return minStock;}

	// Methods
	public void increaseStock(int inc) {this.stock += inc;}

	/**
	 * @param Parameter must be introduced without being divided by 100
	 */
	public void updatePricePercent(double percent) {
		this.price = this.price + (this.price * (percent/100));
	}
	@Override
	public String toString() {
		return "Product [idProd: " + idProd + ", description: " + description + ", price: " + MyMath.round(price) + ", stock: " + stock+ "]";
	}


}
