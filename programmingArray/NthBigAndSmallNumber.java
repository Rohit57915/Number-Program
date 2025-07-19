package com.jspiders.programmingArray;

import java.util.Arrays;
import java.util.HashSet;

public class NthBigAndSmallNumber 
{
     public static void main(String[] args) 
     {
	    int a[]= {40,10,20,30,20};
	    int n=3;
	    
	    int b[]=removeDuplicates(a); //Remove Duplicate
	    
	    Arrays.sort(b); //sorting array Element
	    System.out.println("Arrays.toString(b)");
	    System.out.println(b[n-1]); //  nth Smallest element
	    System.out.println(b[b.length-n]); // nth biggest element
     }

	    public static int[] removeDuplicates(int a[])
	    {
	    	HashSet<Integer>hs=new HashSet();
	    	
	    	for(int i=0;i<=a.length-1;i++)
	    	{
	    		hs.add(a[i]);
	    	}
	    	int b[]=new int[hs.size()]; // creating new array new arrays with size of Hashset
	    	
	    	int in=0;
	    	
	    	for(int ele: hs) // copying one by one ele from HashSet to Arrays  
	    	{
	    		b[in]=ele;
	    		in++;
	    	}
	    	return b;
	    }
        
}

