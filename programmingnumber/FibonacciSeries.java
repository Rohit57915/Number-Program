package com.jspiders.programmingnumber;

public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        int total = 10;      // Number of Fibonacci terms to print
        int a = 0;
        int b = 1;
        int	sum;
        
       // System.out.print("Fibonacci Series: " + a + " " + b + " "); 
        
        for (int count = 3; count <= total; count++)   // Start from 3 since 0 and 1 are printed
        { 
            sum = a + b;
            System.out.print(sum + " ");  
            a = b;  
            b = sum;
        }
    }
}
