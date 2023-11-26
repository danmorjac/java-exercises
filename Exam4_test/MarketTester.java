package Exam4_test;

public class MarketTester {

	public static void main(String[] args) {
		
		Product p1 = new Product(001, "movil", 599.99, 15);
		Product p2 = new Product(002, "ordenador", 1000, 9);
		Product p3 = new Product(003, "auriculares", 20.35, 20);
		Product p4 = new Product(004, "mouse", 10.50, 5);
		Product p5 = new Product(005, "cargador", 7.95, 30);
		Market m = new Market (1);
		System.out.println(m.addProduct(p1));
		System.out.println(m.addProduct(p2));
		System.out.println(m.addProduct(p3));
		System.out.println(m.addProduct(p3));
		System.out.println(m.addProduct(p4));
		System.out.println(m.addProduct(p5));
		System.out.println(m + "\n");
		m.showProductsUnderStock();//Products under stock shown
		System.out.println(m.getValueOfStock()); //value of all the products' stock
		p2.increaseStock(5);
		p2.updatePricePercent(10);
		System.out.println(p2.toString() + "\n");
		//Venezuelan inflation happens
		m.updatePricePercent(1000);
		m.showProductsUnderStock();
		System.out.println(m + "\n");

	}

}
