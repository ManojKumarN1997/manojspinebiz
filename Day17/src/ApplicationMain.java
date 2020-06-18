import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ApplicationMain {
Scanner scanner;
ClassTwo cityub;
String username,password,dob,email,name,hobbies,phone;
int age;

ArrayList<String> details;

ApplicationMain (){
	scanner = new Scanner(System.in);
}

	public String getUsername() {
	return username;
}

    public void setUsername(String username) {
	this.username = username;
}

    public String getPassword() {
	return password;
}

    public void setPassword(String password) {
	this.password = password;
}

    public String getDob() {
	return dob;
}

    public void setDob(String dob) {
	this.dob = dob;
}

    public String getEmail() {
	return email;
}

    public void setEmail(String email) {
	this.email = email;
}

    public String getName() {
	return name;
}

    public void setName(String name) {
	this.name = name;
}

    public String getHobbies() {
	return hobbies;
}

    public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}

    public String getPhone() {
	return phone;
}

    public void setPhone(String phone) {
	this.phone = phone;
}

    public int getAge() {
	return age;
}

    public void setAge(int age) {
	this.age = age;
}

    public ArrayList<String> getDetails() {
	return details;
}

    public void setDetails(ArrayList<String> details) {
	this.details = details;
}


   
ApplicationMain(String username,String password,String name,String dob,String email,String phone,String hobbies,int age){
	this.username=username;
	this.password=password;
	this.name=name;
	this.dob=dob;
	this.age=age;
	this.email=email;
	this.phone=phone;
	this.hobbies=hobbies;
	
}

void GetDetailsFromUser() {
	System.out.println("Please Enter the UserName");
	username = scanner.nextLine();
	
	ApplicationMain reader = new ApplicationMain();
     Character mask = '*';
     String line = null;
     do {
         line = reader.readLine("Enter Password(blank pwd to exit)> ", mask);
         System.out.println("Got password: " + line);
     } while (line != null && line.length() > 0);
      
	  System.out.println("Please Enter the Name");
	  name = scanner.nextLine();
	  System.out.println("Please Enter the Date of Birth by this pattern(dd/MM/yyyy) ");
	  dob = scanner.nextLine();
	  age = ageCalculation(dob);
	  
	  
	  System.out.println("Please Enter the email");
	  email=scanner.nextLine();
	  if(email.matches("^(.+)@(.+)$")) {
		  System.out.println("");
		  
	  }
	  
	  else {
		System.out.println("!!!!Invalid email id!!!!!");
		  System.out.println("Please Enter correct the correct email id");
		email=scanner.nextLine();
		
		  }
	  
	  System.out.println("Please Enter the phone number");
	  phone=scanner.nextLine();
	  if (phone.matches("\\d{10}")){
		
	  }
	  else {
		  System.out.println("!!!!Invalid phone number!!!!");
		  System.out.println("Please Enter correct the phone number");
		  phone=scanner.nextLine();
	  } 
	  System.out.println("Please Enter the Hobbies");
	 hobbies=scanner.nextLine();
}


private String readLine(String string, Character mask) {
	// TODO Auto-generated method stub
	
	return null;
}



private int ageCalculation(String dob2) {
	// TODO Auto-generated method stub
	int age = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate localDate = LocalDate.parse(dob, formatter);
    LocalDate now = LocalDate.now();
    Period diff = Period.between(localDate, now); 
    age = diff.getYears();
    return age;
	
}

@Override
public String toString()
{
	return "\nusername is : "+username+"\n " +
			 "password is :"+password+"\n " +
			 "name is :"+name+"\n " +
			 "age is "+age+"\n " +
			 "email is :"+email+"\n " +
			 "phone number is :"+phone.replaceAll("\\d(?=\\d{2})", "*")+"\n hobbies is :"+hobbies;
}
	
	

}