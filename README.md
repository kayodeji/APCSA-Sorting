# APCSA-Sorting

#Assignment Due on Monday, March 2
You will implement a number of sorting algorithms, and then test their performance. This assignment will consist of not just coding, but also testing your code using large data sets. Note that when all of your code is complete and debugged, you still have a fair amount of work to do -- so start early!

For the assignment, you will need to write sorting algorithms for: Selection Sort, Bubble Sort, and Merge sort that work on arrays of random sizes. Your sorting project will contain:
Sorting class interface (provided) and
Sort class, which implements the interface class
SortTest class which contains your main program
It is critically important that:
Your sorting class be named Sort
Your Sort class has a constructor that takes no parameters. Your Sort class implements the interface as is, without changes.
Otherwise, the grading program will not function correctly, and you will lose points!  Also, check to make sure your sorting algorithms are correct.  

Efficiency Testing
After you have coded your algorithms, you need to test them, to see how long each sorting algorithm takes to run.  You should test each algorithm on both random and sorted lists of sizes 100, 1000, 5000, 10000, 50000, 75000, 100000 and 500000.  You can get a random list using the java class Random, located in java.util.Random  To test the speed of your sorting algorithms, you should use the System.currentTimeMillis() method, which returns a long that contains the current time (in milliseconds). Call System.currentTimeMillis() before and after the algorithm runs, and subtract the two times. Unfortunately,  using currentTimeMillis before and after a function only gives an accurate time estimate if the function takes a long time to run (that is, at least a couple of seconds).  Since running some sorting algorithm on a list of size 1000 will take a very short time, you will need to do something like the following:

   long startTime, endTime;
   double duration;
   Random randomGenerator = new Random();
   Sort sorter = new Sort();

   startTime = System.currentTimeMillis();
   for(i=0;i<NUMITER;i++) {
      for (j=0; j< listsize; j++)
         list[j] = randomGenerator.nextInt();
         sorter.quickSort(list,0,listsize-1));
      }
   }
   endTime = System.currentTimeMillis();

   duration = ((double) (endTime - startTime)) / NUMITER;

You'll have to play around with different values for NUMITER -- it will need to change depending upon the size of the list and the algorithm.

You might notice that there is some non-sorting work done in the above algorithm -- mainly, setting up the list before each sort can take place.  This work takes a small amount of time in comparison to the sorting, as you can easily check for yourself:

   startTime = System.currentTimeMillis();
   for(i=0;i<NUMITER;i++) {
      for (j=0; j< listsize; j++)
         list[j] = rand();
   }
   endTime = System.currentTimeMillis();
   duration = ((double) (endTime - startTime)) / NUMITER;

You should subtract this setup time from your algorithm running time, to get more accurate results.  Your main program may run in either interactive mode or batch mode (though you do not need to implement both modes, just the one that is easiest for you to use in testing.)

The methods you write: should have headers that look like this
public void selectionSort(int[] array, int lowindex, int highindex, boolean reversed)

Also very straightforward.  Your sorting algorithm needs to work over a range of indicies in the array,  and you need to be able to sort the list backwards, if the reversed flag is true.  Your algorithm should sort all elements in the array in the range lowindex..highindex (inclusive).  You should not touch any of the data elements outside the range lowindex .. highindex. 
