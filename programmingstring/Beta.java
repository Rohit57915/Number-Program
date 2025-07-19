package com.jspiders.programmingstring;

public class Beta 
{
  public static void main(String[] args) {
	   
	  String s="gadaga";
	  String rev=new StringBuffer(s).reverse().toString();
	  if(s.equals(rev))
	  {
		  System.out.println("Pallindrome");
	  }
	  else
	  {
		  System.out.println("Not Pallindrom");
	  }
}
}
