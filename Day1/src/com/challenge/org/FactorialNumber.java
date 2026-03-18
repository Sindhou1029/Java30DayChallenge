package com.challenge.org;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		
		int n = sc.nextInt();
		int mul =1;
		
		for (int i=n; i>=1; i--)
		{
			
			
			  mul *=i;
			
		}
				
         System.out.println("Factorial of n is :" + mul);
	}

}
