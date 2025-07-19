package com.jspiders.programmingnumber;

import java.util.Scanner;

public class UniqueNumberExample1  
{  
    public static void main(String args[])  
     {  
         int rem1;
         int rem2;
         int num1; 
         int num2; 
         int count = 0;  
         Scanner sc=new Scanner(System.in); 
         System.out.print("Enter the number: ");  
         int n=sc.nextInt();  
         
         //num1 and num2 are temporary variable  
          num1 = n;  
          num2 = n;  
                          
       while (num1 > 0)       //iterate over all digits of the number 
       {  
          rem1 = num1 % 10;     //detrmins the last digit of the number 
          
            while (num2 > 0)  
            {  
                             
              rem2 = num2 % 10;  //finds the last digit 

             if (rem1 == rem2)  //comparing the last digit  
              {  
    
               count++;         //increments the count variable by 1  
              }  

               num2 = num2 / 10;  //removes the last digit from the number  
           }  
  
               num1 = num1 / 10;  //removes the last digit from the number
        }  
     if (count == 1)  
          {  
            System.out.println("The number is unique.");  
          }  
     else  
          {  
            System.out.println("The number is not unique.");  
          }  
    }  
}  
