package Exam4;

public class Ej_2 {

	public static void main(String[] args) {

		Product p[] = new Product[5];
		p[0]= new Product("sweater", 25.20);
		p[1]= new Product("skirt", 21.50);
		p[2]= new Product("shirt", 19.99);
		p[3]= new Product("scarf", 18.95);
		p[4]= new Product("jeans",29.99);

		System.out.println("There are " + Product.getCount() + " products in my shop");
		System.out.println("Some examples of them: \n\t" + p[2] + "\n\t" + p[3] + "\n\t" + p[0]);
		System.out.println("The price of my favourite " + p[0].getDescription() + " is " 
				+ p[0].getPrice());
		p[3].setDescription("blue "+p[3].getDescription());
		System.out.println("Sales time!!! Everything with 20% of discount!!" );
		for (int i=0; i<p.length; i++)
			p[i].updatePricePercent(-20);
		for (Product product : p) {
			System.out.println(product);
		}

	}
}
