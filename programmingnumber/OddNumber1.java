package com.jspiders.programmingnumber;

import java.util.Scanner;

public class OddNumber1 
{
   public static void main(String[] args)
   {
	    Scanner ref=new Scanner(System.in);
	    System.out.println("Enter any Number");
	    int n=ref.nextInt();
	    int i=1;
	    
	    while(i<=n)
	    {  
	    	
	    	   i=i+2;
	    	   System.out.println("Odd Number :" +i);
	    }
    }
}

