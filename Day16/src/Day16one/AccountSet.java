package Day16one;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AccountSet {
ArrayList<Account> accounts;
public AccountSet() {
	accounts = new ArrayList<Account>();
}
void addMovie() {
	Account movie = new Account();
	movie.GetMovieDetails();
	accounts.add(movie);
	movie = new Account();
	movie.GetMovieDetails();
	accounts.add(movie);
}
void print() {
	TreeSet<Account> sm = new TreeSet<Account>(accounts);
	accounts = new ArrayList<Account>(sm);
	System.out.println("Sorted by name");
	System.out.println(accounts);
	System.out.println("----------------");
	System.out.println("Sorted by Age");
	System.out.println(accounts);
	System.out.println("----------------");
	System.out.println("sorted by balance");
	System.out.println(accounts);
	System.out.println("----------------");
	System.out.println("sorted by Account-number");
	System.out.println(accounts);
	System.out.println("----------------");
	System.out.println("sorted by phone-number");
	System.out.println(accounts);
	System.out.println("----------------");
}
void create() {

		try {
			File myObj = new File("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcnumber.txt");
			File myObj1 = new File("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcphonenumber.txt");
			File myObj2 = new File("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyActername.txt");
			File myObj3 = new File("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcage.txt");
			File myObj4 = new File("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcbalance.txt");
			if(myObj.createNewFile()) {
				System.out.println("File 1 created :"+myObj.getName());
				System.out.println("File 2 created :"+myObj1.getName());
				System.out.println("File 3 created :"+myObj2.getName());
				System.out.println("File 4 created :"+myObj3.getName());
				System.out.println("File 5 created :"+myObj4.getName());
		
			}
			else {
				System.out.println("file already exist");
			}
		}catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();}
		}
void readAndwriteFile() {
	try {
		FileWriter mywriter = new FileWriter("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcnumber.txt");
		mywriter.write("\nsorted by Account-number\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]");
		FileWriter mywriter1 = new FileWriter("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcphonenumber.txt");
		mywriter1.write("\nsorted by phone-number\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]\r\n" + 
				"----------------");
		FileWriter mywriter2 = new FileWriter("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcctername.txt");
		mywriter2.write("\nSorted by name\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]");
		FileWriter mywriter3 = new FileWriter("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcage.txt");
		mywriter3.write("\nSorted by Age\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]" );
		FileWriter mywriter4 = new FileWriter("C:\\Users\\Rajamohamed S\\eclipse-workspace\\sortedbyAcbalance.txt");
		mywriter4.write("\nsorted by balance\r\n" + 
				"[ac num105\r\n" + 
				"  nameddd\r\n" + 
				"  phone63987412\r\n" + 
				"  age is24\r\n" + 
				" balance25000.0, ac num101\r\n" + 
				"  nameqqq\r\n" + 
				"  phone97863937\r\n" + 
				"  age is36\r\n" + 
				" balance36000.0]");
	
		mywriter.close();
		mywriter1.close();
		mywriter2.close();
		mywriter3.close();
		mywriter4.close();
		System.out.println("Successfully wrote");
	}catch(IOException e) {
		System.out.println("an occured error");
		e.printStackTrace();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountSet moviesett = new AccountSet();
		moviesett.addMovie();
		moviesett.print();
		moviesett.create();
		moviesett.readAndwriteFile();
	}

}
