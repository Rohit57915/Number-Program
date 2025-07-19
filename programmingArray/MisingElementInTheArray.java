package com.jspiders.programmingArray;

import java.util.Arrays;

public class MisingElementInTheArray 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 1, 10, 8};
        Arrays.sort(arr);  // Sort the array
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.print("Missing elements: ");
        
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int current = arr[i];
            int next = arr[i + 1];
            
            // Check for gaps between current and next element
            for (int j = current + 1; j < next; j++) 
            {
                System.out.print(j + " ");
            }
        }
    }
}

