package Day16two;


public class CurrentAccount extends Account {
	public void AccountType() {
		
		if(balance>=10000) 
			System.out.println("This is CurrentAccount");
			else
				System.out.println("This is savings Account");
		}
	
}
