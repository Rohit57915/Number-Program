package com.jspiders.programmingArray;

public class PairElementSumGivenNumber 
{
  public static void main(String[] args) 
  {
	   int a[]= {1,2,6,4,5,0,8};
	   
	   int n=6;
	   
	   for(int i=0; i<=a.length-1;i++)
	   {
		   for(int j=i+1; j<=a.length-1; j++)
		   {
			   if(a[i]+a[j]==n)
			   System.out.println(a[i]+ " + " +a[j]+"paired");
		   }
	   }
   }
}
