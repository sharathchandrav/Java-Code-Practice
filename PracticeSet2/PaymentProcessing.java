package PracticeSet2;

/*Payment Processing: Create an abstract class Payment with an abstract method processPayment(). 
 * Implement it in CreditCardPayment and PayPalPayment classes. 
 * Demonstrate polymorphism by processing different types of payments.*/

abstract class Payment {
	abstract void processPayment();
}

class CreditCardPayment extends Payment {

	@Override
	void processPayment() {
		System.out.println("Processing Credit card Payment");

	}

}

class PayPalPayment extends Payment {

	@Override
	void processPayment() {
		System.out.println("Processing Paypal card Payment");

	}

}

public class PaymentProcessing {

	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		Payment p2 = new PayPalPayment();
		p1.processPayment();
		p2.processPayment();

	}

}
