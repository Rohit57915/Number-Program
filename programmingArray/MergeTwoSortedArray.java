package com.jspiders.programmingArray;

import java.util.Arrays;

public class MergeTwoSortedArray 
{
  public static void main(String[] args) 
  {
	 int a[]= {5,10,20,30};
	 int b[]= {7,15,23,24,35,50};
	 
	 int c[]=mergeArray(a,b);
	 {
		 System.out.println("After Merging");
		 System.out.println(Arrays.toString(c));
	 }
			 
   }
  static int[] mergeArray(int a[],int b[])
  {
	  int c[]=new int[a.length+b.length];
	  int i=0,j=0,k=0;
	  
	  while(i<=a.length-1 && j<=b.length-1)
	  {
		  if(a[i]<b[j])
		  {
			  c[k]=a[i];
			  k++;i++;
		  }
		  else
		  {
			  c[k]=b[j];
			  k++; j++;
		  }
	  }	  
		  while(i<=a.length-1)
		  {
			  c[k]=a[i];
			  k++; i++;
		  }
		  while(j<=b.length-1)
		  {
			  c[k]=b[j];
			  k++; j++;
		  }
	  
	  return c;
  }
     
  }

