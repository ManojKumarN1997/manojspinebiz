package Day16two;

import  java.util.Scanner;
public class Account {
 String name,number,type;
 Float balance,withdraw,deposit;
 public Float getWithdraw() {
	return withdraw;
}
public void setWithdraw(Float withdraw) {
	this.withdraw = withdraw;
	
}
public Float getDeposit() {
	return deposit;
}
public void setDeposit(Float deposit) {
	this.deposit = deposit;
}
int n;
 Scanner scanner;
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Float getBalance() {
	return balance;
}
public void setBalance(Float balance) {
	this.balance = balance;
}
Account()
 {
	 scanner = new Scanner(System.in);
 }
public void printAccountData() {
	System.out.println("Account name "+name);
	System.out.println("Account number "+number);
	System.out.println("Account balance "+balance);
	System.out.println("Account type "+type);
}
public void getAccountDataFromUser() {
	System.out.println("Please enter the Account number ");
	number = scanner.nextLine();
	/*scanner.nextLine();*/
	System.out.println("Please enter the Accounter Name ");
	name = scanner.nextLine();
	System.out.println("Please enter the Account balance ");
	balance = scanner.nextFloat();
	scanner.nextLine();
	/*System.out.println("Please enter the Account type ");
	type = scanner.nextLine();*/
}
}
