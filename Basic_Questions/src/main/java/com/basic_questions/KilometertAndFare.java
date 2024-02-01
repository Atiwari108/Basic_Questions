package com.basic_questions;

import java.util.Scanner;

public class KilometertAndFare {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Kilometer :");
	double km= sc.nextInt();
	int fare;
	if (km>=0 && km<=10) {
		fare = (int)  (11.0*km) ;
		System.out.println("fare"+"="+fare);
		
	}
	else if (km>10 && km<=90) {
		
		fare = (int)  (10*km) ;
		System.out.println("fare"+"="+fare);
	}
	else {
		fare = (int)  (9*km) ;
		System.out.println("fare"+"="+fare);
		
	}
}
}
