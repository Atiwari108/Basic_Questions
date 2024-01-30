package com.basic_questions;
import java.util.Scanner;

public class MaximumAmoungThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("ENter the second number :");
		int b= sc.nextInt();
		System.out.println("ENter the  Third number :");
		int c= sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a+" "+"is Greater than "+b+"and"+c);
			
		}
		else if (b>a && b>c) {
			System.out.println(b+" "+"is Greater than "+a+"and"+c);

		}
		else {
			System.out.println(c+" "+"is Greater than "+a+" and"+b);

		}
		
	}
}
