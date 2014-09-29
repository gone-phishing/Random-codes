import java.io.*;
import java.util.*;
import java.math.BigInteger;
class test
{
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    test()
    {
        int size=Integer.parseInt(read());
        int listNum=1;
        while(size>0)
        {
            String x[]=read().split(" ");
            int nums[]=new int[x.length];
            for(int i=0;i<x.length;i++)
            {
                nums[i]=Integer.parseInt(x[i]);
            }
            //System.out.print( "List " + listNum + " has " );
            System.out.println ( countInversions(nums) + " inversions.");
            listNum++;
            size=Integer.parseInt(read());
        }
    }
    public static int countInversions(int nums[])
         {  
             int mid = nums.length/2, k;
             int countLeft, countRight, countMerge;
             if (nums.length <= 1) 
                return 0;

             int left[] = new int[mid];
             int right[] = new int[nums.length - mid];

             for (k = 0; k < mid; k++)
                 left[k] = nums[k];
             for (k = 0; k < nums.length - mid; k++)
                 right[k] = nums[mid+k];
             System.out.print("Left array: ");
             printarray(left);
             System.out.print("Right array: ");
             printarray(right);

             countLeft = countInversions (left);
             write("countLeft is: "+countLeft);

             countRight = countInversions (right);
             write("countRight is: "+countRight);

             int result[] = new int[nums.length];
             countMerge = mergeAndCount (left, right, result);
             write("countMerge is: "+countMerge);

             for (k = 0; k < nums.length; k++)
                 nums[k] = result[k];

             System.out.print("Original Array: ");
             printarray(nums);
             
             return (countLeft + countRight + countMerge);  

         }
    public static void printarray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(""+a[i]+"  ");
        }
        write("");
    }
    public static int mergeAndCount (int left[], int right[], int result[])
        {
            write("Merge and Count being called");
            int a = 0, b = 0, count = 0, i, k=0;

            while ( ( a < left.length) && (b < right.length) )
              {
                 if ( left[a] <= right[b] )
                       result [k] = left[a++];
                 else  
                    {
                       result [k] = right[b++];
                       count += left.length - a;
                    }
                 k++;
              }

            if ( a == left.length )
               for ( i = b; i < right.length; i++)
                   result [k++] = right[i];
            else
               for ( i = a; i < left.length; i++)
                   result [k++] = left[i];

            return count;
        } 
    public static String read()
    {
        String x="";
        try
        {
            x=br.readLine();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return x;
    }
    
    public static void write(String x)
    {
        try
        {
            bw.write(""+x+"\n");
            bw.flush();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        new test();
    }
}