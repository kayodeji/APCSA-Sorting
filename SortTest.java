public class SortTest {
    public static void main(String[] args)
    {
        int n = 10; 
        int[] a = new int[n];
        for (int i = 0; i<n; i++)
        {
            a[i]= (int) (n*Math.random());
        }
        int[] b = { 1, 3, 4, 5, 9, 8, 2, 0, 1, 6};
        System.out.print("Original Array: ");
        System.out.println(printarraystring(a));
        Sort s = new Sort();
        s.selectionSort(a,0,n-1,true);
        System.out.print("Final Array: ");
        System.out.println(printarraystring(a));
        s.selectionSort(a,0,n-1,false);
        System.out.print("Final Array Reversed: ");
        System.out.println(printarraystring(a));
    }

    public static String printarraystring(int[] array)
    {
        String s="";
        for (int i=0; i<array.length; i++) {
            if (i<array.length)
                { s = s + array[i] + ","; }
            else if (i == (array.length-1))
                { s = s + array[i]; }
        }
        return s;
    }
}