package com.basic_questions;
import java.util.Scanner;

public class LastDigitDivisibleByThree {
//	Write a programs to check weather the last digit of number(Enter By user ) is divisible by 3 or not

	public static void main (String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int num = sc.nextInt();
         
         int lastDigit = num%10;
         
         System.out.println("The last Digit of the Number is "+lastDigit);

         if (lastDigit%3==0) {
        	 System.out.println("is divisible by 3 ");
         }
         else {
        	 System.out.println("is not divisible by 3");
         }
         
         
    }
}
