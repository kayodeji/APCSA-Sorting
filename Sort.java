public class Sort implements SortInterface
{
    public void bubbleSort(int[] array, int lowindex, int highindex, boolean reversed)
    {
        if (highindex >= array.length  || lowindex >= highindex || array.length <=0 )
        {
              System.out.println("Check the conditions.");
              return;
          }
        else
        {
            int temp;
            if (reversed)
            {
                for (int j = lowindex; j <= highindex; j++)
                {
                    for (int i = lowindex; i< highindex-lowindex; i++)
                    {
                        if (array[i]>array[i+1])
                        {
                            temp = array[i];
                            array[i] = array[i+1];
                            array[i+1]= temp;
                        }
                    }
                }
            }
            else
            {
                for (int j = lowindex; j <= highindex; j++)
                {
                    for (int i = lowindex; i< highindex-lowindex; i++)
                    {
                        if (array[i]<array[i+1])
                        {
                            temp = array[i];
                            array[i] = array[i+1];
                            array[i+1]= temp;
                        }
                    }
                }

            }
        }
        //System.out.print(printarraystring(array,lowindex,highindex));

    }
    public void selectionSort(int[] array, int lowindex, int highindex, boolean reversed)
    {
        if (highindex >= array.length  || lowindex >= highindex || array.length <=0 )
            {System.out.println("Check the conditions."); return;}
        else
        {
            int temp;
            if (reversed)
            {
                int min;
                int minindex;
                for (int j=lowindex; j< highindex; j++)
                {
                    min = array[j];
                    minindex = j;
                    for (int i=j+1; i<=highindex; i++)
                    {
                        if (array[i]<min)
                        {
                            min = array[i];
                            minindex = i;
                        }
                    }
                    temp = array[j];
                    array[j] = min;
                    array[minindex] = temp;
                }
            }
            else
            {
                int max;
                int maxindex = lowindex;
                for (int j=lowindex; j< highindex; j++)
                {
                    max = array[j];
                    maxindex = j;
                    for (int i=j+1; i<=highindex; i++)
                    {
                        if (array[i]>max)
                        {
                            max = array[i];
                            maxindex = i;
                        }
                    }
                    temp = array[j];
                    array[j] = max;
                    array[maxindex] = temp;
                }

            }
        }
    }

    public void mergeSort(int[] array, int lowindex, int highindex, boolean reversed)
    {

    }
    public String printarraystring(int[] array, int lowindex, int highindex)
    {
        String s="";
        for (int i=lowindex; i<=highindex; i++) {
            if (i<highindex)
                s = s + array[i] + ",";
            else
                s = s + array[i];
        }
        return s;
    }
}
