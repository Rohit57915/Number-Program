package com.jspiders.programmingnumber;

import java.util.Scanner;

public class PrimeParsent 
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter any Number");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
		if(isPrime(i))
			System.out.println(i);
		}
	}
    public static boolean isPrime(int n)
    {
    	if(n<=1)
    		return false;
    	for(int i=2; i<=n/2; i++)
    	{
    		if(n%i==0)
    			 return false;
    	}
    	return true;
    }
}
