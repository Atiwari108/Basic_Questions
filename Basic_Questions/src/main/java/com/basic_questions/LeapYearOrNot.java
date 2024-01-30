package com.basic_questions;
import java.util.Scanner;
//Program to check whether a year is a leap year or not.
public class LeapYearOrNot {

	public static void main (String arg[]) {
	Scanner sc= new Scanner (System.in);
	 System.out.println("enter the year");
	 int y= sc.nextInt();
	 if (y%4==0) {
		 System.out.println("is leap year");
	 }
	 else {
		 System.out.println("is not leap year");
		 }
}
}