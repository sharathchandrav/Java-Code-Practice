package PracticeSet2;

/*Define an abstract Order class with methods like processOrder, cancelOrder, and calculateTotalPrice. 
 * Extend this class to concrete order types (e.g., OnlineOrder, InStoreOrder) with specialized implementations.*/

abstract class Order {
	abstract void processOrder();

	abstract void cancelOrder();

	abstract void calculateTotalPrice();

}

class OnlineOrder extends Order {

	@Override
	void processOrder() {
		System.out.println("Processing Online Order");

	}

	@Override
	void cancelOrder() {
		System.out.println("Cancelling Online Order");

	}

	@Override
	void calculateTotalPrice() {
		System.out.println("Calculating the price of the Online Order");

	}

}

class InstoreOrder extends Order {

	@Override
	void processOrder() {
		System.out.println("Processing Instore Order");

	}

	@Override
	void cancelOrder() {
		System.out.println("Cancelling Instore Order");

	}

	@Override
	void calculateTotalPrice() {
		System.out.println("Calculating the price of the Instore Order");

	}

}

public class EcommerceOrderProcessing {

	public static void main(String[] args) {
		Order o1 = new OnlineOrder();
		Order o2 = new InstoreOrder();
		o1.processOrder();
		o1.calculateTotalPrice();
		o1.cancelOrder();
		o2.processOrder();
		o2.calculateTotalPrice();
		o2.cancelOrder();

	}

}
