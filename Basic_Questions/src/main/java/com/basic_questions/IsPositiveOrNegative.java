package com.basic_questions;
import java.util.Scanner;

public class IsPositiveOrNegative {
//	Program to check whether a given number is a positive or negative number.

	public static void main (String ar[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		       
		        if(num>0)
		            System.out.println(num + " is POSITIVE NUMBER.");
		        else if(num<0)
		            System.out.println(num + " is NEGATIVE NUMBER.");
		        else
		            System.out.println(num + " is a ZERO.");
		
	}
	  
	
}
