package com.jspiders.programmingnumber;

public class AutomorphicNumber 
{
   static boolean isAutomorphic(int n)
	    {
	      if(n < 0) n= -n;
	        int sq = n * n;

	        while (n > 0)
	        {
	          if (n % 10 != sq % 10)
	                return false;
	            n=n/10;
	            sq=sq/10;
	        }

	        return true;
	    }

	    public static void main(String[] args)
	    {
	        int n=-7;

	        System.out.println(isAutomorphic(n) ? "Automorphic" : "Not Automorphic");
	    }
	}

