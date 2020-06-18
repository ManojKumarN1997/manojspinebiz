package day12;

import java.util.Scanner;
interface CustomerManager{
void solveIssues();
void approveLoan();
public static void customermanagerMethod() {
		System.out.println("This is in the customer interface--satatic method");
	}
}
interface EmployeeManager{
	 void conductMeeting();
	 void setTarget();
	 public static void employeemanagerMethod() {
			System.out.println("This is in the employee interface--satatic method");
		}
}

abstract class Employee{
	int id,id1;
	String name,name1,phone,phone1,type;
	float salary;
	Scanner scanner;
	{
	scanner = new Scanner(System.in);
	}
	abstract void Details();
	abstract void customerDetails();
}
abstract class customer{
	abstract void Details();
}
class Manager extends Employee implements CustomerManager,EmployeeManager {


	@Override
	public void conductMeeting() {
		// TODO Auto-generated method stub
		System.out.println("Information to Employees");
		System.out.println("Coming Friday we Plan to ConductMeeting ");
		System.out.println("All of you Attend Without Fail");
		
		System.out.println("                                                                      ");
		
	}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("Dear Employees we Plan set MonthlyTarget to Every Employees ");
		System.out.println("All the Details will inform to you");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("                                                                      ");
	}

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Dear customer please check your Account balance then sign for cheque because of bounce purpose");
		System.out.println("And Maintain your  Credit card Properly otherwise Problem Raise again");
		
		System.out.println("                                                                      ");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Dear customer");
		System.out.println("Your HomeLoan has been Approved");
		System.out.println("Please dont Forget to monthly Loan Payment");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("                                                                      ");
	}

	@Override
	void Details() {
		// TODO Auto-generated method stub
		System.out.println("EMPLOYEES Desination Given Below");
		System.out.println("----------------------------------");
		System.out.println("                                    ");
		System.out.println("enter the Employee id ");
		id=scanner.nextInt();
		  scanner.nextLine();
		System.out.println("enter the Employee name ");
		name=scanner.nextLine();
		System.out.println("enter the Employee phone ");
		phone=scanner.nextLine();
		System.out.println("enter the Employee salaryDesignation ");
		
		salary=scanner.nextFloat();
		System.out.println("These are the Employee AssignDesignation.");
System.out.println("---------------------------------------");
		
		
		
	}

	@Override
	void customerDetails() {
		// TODO Auto-generated method stub
		System.out.println("CUSTOMERS Desination Given Below");
		System.out.println("----------------------------------");
		System.out.println("                                    ");
		System.out.println("enter the customer id ");
		id1=scanner.nextInt();
		  scanner.nextLine();
		System.out.println("enter the customer name ");
		name1=scanner.nextLine();
		System.out.println("enter the customer phone ");
		phone1=scanner.nextLine();
		System.out.println("enter the customer type ");
		
		type=scanner.nextLine();
		System.out.println("These are the customer AssignDesignation.");
System.out.println("---------------------------------------");
	}

}
public class Office{
	public static void main(String[] args) {
		Manager manager = new Manager();
		
		
		CustomerManager CustomerManagerObject;
		CustomerManagerObject=manager;
		manager.customerDetails();
		CustomerManagerObject.solveIssues();
		CustomerManagerObject.approveLoan();
		
		EmployeeManager EmployeeManagerObject;
		EmployeeManagerObject=manager;
		manager.Details();
		EmployeeManagerObject.conductMeeting();
		EmployeeManagerObject.setTarget();
	}
}
