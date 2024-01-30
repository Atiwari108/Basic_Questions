package com.basic_questions;
import java.util.Scanner;

//Program to check whether a given input is digit or not.

public class IsDigitOrNot {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	int a = sc.nextInt();
	if (a>=0 && a<=9) {
		System.out.println("the number is a digit");
		
	}
	else {
		System.out.println("the number is not a digit:");
	}
	}
}
