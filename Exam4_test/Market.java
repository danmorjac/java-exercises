package Exam4_test;

import java.util.ArrayList;

public class Market {

// 	Attributes
	private ArrayList<Product> Products = new ArrayList<Product>();
	
//	Constructors
	public Market(int num) {};
	
//	Getters
	public double getValueOfStock() {
		double value = 0;
		
		for (int i = 0; i < Products.size(); i++)
			value += Products.get(i).getStock() * Products.get(i).getPrice();
		
		return value;
	}
	
//	Methods
	public boolean addProduct(Product newProd) {
		boolean isOk = true;
		
		for (int i = 0; i < Products.size() && isOk; i++)
			if (Products.get(i).getIdProd() == newProd.getIdProd())
				isOk = false;
		
		if (isOk) Products.add(newProd);
		
		return isOk;
	}
	
	/**
	 * @param Parameter must be introduced without being divided by 100
	 */
	public void updatePricePercent(double percent) {
		for (int i = 0; i < Products.size(); i++)
			Products.get(i).updatePricePercent(percent);
	}
	
	public void showProductsUnderStock() {
		for (int i = 0; i < Products.size(); i++)
			if (Products.get(i).getStock() < Product.getMinSock())
				System.out.println(Products.get(i));
	}
	@Override
	public String toString() {
		String text = "Market: \n";
		
		for (int i = 0; i < Products.size(); i++) {
			text += Products.get(i);
			if (i != Products.size() - 1) text += "\n";
		}
		
		return text;
	}
}

