package com.jspiders.programmingArray;

public class SumOfOddElement 
{
  public static void main(String[] args) 
   {
	    int a[]= {10,15,20,27};
	    int sum=0;
	    for(int i=0; i<=a.length-1; i++)
	    {
	    	if(a[i]%2!=0)
	    	{
	    		sum+=a[i];
	    	}
	    }
	    System.out.println(sum);
   }
}
