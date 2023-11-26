package Task_18.Ej_3;

public class TesterException {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Product 1");

		try {
			product.setStock(3);
		} catch (LowStockException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(product);
	}

}
