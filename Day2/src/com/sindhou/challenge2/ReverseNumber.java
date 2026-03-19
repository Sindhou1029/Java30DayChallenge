package com.sindhou.challenge2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number more than or equal to two digit: ");
		
		int num = sc.nextInt();
	
		int rev= 0;
		
		while (num!=0)
		{
		int digit = num%10;
		
		rev = rev*10 + digit;
		
         num =  num/10;		
		}
		
		System.out.println(" The reversed number is " + rev);
	}

}
