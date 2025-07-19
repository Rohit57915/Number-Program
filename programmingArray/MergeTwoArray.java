package com.jspiders.programmingArray;

import java.util.Arrays;

public class MergeTwoArray
{
    public static void main(String[] args) 
    {
        int a[] = {10, 20, 30};
        int b[] = {40, 60, 70};
        
        int array[] = merge(a, b);
        System.out.println(Arrays.toString(array));
    }

    private static int[] merge(int[] a, int[] b)
    {
        int c[] = new int[a.length + b.length];
        int i = 0;

        // Copy elements from array 'a'
        for (int j = 0; j < a.length; j++)
        {
            c[i++] = a[j];
        }

        // Copy elements from array 'b'
        for (int j = 0; j < b.length; j++)
        {
            c[i++] = b[j];
        }

        return c;
    }
}
