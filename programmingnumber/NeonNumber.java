package com.jspiders.programmingnumber;

import java.util.Scanner;

public class NeonNumber 
{
     public static void main(String[] args) {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter any Number");
    	 int n=sc.nextInt();
    	 
    	 int sum=0;
    	 int squ=n*n;
    	 
    	 while(squ!=0)
    	 {
    		 int rem=squ%10;
    		 sum=sum+rem;
    		 squ=squ/10;
    		 
    	 }
    	 if(n==sum)
    	 {
    		 System.out.println("Neon Number ");
    	 }
    	 else
    	 {
    		System.out.println("Not Neon Number"); 
    	 }
	}
}
