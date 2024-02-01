package com.basic_questions;

import java.util.Scanner;

public class CostAndRoadTax {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the cost of the bike :  ");
		int Cost = sc.nextInt();
		double Tax;
		if (Cost >100000) {
			Tax = 0.15*Cost;
			System.out.println(Tax+" Rs of Tax to be paid .");
		}
		else if (Cost >50000 && Cost <=100000) {
			Tax=0.10*Cost;
			System.out.println(Tax+" Rs of Tax to be paid .");
			
		}
		else if (Cost<=50000) {
			
			Tax = 0.5*Cost;
			System.out.println(Tax+" Rs of Tax to be paid .");
			
		}
	}
}
