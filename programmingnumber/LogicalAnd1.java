package com.jspiders.programmingnumber;

import java.util.Scanner;

public class LogicalAnd1 
{
    public static void main(String[] args)
    {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter any Number : ");
    	int n=scn.nextInt();
    	
    	if(n%3==0 && n%5==0)
    	{
    		System.out.println("Sanju weds Geeta");
    	}
    	else if(n%5==0)
    	{
    		System.out.println("Geeta");
    	}
    	else if(n%3==0)
    	{
    		System.out.println("Sanju");
    	}
    	else
    	{
    		System.out.println("Breakup");
    	}
    }
}
