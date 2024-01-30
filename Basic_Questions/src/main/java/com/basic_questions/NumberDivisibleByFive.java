package com.basic_questions;

import java.util.Scanner;

public class NumberDivisibleByFive {
	public static void main (String []args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number:");
		int a =sc.nextInt();
		if (a%5==0 ) {
			System.out.println("The given number is divisible by  5");
			
		}
		else {
			System.out.println("the given number is not dividible by 5");
		}
	}

}
