package com.jspiders.programmingnumber;

public class ConvertDecimalToHexa
{
  public static void main(String[] args) 
  {
	  int dec=31;
	  String hex="";
	  
	  while(dec>0)
	  {
		  int rem=dec%16;
		  if(rem>9)
		  {
			  hex=(char)(rem+55)+hex;
		  }
		  dec=dec/16;
	  }
	  System.out.println(hex);
   }
}
