package ATMInterface;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		ATMOperationInterface op = new ATMOperations();
		int atmNumber = 123456789;
		int atmPin = 2304;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine !");
		System.out.println("Enter ATM Number");
		int atm_num = sc.nextInt();
		System.out.println("Enter ATM pin");
		int atm_pin = sc.nextInt();
		
		if((atmNumber == atm_num ) && (atmPin == atm_pin))
		{
			while(true)
			{
				System.out.println("\n 1. View Available balance \n 2. Withdraw amount \n 3. Deposit amount \n 4. View MiniStatement \n 5. Exit");
				System.out.println("Enter choice :");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					op.viewBalance();
				}
				else if(ch == 2)
				{
					System.out.println("Enter the amount to Withdraw");
					double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}
				else if(ch == 3)
				{
					System.out.println("Enter the amount to deposit");
					double depositAmount = sc.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch == 4)
				{
					op.viewMiniStatement();
				}
				else if(ch == 5)
				{
					System.out.println("\n Collect your ATM Card \n Thank You for using ATM Machine !!!");
					System.exit(0);
				}
				else
				{
					System.out.println("Please enter correct choice");
				}
			}
		}
		else
		{
			System.out.println("Incorrect Validation, Please try again");
			System.exit(0);
		}
		


	}

}
