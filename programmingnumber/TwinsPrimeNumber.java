package com.jspiders.programmingnumber;

import java.util.Scanner;

public class TwinsPrimeNumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if (isPrime(n1) && isPrime(n2) && Math.abs(n1 - n2) == 2) 
        {
            System.out.println(n1 + " and " + n2 + " are Twin Primes.");
        } else 
        {
            System.out.println(n1 + " and " + n2 + " are NOT Twin Primes.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) 
    {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)   // Efficient prime check
        { 
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

