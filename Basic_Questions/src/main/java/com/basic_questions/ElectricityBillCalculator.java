package com.basic_questions;
//import java.util.Scanner;
//public class ElectricityUnits {
//public static void main(String[] args) {
//	Scanner sc = new Scanner (System.in);
//	System.out.println("Enter the Units of Electricty :");
//	int units= sc.nextInt();
//	double bill;
//	int charge;
//	int finalbill;
//	if (units<=50) {
//		bill= (0.50*units);
//		charge= (int)(0.20*bill);
//		finalbill= (int) (charge+bill);
//		System.out.println("final Bill to be paid is :"+finalbill);
//	}

	
	
	import java.util.Scanner;

	public class ElectricityBillCalculator {
	    public static void main(String[] args) {
	        // Input electricity units
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the electricity units consumed: ");
	        double units = scanner.nextDouble();

	        // Calculate and display the total electricity bill
	        double totalBill = calculateElectricityBill(units);
	        System.out.printf("Total electricity bill: Rs. %.2f%n", totalBill);
	    }

	    public static double calculateElectricityBill(double units) {
	        double rate;

	        if (units <= 50) {
	            rate = 0.50;
	        } else if (units <= 150) {
	            rate = 0.75;
	        } else if (units <= 250) {
	            rate = 1.20;
	        } else {
	            rate = 1.50;
	        }

	        // Calculate the basic bill without surcharge
	        double basicBill = units * rate;

	        // Calculate surcharge (20% of basic bill)
	        double surcharge = 0.20 * basicBill;

	        // Calculate total bill
	        double totalBill = basicBill + surcharge;

	        return totalBill;
	    }
	}


