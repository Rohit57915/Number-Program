package com.jspiders.programmingnumber;

import java.util.Scanner;

public class SmallestNumber2 
{
    public static void main(String[] args) 
    {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter First Number :");
		int n1=scn.nextInt();
		System.out.println("Enter Second Number :");
		int n2=scn.nextInt();
		System.out.println("Enter Third Number :");
		int n3=scn.nextInt();
		
		int small;
		
		small=(n1<n2 && n1<n3)? n1:(n2<n3)? n2:n3;
		
		System.out.println("Smallest Number " +small);
	}
}
