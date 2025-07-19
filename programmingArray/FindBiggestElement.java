package com.jspiders.programmingArray;

public class FindBiggestElement 
{
  public static void main(String[] args)
  {
	   int a[]= {10,30,20,15,25};
	   
	   int big=a[0];
	   for(int i=0; i<=a.length-1; i++)
	   {
		   if(a[i]>big)
		   {
			   big=a[i];
		  
		   }
		   
	   }
	   System.out.println(big);
			   
  }
}
