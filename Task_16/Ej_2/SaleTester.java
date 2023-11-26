package Task_16.Ej_2;

public class SaleTester {

	public static void main(String[] args) {
		
		Sale someObject = new DiscountSale("map", 5, 0);
		DiscountSale ds = new DiscountSale();
		if (someObject instanceof DiscountSale)
		{
			ds = (DiscountSale)someObject;
			System.out.println("ds was changed to " + someObject);
		}
		else 
			System.out.println("ds was not changed.");


	}

}
