import java.util.ArrayList;
import java.util.Scanner;

public class ClassTwo extends ApplicationMain {
	  ArrayList<ApplicationMain> accDetails;
      Scanner scanner;
    
      ClassTwo(){
             scanner = new Scanner(System.in);
             accDetails = new ArrayList<ApplicationMain>();
      }
      public void addAccount() {
    		ApplicationMain account  = new ApplicationMain();
    		account.GetDetailsFromUser();
    		accDetails.add(account);
    	}
    	public void addAccounts() {
    		

    		String choice = "No";
    		do {
    			addAccount();
    			
    			System.out.println("Do u want to Add Another Account?? Key in Yes for next entry and No for quiting");
    			choice = scanner.nextLine();
    			
    		} while (!choice.toLowerCase().equals("no"));
    	}
    	public void printaccount() {
    		for (ApplicationMain customer : accDetails) {
    			System.out.println(customer);
    			System.out.println("--------------------");
    		}
    	}
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassTwo am = new ClassTwo();
am.addAccounts();
am.printaccount();

	}

}