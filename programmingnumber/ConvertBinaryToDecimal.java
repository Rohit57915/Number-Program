package com.jspiders.programmingnumber;

public class ConvertBinaryToDecimal 
{
   public static void main(String[] args) 
   {
	  int bin=1101;
	  int dec=0;
	  int p=0;
	  
	  while(bin>0)
	  {
		  int rem=bin%10;
		  int pow=(int)Math.pow(2, p);
		  dec=dec+rem*pow;
		  bin=bin/10;
		  p++;
		  		  
	  }
	  System.out.println(dec);
  }
}
