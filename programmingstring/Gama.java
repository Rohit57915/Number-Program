package com.jspiders.programmingstring;

public class Gama {
  public static void main(String[] args) {
	   
	  String s="gadag";
	if(isPallindrome(s))
		  System.out.println("Pallindrome");
	  else
	   System.out.println("Not pallindrom");
  }
  public static boolean isPallindrome(String s)
  {
	  int i=0; 
	   int  j=s.length()-1;
	   
	   while(i<j)
	   {
		   if(s.charAt(i)!=s.charAt(j))
			   return false;
		   i++;j--;
	   }
	   return true;
  }
}
