package com.basic_questions;

import java.util.Scanner;
//Program to print maximum among three numbers.

public class Maximum3Num {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the first no :");
	int a = sc.nextInt();
	System.out.println("Enter the second no :");
	int b=sc.nextInt();
	System.out.println("Enter the Third no :");
	int c = sc.nextInt();
	
	if(a>b && a>c) {
		System.out.println(a+" is Bigger than "+b+" And "+c);
	}
	else if ( b>a ) {
		System.out.println(b+" Is Bigger Than "+a+" and "+c);
	}
	else {
		System.out.println(c+" Is Bigger Than "+b+" And "+a);
	}
}
}
