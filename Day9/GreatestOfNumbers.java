import java.util.Scanner;
public class GreatestOfNumbers {
	

	public static void main(String[] args) {
		int A,B,C;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the First Number");
		A = S.nextInt();
		System.out.println("Enter the Second Number");
		B = S.nextInt();
        System.out.println("Enter the Third Number");
        C = S.nextInt();
        if(A>B && A>C){
        	System.out.println("Largest Number is :"+A);
        }
        	if  (B>A && B>C){
        		System.out.println("Largest Number is :"+B);
        	}
        	else if (C>A && C>B)
        		System.out.println("Largest Number is:"+C);
        }

     
	}