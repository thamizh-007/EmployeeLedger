package com.employeeledger.tns;
import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {
        Scanner employeeLedgerKey = new Scanner(System.in);

        System.out.println("Enter the name of the employee: ");
        String name = employeeLedgerKey.nextLine();

        System.out.println("Enter the address of the employee: ");
        String address = employeeLedgerKey.nextLine();

        System.out.println("Enter the mobile number of the employee: ");
        String ph_no = employeeLedgerKey.nextLine();

        System.out.println("Enter the sales amount of the employee: ");
        double sales_amt = employeeLedgerKey.nextDouble();

        // Initialize commission variable
        double commission = 0;

        // Determine commission based on sales amount
        if (sales_amt >= 100000) {
            commission = sales_amt * 0.1;
        } else if (sales_amt >= 50000) {
            commission = sales_amt * 0.05;
            
        } else if (sales_amt >= 30000) {
            commission = sales_amt * 0.03;
            
        } else {
            System.out.println("No commission");
        }

        // Display the commission if it's greater than zero
        if (commission > 0) {
            System.out.println("The commission for a sales amount of $" + sales_amt + " is: $" + commission);
        }
        
        System.out.println("Your name: "+name);
        System.out.println("Your address: "+address);
        System.out.println("Your phone number: "+ph_no);

        // Close the scanner
        employeeLedgerKey.close();
    }
}
