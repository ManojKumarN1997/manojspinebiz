package org.myBank;
import java.util.Scanner; 

public class Customer {
    private static String name;

    public static void main(final String args[]) throws Exception {
        long number;
        float balance;
        String type;
        Account account = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the customer name: ");
        name = sc.nextLine();
        System.out.println("Enter the Account Numer: ");
        number = sc.nextInt();
        System.out.println("Enter the Account type: ");
        type = sc.next();
        System.out.print("Enter the initial Deposite ammount: ");
        balance = sc.nextFloat();

        if (type.equals("CurrentAccount"))
            account = new CurrentAccount(name, number, type, balance);
        else if (type.equals("SavingsAccount"))
            account = new SavingsAccount(name, number, type, balance);

        while (true) {
            System.out.println("Enter the option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Exit");
            final int opt = sc.nextInt();
            float amt;
            switch(opt) {
                case 1:
                    System.out.println("Enter the Amount to Deposit: ");
                    amt = sc.nextFloat();
                    account.Transact(amt);
                break;
                case 2:
                    System.out.println("Enter the Amount to Withraw: ");
                    amt = sc.nextFloat();
                    account.Transact(amt, "withdraw");
                break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter valid option.");
            }
        }
      
    }
}