import java.util.Scanner;
public class Customermanager {
	Customers[] customers1;
	Scanner scanner;
	int numberOfcustomers;
	Customermanager(){
		scanner = new Scanner(System.in);
		customers1 = new Customers[10];
	}
	public void addcustomer(int idx) {
		if(idx<10) {
			customers1[idx] = new Customers();
			customers1[idx].GetCustomerDetails();
		}
		else
			System.out.println("Cannot add customer details. Array is full");
	}
	public void addcustomer() {
		int index = -1;
		String choice = "No";
		do {
			index++;
			addcustomer(index);
			System.out.println("Do u want to add more customer details?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") && index<10);
		numberOfcustomers = index;
		System.out.println("customer details added");
		System.out.println("--------------------");
	}
	int findcustomerIndex(int age)
	{
		int index = -1;
		for (int i = 0; i <= numberOfcustomers; i++) {
			if(customers1[i].getAge()==age)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	int findcustomerrIndex(int id)
	{
		int index = -1;
		for (int i = 0; i <= numberOfcustomers; i++) {
			if(customers1[i].getId()==id)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	public void comparecustomers1() {
		int id1=0,id2=0,idx1,idx2;
		System.out.println("Please enter the first customer id to be compared");
		id1 = scanner.nextInt();
		idx1 = findcustomerrIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such customer details please try again from start");
			comparecustomers1();
		}
		System.out.println("Please enter the second customer id to be compared");
		id2 = scanner.nextInt();
		idx2 = findcustomerrIndex(id2);
		if(idx2==-1)
		{
			System.out.println("No such customer details please try again from start");
			comparecustomers1();
		}
		if(customers1[idx1].equals(customers1[idx2]))
			System.out.println("The customers are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	public void deletecustomerDetails() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the customer  id to be deleted");
		id1 = scanner.nextInt();
		idx1 = findcustomerrIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such customer");
			System.out.println("No customer deleted");
		}
		else	
		{
			System.out.println("The customer to be deleted is ");
			System.out.println(customers1[idx1]);
			customers1[idx1] = null;
			System.out.println("customer details deleted");
			System.out.println("--------------------");
		}
			
	}
	public void updatecustomerDetails() {
		int age1=0,agex1 =0;
		System.out.println("Please enter the customer age to be updated");
		age1 = scanner.nextInt();
		agex1 = findcustomerIndex(age1);
		System.out.println("The customer details for updation");
		if(agex1==-1)
		{
			System.out.println("No such details");
		}
		else
		{
			System.out.println(customers1[agex1]);
			System.out.println("--------------------");
			String phone = scanner.nextLine();
			System.out.println("Please enter the customer phone for updation");
			scanner.nextLine();
			System.out.println("Please enter the customer age for updation");
			int age = scanner.nextInt();
			customers1[agex1].setAge(age);
			customers1[agex1].setPhone(phone);
			System.out.println("Update success");
			System.out.println("The updated movie details");
			System.out.println(customers1[agex1]);
			System.out.println("--------------------");
			
		}
	}
	public void printMovie() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the customer  id to be printed");
		id1 = scanner.nextInt();
		idx1 = findcustomerrIndex(id1);
		System.out.println("The selected Movie details");
		if(idx1==-1)
		{
			System.out.println("No such movie");
		}
		else
			System.out.println(customers1[idx1]);
		System.out.println("--------------------");
	}
	
	public void printAllMovies() {
		for (int i = 0; i <= numberOfcustomers; i++) {
			System.out.println(customers1[i]);
			System.out.println("--------------------");
		}
	}
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new customer");
			System.out.println("2. Updating the customer details");
			System.out.println("3. Deleting a customer");
			System.out.println("4. Compare customers");
			System.out.println("5. print customers");
			System.out.println("6. exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
				numberOfcustomers++;
				addcustomer(numberOfcustomers);				
				break;
			case 2:
				updatecustomerDetails();
				break;
			case 3:
				deletecustomerDetails();
				break;
			
			case 4:
				comparecustomers1();
				break;
			case 5:
				printAllMovies();
				break;
			case 6:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=6);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customermanager customermanager = new Customermanager();
		customermanager.addcustomer();
		customermanager.printMenu();
	}

}