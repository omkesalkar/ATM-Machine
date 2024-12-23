package Dec_23_ATM_Machine;

public class ATMMachine
{
	public static void main(String[] args) 
	{
		//Create one account of customer.
		Account account1 = new Account();   
		
		//Calling methods to withdraw or deposit the amounts.
		Drawer draw = new Drawer(account1);
		Depositer deposit = new Depositer(account1); 

		//Thread start to execute the program.
		draw.start();
		deposit.start();
	}

}
