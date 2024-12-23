package Dec_23_ATM_Machine;

public class Account 
{
	private int balance = 0;  //Initial account balance

	//Method to withdraw amount after checking conditions.
	public synchronized void withdraw(int amount) throws InterruptedException   
	{
		System.out.println("\nWithdraw under process... Please wait");
		while(balance < amount)
		{
			System.err.println("\nInsufficient balance... waiting for deposit");
			wait();
			if(balance > amount)
			{
				balance = balance - amount;
				System.out.println("\nWithdraw Rs."+ amount +" successful.");
				System.out.println("Current balance after withdraw is Rs."+ balance);
			}
		}
	}
	
	//Method to deposit amount after checking conditions.
	public synchronized void deposit(int amount)
	{
		System.out.println("\nDeposit under process... Please wait");
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("Deposit Rs."+ amount +" successful.");
			System.out.println("Current balance after deposit is Rs."+ balance);
		}
		else
		{
			System.err.println("Invalid amount are not deposited... Please Enter positive amount to deposit.");
		}
		notify();
	}
	
	
}
