package com.jspiders.programmingnumber;
import java.util.Scanner;

public class NearestPrimeNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        int nearestPrime = findNearestPrime(n);
        System.out.println("Nearest Prime Number: " + nearestPrime);
    }

    public static boolean isPrimeNumber(int n) 
    {
        if (n < 2) 
        	return false;                   // 0 and 1 are not prime numbers
        for (int i = 2; i * i <= n; i++)          // Optimized check (sqrt method)
           {                            
            if (n % i == 0)
            {
                return false;
            }
           }
        return true;
    }

 public static int findNearestPrime(int n) 
   {
           if (isPrimeNumber(n)) 
              {
                return n;             // If the number itself is prime, return it
              }

               int lower = n - 1;
               int upper = n + 1;

             while (true)
                {
                   if (isPrimeNumber(lower)) 
                        {
                            return lower;        // Return the lower prime first if both are equal distance
                         }
                   if (isPrimeNumber(upper)) 
                       {
                         return upper;
                        }
                         lower--;
                         upper++;
                 }
    }
}
