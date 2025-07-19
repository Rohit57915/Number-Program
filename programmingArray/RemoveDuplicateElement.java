package com.jspiders.programmingArray;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElement 
{
  public static void main(String[] args) 
  {
	  int a[]= {10,20,30,20,10,40};
	  
	  System.out.println("Before removing duplicate");
	  System.out.println(Arrays.toString(a));
	  
	  HashSet<Integer>hs=new HashSet();
	  for(int i=0;i<=a.length-1;i++)
	  {
		  hs.add(a[i]);
	  }
	  int b[]= new int[hs.size()];
	  int index=0;
	  
	  for(int ele: hs)
	  {
		  b[index]=ele;
		  index++;
	  }
	  System.out.println("Aftre removing Duplicate");
	  System.out.println(Arrays.toString(b));
  }
}
