package com.sindhou.challenge2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		boolean isprime =true;
		
		for (int i=2; i<num;i++)
		{
			if (num %i ==0)
			{
			 isprime = false;
			 break;
			}
			
	}

		if(isprime && num>1)
		{
			System.out.println("It is a prime number");
		}
		
		else
		{
			System.out.println("It is not a prime number");
		}
		

	}

}
