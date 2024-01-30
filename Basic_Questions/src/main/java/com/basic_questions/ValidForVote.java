package com.basic_questions;
import java.util.Scanner;
public class ValidForVote {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);


System.out.println("enter your age :");
int age = sc.nextInt();
if (age>=18) {
	System.out.println("u can vote ");
	
}
else {
	System.out.println("u can't vote");
}
	
	}
}
