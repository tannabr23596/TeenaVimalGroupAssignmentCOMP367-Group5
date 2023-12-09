package com.teena.vimal.devops;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeenaVimalDevopsGroupAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeenaVimalDevopsGroupAssignmentApplication.class, args);
		System.out.println("Welcome to COMP367 Group Project");
	    System.out.println("Enter the customer name");
	  

        Scanner scanner = new Scanner(System.in);

        // Get input for customer details
        System.out.print("Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.next(); 

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
        scanner.close();
	    
	}

}
