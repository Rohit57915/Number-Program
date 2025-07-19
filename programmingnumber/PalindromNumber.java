package com.jspiders.programmingnumber;

import java.util.Scanner;

public class PalindromNumber {
         public static void main(String[] args) {
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter any Number");
			   int n=sc.nextInt();
			   
			   int sum=0;
			   int original;
			   original=n;
			   
			   while(n>0)
			   {
				  int rem=n%10;
				  sum=sum*10+rem;
				  n=n/10;
			   }
			   if(original==sum)
			   {
				   System.out.println("PalindromNumber");
			   }
			   else
			   {
				   System.out.println("Not PalindromNumber");
			   }
		}
}
