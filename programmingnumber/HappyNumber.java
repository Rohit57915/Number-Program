package com.jspiders.programmingnumber;

import java.util.Scanner;

public class HappyNumber
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		
		if(isHappyNumber(n))
			System.out.println("Happy Number");
		else
		    System.out.println("Not Happy Number");
	}   
    public static boolean isHappyNumber(int n)
    {
    	
    			while(n>9)
    			{
    				int sum=0;
    				while(n>0)
    				{
    					int rem=n%10;
    					sum=sum=rem*rem;
    					n=n/10;
    				}
    				n=sum;
    			}
    			return n==1;
    }
}
