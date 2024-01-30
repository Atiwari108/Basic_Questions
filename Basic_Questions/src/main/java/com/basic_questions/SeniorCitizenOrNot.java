package com.basic_questions;

import java.util.Scanner;
public class SeniorCitizenOrNot {
 
	 
	  public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Input age: ");
	        int age = in.nextInt();        
	 
	    if(age>= 60)
	    {
	         System.out.println("senior Citizen");
	    }
	     
	    else
	    {
	        System.out.println("Not Senior Citizen");
	    }
	 
	    }  
	}

