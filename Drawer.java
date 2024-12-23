package Dec_23_ATM_Machine;

public class Drawer extends Thread
{
	private Account account;   //Customer Holder Account

	public Drawer(Account account) {
		super();
		this.account = account;
	}
	
	//Method to take multiple amounts from user to withdraw.
	@Override
	public void run()   
	{
		int[] withdraw = {10000, 13000, 8000, 9000};
		
		for(int amount : withdraw)
		{
			try 
			{
				account.withdraw(amount);
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
