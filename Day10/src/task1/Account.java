package task1;

import java.util.Scanner;
public class Account {
 String name,number,type;
 Float balance;
 Account(){
		number = "321456746908";
		name = "Manoj";
		type = "saving";
		balance = (float) 1750.0;
	}
 Account(String number,String name,String type,float balance){
		this.number = number;
		this.name = name;
		this.type = type;
		this.balance =balance;
 }

@Override
public String toString() {
	String data = "Number is : "+number+
			"\nName is : "+name+
			"\nType is : "+type+
			"\nbalance is "+balance;
	return data;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account2 = new Account();
		System.out.println(account2);
	}

	
}