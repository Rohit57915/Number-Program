package com.jspiders.programmingArray;

public class RepeatedMoreTime 
{
   public static void main(String[] args) 
   {
      int a[] = {10, 20, 20, 10, 20};
      
      int maxCount = 0, max = 0;
      boolean b[] = new boolean[a.length];  // Correct array initialization

      for (int i = 0; i < a.length; i++)  // Correct loop condition
      {
         if (b[i]==false)  // If element is not already counted
         {
            int count = 1;

            for (int j = i + 1; j < a.length; j++)  // Correct increment
            {
               if (a[i] == a[j])
               {
                  count++;
                  b[j] = true;  // Mark as counted
               }
            }

            if (count > maxCount)  // Find most repeated element
            {
               maxCount = count;
               max = a[i];
            }
         }
      }

      System.out.println("Most repeated element: " + max + " (repeated " + maxCount + " times)");
   }
}
