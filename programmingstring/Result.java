package com.jspiders.programmingstring;

public class Result {
  public static void main(String[] args) {
	 
	  String s="Shri Ram is God Of Hindu";
	  int count=0;
	  
	  for(int i=0; i<=s.length()-1;i++)
	  {
		  char ch[]=s.toCharArray();  // Move it outside the loop to modify the array
		  
		  if ((i == 0 && ch[i] != ' ') || (ch[i] != ' ' && ch[i - 1] == ' ')) // check How Many Space in Sentence
		  {
			  count++;
		  }
	  }
	  System.out.println(count);
}
}
