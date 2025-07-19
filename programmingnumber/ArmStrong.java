package com.jspiders.programmingnumber;

import java.util.Scanner;

public class ArmStrong
{
    public static void main(String[] args)
    {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		if(isArmStrong(n))
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not ArmStrong Number");
	}
    
    static boolean isArmStrong(int n)
    {
    	int sum=0;
    	int org=n;
    	
    	int cd=countDigit(n);
    	
    	while(n>0)
    	{
    		int rem=n%10;
    		int pow=(int)Math.pow(rem, cd);
    		sum=sum+pow;
    		
    		n=n/10;
    	}
    	return sum==org;
    }
    static int countDigit(int n)
    {
    	int count=0;
    	
    	while(n>0)
    	{
    		count++;
    		n=n/10;
    	}
    	return count;
    }
}
