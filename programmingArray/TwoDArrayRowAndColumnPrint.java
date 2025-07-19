package com.jspiders.programmingArray;

public class TwoDArrayRowAndColumnPrint {
  public static void main(String[] args) {
	   
	  int a[][]= {{10,20,30},{40,50,60},{70,50,90}};
	  
	  for(int i=0; i<=a.length-1; i++)
	  {
		  for(int j=0; j<=a[i].length-1; j++)
		  {
			  System.out.print(a[i][j]+" ");
		  }
		  System.out.println();
	  }
	  
   }
}
