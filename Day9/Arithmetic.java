import java.util.Scanner;
public class Arithmetic {
  public static void main(String[] args) {
    int a,b,opt,add,sub,mul;
    double div;
    Scanner S = new Scanner(System.in);
    System.out.println("Enter the First Number");
    a = S.nextInt();
    System.out.println("Enter the Second Number");
    b = S.nextInt();
    
  while (true){
	  System.out.println("Select 1 For Addition");
	  System.out.println("Select 2 For Subtration");
	  System.out.println("Select 3 For Multiplication");
	  System.out.println("Select 4 For Division");
	  System.out.println("Select 5 To Exit");
	  opt = S.nextInt();
	  switch (opt){
	  case 1:
		  add = a+b;
		  System.out.println("Result"+add);
		  break;
	  case 2:
		  sub = a-b;
		  System.out.println("Result" + sub);
		  break;
	  case 3:
		  mul = a*b;
		  System.out.println("Result"+mul);
		  break;
	  case 4:
		  div = a/b;
		  System.out.println("Result"+div);
		  break;
	  case 5:
	       System.exit(0);  
	  }
	  
  }
  
  }}