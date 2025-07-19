package com.jspiders.programmingnumber;

import java.util.Scanner;

public class OddDigit 
{
     public static void main(String[] args) 
     {
		
		int n=345;
		int count=0;
		
		while(n>0)
		{
			int rem=n%10;
			
			if(rem%2!=0)
			{
				count++;
				
			}
			n=n/10;
		}	
		System.out.println(count);
	 }
}
