package com.basic_questions;
import java.util.Scanner;

//Accept the age of 4 people  and display the youngest one.
public class AgeOfFour {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the age :");
	int age1 = sc.nextInt();
	System.out.println("enter the age :");
	int age2 = sc.nextInt();
	System.out.println("enter the age :");
	int age3 = sc.nextInt();
	System.out.println("enter the age :");
	int age4 = sc.nextInt();
	 if(age1<age2 && age1<age3)

         System.out.println("First Person is the Youngest.");

     else if(age2<age1 && age2<age3)

         System.out.println("Second Person is the Youngest.");

     else if(age3<age1 && age3<age2)

         System.out.println("Third Person is the Youngest.");
}
}
