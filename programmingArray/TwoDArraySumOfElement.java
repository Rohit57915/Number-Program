package com.jspiders.programmingArray;

public class TwoDArraySumOfElement {
public static void main(String[] args) {
	
	    int psum=0;
	    int ssum=0;
	    
	    int a[][]= {{10,20,30},{40,50,60},{20,80,90}};
	    
	    for(int i=0; i<=a.length-1; i++)
	    {
	    	for(int j=0; j<a[i].length-1; j++)
	    	{
	    		if(i==j)
	    		{
	    			psum=psum+a[i][j];
	    			
	    		}
	    		if(i+j==a.length)
	    		{
	    			ssum=ssum+a[i][j];
	    			
	    		}
	    	
	       }
	    }
    	System.out.println("primary Diagonal" +psum);
    	System.out.println("Secondry Diagonal" +ssum);
	
  }
}
