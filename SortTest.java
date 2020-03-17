import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
   This program tests the methods for the Sort.java class and determine if
   given a random integer array of sizes 100,1000,10000,100000 that
   the bubbleSort, selectionSort and mergeSort method works with different
   size array from and the time it takes to sort the arrays increase as the sizes
   increases.  The results are output to the file sorttestresults.csv.
   -Written by Kymberly Ayodeji
   -For use with APCSA Sorting Homework
   - Started: February 29, 2020
     Updated: March 17, 2020
*/
public class SortTest {
    public static void main(String[] args) throws FileNotFoundException
    {

      // Set up to write to file.
      String outputFileName ="sorttestresults.csv";
      PrintWriter out = new PrintWriter(outputFileName);

      //Setup variables to be used in testing
      long startTime, endTime;
      double duration;
      int[] sizes = {100,1000,10000};
      int n;

      for (int k=0; k< sizes.length; k++)
      {
        n = sizes[k];
        //Create two copies of an integer array of n random values from 0 to n
        int[] original_a = new int[n];
        int[] a = new int[n];
        for (int i = 0; i< n; i++)
        {
            original_a[i]= (int) (n*Math.random());
            a[i] = original_a[i];
        }
         //
        out.print("Starting Array: ");
        out.println(printarraystring(a,5,true) + " ...... " + printarraystring(a,5,false));
        Sort s = new Sort();

        startTime = System.currentTimeMillis();
        s.bubbleSort(a,1,n-2,true);
        endTime = System.currentTimeMillis();
        duration = (double) (endTime - startTime);

        out.print("n = " + n + ": bubbleSort time was " + duration + " secs");
        out.print(" : " + printarraystring(a,6,true) );
        out.println(" ......  " + printarraystring(a,6,false));

        a = original_a.clone();
        startTime = System.currentTimeMillis();
        s.selectionSort(a,1,n-2,true);
        endTime = System.currentTimeMillis();
        duration = (double) (endTime - startTime);

        out.print("n = " + n + ": selectionSort time was " + duration + " secs");
        out.print(" : " + printarraystring(a,6,true) );
        out.println(" ......  " + printarraystring(a,6,false));

        a = original_a.clone();
        startTime = System.currentTimeMillis();
        s.mergeSort(a,1,n-2,true);
        endTime = System.currentTimeMillis();
        duration = (double) (endTime - startTime);

        out.print("n = " + n + ": mergeSort time was " + duration + " secs");
        out.print(" : " + printarraystring(a,6,true) );
        out.println(" ......  " + printarraystring(a,6,false));
      }
        //Test the reversed method:
        int[] original_r = new int[20];
        int[] r = new int[20];
        for (int i = 0; i< 20; i++)
        {
            original_r[i]= (int) (20*Math.random());
            r[i] = original_r[i];
        }

        out.print("\nTesting REVERSE: Starting Array: ");
        out.println(printarraystring(r,5,true) + " ...... " + printarraystring(r,5,false));
        //Sort s = new Sort();
        Sort rs = new Sort();
        startTime = System.currentTimeMillis();
        rs.bubbleSort(r,1,18,false);
        endTime = System.currentTimeMillis();
        duration = (double) (endTime - startTime);

        out.print("n = 20: Reversed bubbleSort time was " + duration + " secs");
        out.print(" : " + printarraystring(r,6,true) );
        out.println(" ......  " + printarraystring(r,6,false));

        r = original_r.clone();
        startTime = System.currentTimeMillis();
        rs.selectionSort(r,1,18,false);
        endTime = System.currentTimeMillis();
        duration = (double) (endTime - startTime);

        out.print("n = 20: Reversed selectionSort time was " + duration + " secs");
        out.print(" : " + printarraystring(r,6,true) );
        out.println(" ......  " + printarraystring(r,6,false));

        r = original_r.clone();
        startTime = System.currentTimeMillis();
        rs.mergeSort(r,1,18,false);
        endTime = System.currentTimeMillis();
        duration = (double) (endTime - startTime);

        out.print("n = 20: Reversed mergeSort time was " + duration + " secs");
        out.print(" : " + printarraystring(r,6,true) );
        out.println(" ......  " + printarraystring(r,6,false));

        out.close();
    }

    public static String printarraystring(int[] array, int l, boolean foward)
    {
        String s="";
        int alength = l;
        if (l > array.length || l<1)
        {
             alength = array.length;
        }

        if (foward)
        {
          for (int i=0; i< alength; i++)
          {
              if (i< alength-1)
              {
                  s = s + array[i] + ",";
              }
              else
              {
                  s = s + array[i];
              }
          }
        }
        else
        {
            for (int i= (array.length-alength); i < array.length; i++)
            {
                if (i < (array.length-1))
                {
                    s = s + array[i] + ",";
                }
                else
                {
                  s = s + array[i];
                }
            }
        }
          return s;
    }
}
