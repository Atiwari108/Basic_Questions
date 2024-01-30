package com.basic_questions;
import java.util.Scanner;

public class MaximumAmoungTwoNUmbers {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the first number :");
	int a = sc.nextInt();
	System.out.println("ENter the second number :");
	int b= sc.nextInt();
	if (a>b) {
		System.out.println(a+" "+"is Greater than "+b);
		
	}
	else {
		System.out.println(b+" "+"is Greater than "+a);

	}
}

}
