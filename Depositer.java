package Dec_23_ATM_Machine;

public class Depositer extends Thread
{
	private Account account;   //Customer Holder account

	public Depositer(Account account) {
		super();
		this.account = account;
	}
	
	//Method to take multiple amounts from user to deposit from account.
	@Override
	public void run() 
	{
		int[] deposit = {20000, 5000, 10000, 20000, 7000};
		
		for(int amount : deposit)
		{
			try
			{
				account.deposit(amount);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
