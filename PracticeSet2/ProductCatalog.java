package PracticeSet2;

/*Product Catalog: Create a Product class with productName, price, and quantityInStock as attributes.
 *  Add methods to update the price and check stock levels.*/

class Product {
	String productName;
	int price;
	int quantityInStock;

	public void updatePrice(int price) {
		this.price = price;
		System.out.println("The new updated price of the product " + productName + " is " + this.price);
	}

	public void checkStockLevel() {

		System.out.println("The quantity of " + productName + " in stock is " + quantityInStock);
	}

	public Product(String productName, int price, int quantityInStock) {
		this.price = price;
		this.productName = productName;
		this.quantityInStock = quantityInStock;

	}

}

public class ProductCatalog {

	public static void main(String[] args) {
		Product product1 = new Product("Navaratan Oil", 50, 10);
		Product product2 = new Product("Bru", 10, 100);
		Product product3 = new Product("Oral B", 15, 50);
		Product product4 = new Product("Thumps up", 10, 150);

		product1.updatePrice(55);
		product2.checkStockLevel();
		product3.checkStockLevel();
		product4.updatePrice(12);

	}

}
