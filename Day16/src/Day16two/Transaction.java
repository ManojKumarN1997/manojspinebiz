package Day16two;

import java.util.Scanner;


public class Transaction {
	 Scanner scanner;
	 Transaction(){
	 scanner = new Scanner(System.in);}
		static void transaction() {
			
			System.out.println("Add with no parameters");
		}
		void transaction(double withdraw,double balance)  {
			
				System.out.println("withdraw status");
			System.out.println("enter the amount to be withdraw");
			withdraw=scanner.nextDouble();
			if(withdraw<balance)
		
			System.out.println("Please collect your money");
			
		else {
			System.out.println("balance is not enough");
		}}
			
		
		static void transaction1(double deposit,double balance) {
			 balance = balance + deposit;
			 System.out.println("deposit status");
			System.out.println("Your Money has been successfully depsited");
		}
		
		
			

		void checkBalanceEligibility() throws BalanceException {
			int age = 12;
			int balance=5;
				
				 if(balance<18)
					throw new BalanceException();
				System.out.println("You can proceed...");
			
		}

	
	
	
	
	void PrintAll() {
		SavingsAccount savings = new SavingsAccount();
		savings.getAccountDataFromUser();
		savings.checkAccount();
		
		
	}
	

	public static void main(String[] args)  {
		
		try {
			Transaction ee = null;
			ee.checkBalanceEligibility();
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}}}
