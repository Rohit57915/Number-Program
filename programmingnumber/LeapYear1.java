package com.jspiders.programmingnumber;

import java.util.Scanner;

public class LeapYear1 
{
     public static void main(String[] args) 
     {
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Enter any Number : ");
	    int n=scn.nextInt();
	    
	    if(n%4==0 && n%100!=0)
	    {
	    	System.out.println("Leap Year");
	    }
	    else if(n%400==0)
	    {
	    	System.out.println("Leap Year");
	    }
	    else
	    {
	    	System.out.println("Not Leap Year");
	    }
	}
}
