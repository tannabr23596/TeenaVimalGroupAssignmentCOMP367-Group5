package com.teena.vimal.devops;

import java.util.Random;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeenaVimalDevopsGroupAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeenaVimalDevopsGroupAssignmentApplication.class, args);
		System.out.println("Welcome to COMP367 Group Project");
	  

        Scanner scanner = new Scanner(System.in);

        // Get input for customer details
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Customer ID: ");
        long customerId = scanner.nextLong();
        scanner.nextLine(); 
       
        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();
     

        // Create a Customer object
        Customer customer = new Customer(customerId,customerName, phone, emailAddress, password);

       
        System.out.println("Customer Details:");
        System.out.println(customer);
        
        System.out.println("Customer info created successfully");
        System.out.println("Enter the account type you want to open");
        
        String accountType = scanner.nextLine();
        Random random = new Random();
        long accountid = random.nextLong((99999L - 10000L) + 1L) + 10000L;
        Account account = new Account(accountid,accountType,0,customerId);
        
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    boolean depositSuccess = depositAmount(depositAmount, customer.getCustomerid());

                    if (depositSuccess) {
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Customer ID not found! Deposit failed.");
                    }
                    break;
                case 2:
                    // Withdraw
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    boolean withdrawSuccess = withdrawAmount(withdrawAmount, customerId);

                    if (withdrawSuccess) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Customer ID not found or insufficient balance! Withdrawal failed.");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        System.out.println("Current amount of the custmer:"+ account.getAmount());
        
        scanner.close();
	    
	}
	private static boolean depositAmount(double amount,long customerid) {
	   boolean transactionSuccess =false;
       for(Account acc: Account.accountList)	{
    	   if(acc.getCustomerid() == customerid) {
    		   acc.setAmount(amount + acc.getAmount());
    		   transactionSuccess =true;
    		   break;
    	   }
       }
      return transactionSuccess;
	}
	private static boolean withdrawAmount(double amount,long customerid) {
		   boolean transactionSuccess =false;
	       for(Account acc: Account.accountList)	{
	    	   if(acc.getCustomerid() == customerid) {
	    		   if(amount> acc.getAmount()) {
	    			   acc.setAmount(amount - acc.getAmount());
	    		   }
	    		   else {
	    			   acc.setAmount(acc.getAmount() - amount);
	    		   }
	    		   transactionSuccess =true;
	    		   break;
	    	   }
	       }
	      return transactionSuccess;
		}
		

}
