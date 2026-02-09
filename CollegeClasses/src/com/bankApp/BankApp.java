package com.bankApp;

import java.util.Scanner;

public class BankApp {

		
		    public static void main(String[] args) {
		    	
		    	 Scanner sc = new Scanner(System.in);
		         Bank bank = new Bank();

		       
		         Account acc = new SavingAccount(101, "Atharva", 5000);
		         bank.addAccount(acc);

		         int choice;

		         while (true) {
		             System.out.println("\n--- BANK MENU ---");
		             System.out.println("1. Deposit");
		             System.out.println("2. Withdraw");
		             System.out.println("3. Display Account");
		             System.out.println("4. Exit");
		             System.out.print("Enter choice: ");
		             choice = sc.nextInt();

		             switch (choice) {
		                 case 1:
		                     System.out.print("Enter amount to deposit: ");
		                     double dep = sc.nextDouble();
		                     acc.deposit(dep);
		                     break;

		                 case 2:
		                     System.out.print("Enter amount to withdraw: ");
		                     double wit = sc.nextDouble();
		                     acc.withdraw(wit);
		                     break;

		                 case 3:
		                     acc.displayAccount();
		                     break;

		                 case 4:
		                     System.out.println("Thank you for using Banking App");
		                     System.exit(0);

		                 default:
		                     System.out.println("Invalid choice");
		             }
		         }
		    }
	    
	}


