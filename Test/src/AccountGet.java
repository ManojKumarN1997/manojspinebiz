import java.util.ArrayList;
import java.util.TreeSet;

public class AccountGet {
	ArrayList<Account> accounts;
	public AccountGet() {
		accounts = new ArrayList<Account>();
	}
	void addAccount() {
		Account acc = new Account();
		acc.takeAccountDetailsFromUser();
		accounts.add(acc);
		acc = new Account();
		acc.takeAccountDetailsFromUser();
		accounts.add(acc);
	}
	void printAccount() {
		TreeSet<Account> sm = new TreeSet<Account>(accounts);
		accounts = new ArrayList<Account>(sm);
		System.out.println("Sorted by name");
		System.out.println(accounts);
		System.out.println("----------------");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountGet AS= new AccountGet();
		AS.addAccount();
		AS.printAccount();
	}

}