package com.jspiders.programmingArray;

import java.util.Scanner;

public class Palindrom
{
      public static void main(String[] args)
      {
		      Scanner sc=new Scanner(System.in);
		       System.out.println("Enter Size");
				int size=sc.nextInt();
				int a[]=new int[size];
				System.out.println("Enter "+size+ "Array Element" );
				
				for(int i=0; i<=a.length-1; i++)
				{
					a[i]=sc.nextInt();
				}
    	  int count=0;
    	  
    	  for(int i=0; i<=a.length-1;i++)
    	  {
    		  //true
    		  if(isPalindrome(a[i]))
    		  {
    			  count++;
    		  }
    	  }
    	  System.out.println("No of Palindrome Element are" +count);
	  }
      
      public static boolean isPalindrome(int n)
      {
    	  int rev=0;
    	  int temp=n;
    	  while(n>0)
    	  {
    		  int rem=n%10;
    		  rev=rev*10+rem;
    		  n=n/10;
    	  }
		if(temp==rev)
			return true;
		else
			return false;
      }
}
