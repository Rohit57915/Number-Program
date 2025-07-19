package com.jspiders.programmingArray;

public class TwoDArray {
    public static void main(String[] args) {
		   int a[][]= {{10,15,20},{25,35,45},{46,49,51}};
		   
		   for(int i=0; i<=a.length-1; i++)
		   {
			   for(int j=0; j<=a[i].length-1; j++)
			   {
				   System.out.print(a[i][j]+" ");
			   }
		   }
		   System.out.println();
 }
}
