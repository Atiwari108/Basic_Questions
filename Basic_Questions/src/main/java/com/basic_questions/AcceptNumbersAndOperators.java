package com.basic_questions;

import java.util.Scanner;

public class AcceptNumbersAndOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();
		System.out.println("Enter the operator :");
		char c = sc.next().charAt(0);

		switch(c) {

		case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/':

			System.out.println(a+"/"+b+"="+(a/b));
			break;

		case '-':

			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '+':

			System.out.println(a+"+"+b+"="+(a+b));
			break;

		case '%':

			System.out.println(a+"%"+b+"="+(a%b));
			break;

		default:
			System.out.println("Enter valid operator");
		}

	}
}
