package ATMInterface;

import java.util.HashMap;
import java.util.Map;

public class ATMOperations implements ATMOperationInterface {

	ATM atm = new ATM();
	Map<Double, String> ministmt = new HashMap<>();
	
	@Override
	public void viewBalance() 
	{
		System.out.println("Available balance is : " + atm.getBalance() + " Rs");	
	}

	@Override
	public void withdrawAmount(double withdrawAmount) 
	{	
		if(withdrawAmount % 500 == 0)
		{
			if(withdrawAmount <= atm.getBalance())
			{
				ministmt.put(withdrawAmount," amount Withdrawn");
				System.out.println("Collect the cash withdrawn "+ withdrawAmount + " Rs");
				atm.setBalance(atm.getBalance() - withdrawAmount); 
				viewBalance();
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Enter the amount in multiple of 500");
		}
	}

	@Override
	public void depositAmount(double depositAmount) 
	{
		ministmt.put(depositAmount, " amount Deposited");
		System.out.println(depositAmount + " Rs deposited Successfully");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
	}

	@Override
	public void viewMiniStatement() 
	{
		for(Map.Entry<Double, String> m : ministmt.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
	

}
