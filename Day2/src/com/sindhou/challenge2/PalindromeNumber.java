package com.sindhou.challenge2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		int org=num;
		int rev =0;
		
		while(num!=0)
		{
			int digit = num%10;
			rev = rev*10+digit;
			num=num/10;
			}
		
		if (rev==org)
		{
			System.out.println("The given number is a palindrome");
		}
		
		else
		{
			System.out.println("The given number is not a palindrome");
		}
		
		
				
	}

}
