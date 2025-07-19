package com.jspiders.programmingArray;

import java.util.Arrays;

public class ZigzagFormateMergeTwoArray 
{
  public static void main(String[] args)
  {
	 int a[]= {10,20,30};
	 int b[]= {100,200,300,400};
	 
	 int c[]= zigzag(a,b);
	 {
			 System.out.println(Arrays.toString(c));
	 }
  }

  public static int[] zigzag(int a[],int b[])
  {
	  int c[] = new int[a.length + b.length];
	int in=0;
	
	for(int i=0; i<=a.length-1||i<=b.length-1;i++)
	{
		if(i<=a.length-1)
		{
			c[in]=a[i];
			in++;
		}
    	if(i<=b.length-1)
		{
			c[in]=b[i];
			in++;
		}
    }
	
	return c;		
  }

}