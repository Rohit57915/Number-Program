package com.jspiders.programmingArray;

public class FirstFourDublicateElement
{
	public static void main(String[] args)
	   {
		  int a[]= {10,20,30,10,20,30,40,50,60,40,50};
		  
		  boolean b[]=new boolean[a.length];
		  int DublicateEleCount=0;
		  for(int i=0; i<=a.length-1; i++)
		  {
			  if(b[i]==false)
			  {
				  int count=1;
				  
				  for(int j=i+1; j<=a.length-1;j++)
				  {
					  
					if(a[i]==a[j])
					 {
						 count++;
						 b[j]=true;
					 }
				
				   }
				  if(count>1)
				  {  
					System.out.println(a[i]+ " Dublicate Element Number");
					DublicateEleCount++;
					
					if(DublicateEleCount==4)
					break;
				  }
		     }
	      }
	   }
}
