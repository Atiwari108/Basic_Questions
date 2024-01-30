package com.basic_questions;
import java.util.Scanner;

//Write a programs to Display Last Digit OF Number

public class LastDigitOfNumber {
	public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int num = sc.nextInt();
         
         int lastDigit = num%10;
         
         System.out.println("The last Digit of the Number is "+lastDigit);
    }
}
