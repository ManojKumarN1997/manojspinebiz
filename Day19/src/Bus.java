import java.util.Scanner;


import java.util.ArrayList;
public class Bus extends Driver {
 Scanner scanner;
  ArrayList<Bus> buslist;
 Bus(){
	 scanner = new Scanner(System.in);
	 buslist = new ArrayList<Bus>();
 }
 
 String busNumber,source,driver;
 int busid,capacity,FilledStatus;
public String getBusNumber() {
	return busNumber;
}
public void setBusNumber(String busNumber) {
	this.busNumber = busNumber;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public int getFilledStatus() {
	return FilledStatus;
}
public void setFilledStatus(int filledStatus) {
	FilledStatus = filledStatus;
}
 
 public int getBusid() {
	return busid;
}
public void setBusid(int busid) {
	this.busid = busid;
}
Bus(int busid,String busNumber,String source,int capacity,int FilledStatus){
	 this.busNumber=busNumber;
	 this.source=source;
	 this.capacity=capacity;
	 this.FilledStatus=FilledStatus;
	 this.busid=busid;
 }
  
 String getBusDetils() {
	 System.out.println("Enter the Bus Id");
	 busid=scanner.nextInt(); 
	 scanner.nextLine();
	 System.out.println("Enter the Bus Number");
	 busNumber=scanner.nextLine();
	 System.out.println("Enter the Destintion Source");
	 source=scanner.nextLine();
	 System.out.println("Enter the Bus capacity");
	 capacity=scanner.nextInt();
	 System.out.println("Enter the Filled Status");
	 FilledStatus=scanner.nextInt();
	 if(FilledStatus<capacity) {
		 System.out.println("Bus filled");
	 }else {
		 System.out.println("bus overflow");
		 System.out.println("Enter the Filled Status");
		 FilledStatus=scanner.nextInt(); 
	 }

	 System.out.println("------------------------");
	 System.out.println("Enter Driver Details for The Bus");
	 driver = getDriverDetailsFromUser();
	 return busNumber;
 }
 
 @Override
 public String toString()
	{
	 System.out.println(" !! Bus Details is !!");
	 System.out.println("------------------------");
		return "\n Bus Id is :"+busid+
				"\nbusNumber is :"+busNumber+
				"\nDestination source is ;"+source+
				"\ncapacity is :"+capacity+
				"\nFilledstatus is :"+FilledStatus+
				"\nDriver Name is :"+driver;
	}
 public void addBusAccount() {
		Bus bus  = new Bus();
		bus.getBusDetils();
		buslist.add(bus);
	}
  
public void addbusAccounts() {
		

		String choice = "No";
		do {
			addBusAccount();
			
			System.out.println("Do u want to Add Another bus Account?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
			
		} while (!choice.toLowerCase().equals("no"));
	}

public void printbusaccount() {
	for (Bus bus : buslist) {
		System.out.println(bus);
		System.out.println("--------------------");
	}
}

Bus findBusIndex(int busid )
	{
		for(Bus buss :buslist) {
			if(buss != null)
			{
				if(buss.getBusid()==busid)
				{
					return buss;
				}
			}
		}
		return null;
	}

public void deleteBusDetails() {
	int busid=0;
	System.out.println("Please enter the bus id to be deleted");
	busid = scanner.nextInt();
	Bus m1 = findBusIndex(busid);
	if(m1 == null)
	{
		System.out.println("No such bus");
		System.out.println("No bus deleted");
	}
	else	
	{
		System.out.println("The bus to be deleted is ");
		System.out.println(m1);
		buslist.remove(m1);
		System.out.println("bus details deleted");
		System.out.println("--------------------");
	}
		
}

void editbus() {
	int busid=0;
	System.out.println("Please enter the age to be Edit");
	busid = scanner.nextInt();
	Bus m1 = findBusIndex(busid);
	System.out.println("The details to Edit");
	if(m1==null)
	{
		System.out.println("No such details");
	}
	else
	{
		System.out.println(m1);
		System.out.println("--------------------");
		
		System.out.println("Please enter the bus number to Edit");
		String busNumber = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Please enter the source to Edit");
		String source = scanner.nextLine();
		
    	m1.setBusNumber(busNumber);
		m1.setSource(source);
		
		System.out.println("");
		System.out.println("");
		System.out.println("Bus Number Changed successfully");
		System.out.println("--------------------");
		
	}
}
}

