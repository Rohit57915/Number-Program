package com.jspiders.programmingstring;

public class Alpha {
  public static void main(String[] args) {
	   
	  String s="gadag";
	  if(isPallindrome (s))
	    System.out.println("Pallindrome");
	  else
		  System.out.println("Not Pallindrome");
  }
  public static boolean isPallindrome(String s) 
  {
	  String rev="";
	  for(int i=s.length()-1; i>=0;i--)
	  {
		  char ch=s.charAt(i);
		  rev=rev+ch;
	  }
	  return(s.equals(rev));
  }
}
