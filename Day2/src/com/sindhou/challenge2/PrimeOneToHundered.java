package com.sindhou.challenge2;

public class PrimeOneToHundered {
	
	public static void main(String[] args) {
		
		
	int n=0;

			for ( n =1; n<=100; n++)
		{
			boolean isPrime=true;
			for (int i=2; i<n; i++)
				
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
				
				
			}
			
			if(isPrime && n>1)
			{
				System.out.println(n +  "It is a prime number");
			}
			
			else
			{
				System.out.println(n+ "It is not a prime number");
			}
			
		
			
		}
		
		}
	
	}


