package com.jspiders.programmingstring;

public class Example {
  public static void main(String[] args) {
	  
	  String s="ab@123";
	  int ac=0,dc=0,sc=0;
	  
	  for(int i=0; i<=s.length()-1;i++)
	  {
		  char ch=s.charAt(i);
		  if(ch>'A'&& ch<'Z' || ch>='a'&& ch<='z')
		  {
			  ac++;
		  }
		  else if(ch>='0' && ch<='9')
		  {
			  dc++;
		  }
		   else {
				  sc++;
			   }
	  }
	  System.out.println("Alphabet " +ac);
	  System.out.println("Digit "+dc);
	  System.out.println("Special char " +sc);
   }
}
