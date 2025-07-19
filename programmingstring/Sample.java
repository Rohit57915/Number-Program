package com.jspiders.programmingstring;

public class Sample
{
 public static void main(String[] args) 
 {
	  String s="a@123";
	  int sum=0;
	  
	  for(int i=0; i<=s.length()-1; i++)
	  {
		  char ch=s.charAt(i);
		  
		  if(ch>='0' && ch<='9')
		  {
			  sum=sum+ch-48;
		  }
	  }
	  System.out.println(sum);
  }
}
