package com.basic_questions;

public class SumEvenNumbers {
public static void main(String[] args) {
//	int sum =0;
//	for (int i =0;i<=100;i++) {
//		
//		
//		
//		if (i%2==0) {
//			sum =sum+i;
//		}
//	}
//	System.out.println(sum);
//}
//
//}





//public class SumOfEvenNumbers {
//    public static void main(String[] args) {
//        // Calculate and print the sum of all even numbers between 1 and 100 using a for loop
        int sum = 0;

        for (int i = 1; i <= 100; i +=2 ) {
            sum += i;
        }

        System.out.println("Sum of even numbers between 1 and 100: " + sum);
    }
}
