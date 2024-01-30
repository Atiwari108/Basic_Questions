package com.basic_questions;
import java.util.Scanner;

public class BonusAmount {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the yearr of service:");
		int year = sc.nextInt();
		System.out.println("Enter the salary:");
		int sal= sc.nextInt();
		double bonus;
		if (year >10) {
			bonus = 0.10*sal;
			System.out.println(bonus);
		}
		else if ( year >=6 && year <=10) {     


			bonus=0.8*sal;
			System.out.println(bonus);
		}  
		else if (year <6) {
			bonus = 0.6*sal;
			System.out.println(bonus);
		}

	}
}
