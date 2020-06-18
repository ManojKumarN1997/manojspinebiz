package Day16two;

import java.util.Scanner;

public class SavingsAccount extends Account{
	Scanner s = new Scanner(System.in);
	
		
	boolean CheckAccountType() {
		boolean result = true;
		
		 
			if(balance>=5000&&balance<10000)
				
			{
				result = false;
				
			}
		
		return result;
	}
	void checkAccount() {
		System.out.println("Type of Account");
		
			if(CheckAccountType()==true)
				System.out.println("this is current account");
			else
				System.out.println("this is savings account");
			System.out.println("                         ");
			System.out.println("                         ");
	}			
			
	
	
}