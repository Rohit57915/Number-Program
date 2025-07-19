package com.jspiders.programmingArray;

import java.util.Scanner;

public class LinearSearch 
{
  public static void main(String[] args) 
  {
	  int a[]= {5,1,4,2,3};
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Element");
	  int n=sc.nextInt();
	  
	  int pos=linerSearch(a,n);
	  if(pos==-1)
	  {
		  System.out.println("Not Found");
	  }
	  else
	  {
		  System.out.println("Element is presence "+pos+" index");
	  }
  }
  static int linerSearch(int a[],int n)
  {
	  for(int i=0; i<=a.length-1;i++)
	  {
		  if(a[i]==n)
			  return i;   //i represent index value
	  }
	  return -1;
  }
}
