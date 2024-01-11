package task10;

public class Account {
	
	private double balance;
	
	public Account() {

		this.balance = 0.0;
	}
	
	public Account(double inicialBalance) {
		
		this.balance = inicialBalance;
	}

	public void withdraw(double amount) {
		
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. Remaining balance: " + balance);
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}
	
	
	public  void deposit(double amount) {
		
		if(amount >0 ) {
			
			balance += amount;
			
			System.out.println("deposit completed your current balance is :  " + balance);
		}else
		{
			
			System.out.println("deposit failed");
			
		}


	}
	
	public static void main(String[] args) {
		
		Account a = new Account();
		Account a1 = new Account(500);
		
		a.withdraw(100);
		a1.deposit(1000);
		
		System.out.println("balance" + a.balance);
		System.out.println("balance" + a1.balance);
	}
	
}
