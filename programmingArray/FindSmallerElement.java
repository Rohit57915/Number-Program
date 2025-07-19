package com.jspiders.programmingArray;

public class FindSmallerElement 
{
   public static void main(String[] args)
   {
	 int a[]= {30,10,15,25,40};
	 
	 int small=a[0];
	 
	 for(int i=0; i<=a.length-1; i++)
	 {
		 if(a[i]<small)
			 small=a[i];
	 }
	 System.out.println(small);
   }
}
