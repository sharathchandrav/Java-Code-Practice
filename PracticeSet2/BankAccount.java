package PracticeSet2;

/*Bank Account: Create a BankAccount class with attributes for accountNumber, accountHolderName, and balance. 
 * Add methods to deposit money, withdraw money, and check the balance.*/

public class BankAccount {

	int accountNumber;
	String accountHolderName;
	int balance;

	public BankAccount(int accountNumber, String accountHolderName, int balance) {
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}

	public void depositMoney(int amount) {
		this.balance = this.balance + amount;
		System.out.println("The amount " + amount + " is deposited in the account of " + accountHolderName);

	}

	public void withdrawMoney(int amount) {
		if (balance > amount) {
			this.balance = this.balance - amount;
			System.out.println("The amount " + amount + " has been withdrawn from the account of " + accountHolderName);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void checkBalance() {
		System.out.println("The account balance of " + accountHolderName + " is " + balance);
	}

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(5897456, "Srinivas", 500);
		BankAccount account2 = new BankAccount(478569, "Padma", 125);
		BankAccount account3 = new BankAccount(15151615, "vasu", 1500);

		account1.depositMoney(500);
		account1.checkBalance();
		account2.depositMoney(1000);
		account2.checkBalance();
		account3.withdrawMoney(300);
		account3.checkBalance();
		account2.withdrawMoney(10000);
	}

}
