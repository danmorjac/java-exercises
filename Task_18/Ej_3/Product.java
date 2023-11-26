package Task_18.Ej_3;

public class Product {
	private String name;
	private int stock;
	private static final int STOCKLIMIT = 5;

	// Empty constructor
	public Product() {
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) throws LowStockException {
		if (stock < STOCKLIMIT) {
			throw new LowStockException("Stock is lower than the limit.");
		}
		this.stock = stock;
	}

	// toString method
	@Override
	public String toString() {
		return "Product [name=" + name + ", stock=" + stock + "]";
	}
}