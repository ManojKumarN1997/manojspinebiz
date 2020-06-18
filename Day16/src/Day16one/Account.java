package Day16one;

import java.util.Scanner;

public class Account implements Comparable<Account>  {
int age;
String name,number,phone;
float balance;
Scanner scanner;

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
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
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
Account(){
	scanner = new Scanner(System.in);
}

Account(int age ,String name,float balance,String number,String phone){
	scanner = new Scanner(System.in);
	this.age = age;
	this.name = name;
	this.balance = balance;
	this.number=number;
	this.phone = phone;
}

void GetMovieDetails() {
	System.out.println("pplease enter the account number");
	number = scanner.nextLine();
	
	System.out.println("pplease enter the name");
	name = scanner.nextLine();
	System.out.println("pplease enter the phone-number");
	phone= scanner.nextLine();
	System.out.println("pplease enter the age");
	age = scanner.nextInt();
	System.out.println("please enter the account balance");
	balance=scanner.nextFloat();
}
/*void PrintMovieDetils() {
	System.out.println("movie id"+id);
	System.out.println("movie name"+name);
	System.out.println("movie duration"+duration);
	
	
}*/
@Override
public String toString()
{
	return "Account num is : "+number+"\n Accounters name is : "+name+"\n Accounters phone is :"+phone+"\n Accounter age is :"+age+"\nAccount balance is "+balance;
}
@Override
public int compareTo(Account o) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(o.getName());
}

}
