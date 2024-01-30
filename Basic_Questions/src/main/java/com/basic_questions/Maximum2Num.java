package com.basic_questions;

import java.util.Scanner;

public class Maximum2Num {
	
	public static void main(String[] args) {
		//Program to print maximum among two numbers.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First No:");
		int a = sc.nextInt();
		System.out.println("Enter Second No:");
		int b = sc.nextInt();
		if (a>b) {
			System.out.println(a+" is Greater than "+b);
		}else {
			System.out.println(b+" is Greater than "+a);
		}
	}
}
