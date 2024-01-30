package com.basic_questions;

import java.util.Scanner;

//Program to check whether a given number is even or odd.

public class EvenOrOdd {

	public static void main (String []args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number:");
		int a =sc.nextInt();
		if (a%2==0 ) {
			System.out.println(" the given number is even number ");
			
		}
		else {
			System.out.println("the given number is  Odd");
		}
	}
}
