package PracticeSet2;

/*Account Management: Define an Account class with private attributes for accountNumber and balance. 
 * Implement methods for deposit, withdraw, and to get account details.*/

class Account {
	private int accountNumber;
	private int balance;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println("The Current balance of " + accountNumber + " is " + balance);
	}

	public void withdraw(int amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println("The Current balance of " + accountNumber + " after withdrawl is " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}

	}

	public void getAccountDetails() {
		System.out.println("The account details are Account number is " + getAccountNumber() + " and the balance is "
				+ getBalance());
	}
}

public class AccountManagement {

	public static void main(String[] args) {

		Account a1 = new Account();
		Account a2 = new Account();
		a1.setAccountNumber(1245678);
		a1.deposit(1500);
		a2.setAccountNumber(456789);
		a2.deposit(2000);
		a1.withdraw(500);
		a2.getAccountDetails();

	}

}
