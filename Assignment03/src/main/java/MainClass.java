public class MainClass
    
    {
	public static void main(String[] args) {
	
	//1. Create a Savings Account for Joe with an initial balance of $100, and an annual interest rate of 1%.
	SavingsAccount sa1 = new SavingsAccount("Joe" ,100 ,1);
	//2. Create a Checking Account for Emily with an initial balance of $200, and an insufficient funds fee of $10.
	CheckingAccount ca1 = new CheckingAccount("Emily",200,10);
	//3. Deposit $50 to Emily’s account.
	ca1.deposit(50);
	//4. Withdraw $25 from Joe’s account.
	sa1.withdraw(25);
	//5. Process a check for the amount of $50 for Emily.
	ca1.processCheck(50);
	//6. Transfer $100 from Emily’s account to Joe’s account.
	ca1.withdraw(100);
	sa1.deposit(100);
	//7. Create a Savings Account for Sam with an initial balance of $250 and an annual interest rate of 0.5%.
	SavingsAccount sa2 = new SavingsAccount("Sam" ,250 ,0.5);
	//8. Deposit a monthly interest for both Joe’s and Sam’s savings accounts.
	sa1.depositMonthlyInterest();
	sa2.depositMonthlyInterest();
	//9. Withdraw $500 from Emily’s account.
	ca1.withdraw(500);
	//10. Attempt to withdraw $500 from Joe’s account.
	sa1.withdraw(500);
	}
}

