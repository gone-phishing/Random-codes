import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class merge_sort {
    
    
    public static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            return list;
        }
        
        // Split the array in half
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // Sort each half
        for(int i=0;i<first.length;i++)
        {
            System.out.print("first: "+first[i]+" , ");
        }
        System.out.println("");
        mergeSort(first);
        for(int i=0;i<second.length;i++)
        {
            System.out.print("second: "+second[i]+" , ");
        }
        System.out.println("");
        mergeSort(second);
        
        // Merge the halves together, overwriting the original array
        System.out.println("---->Calling merge function");
        merge(first, second, list);
        return list;
    }
    
    private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        for(int i=0;i<first.length;i++)
        {
            System.out.println("Element at "+i+"th position in first array: "+first[i]);
        }
        // Next element to consider in the second array
        int iSecond = 0;
        for(int i=0;i<second.length;i++)
        {
            System.out.println("Element at "+i+"th position in second array: "+second[i]);
        }
        
        // Next open position in the result
        int j = 0;
        for(int i=0;i<result.length;i++)
        {
            System.out.println("Content at "+i+"th position initially: "+result[i]);
        }
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
                } 
            else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        System.out.println("Before arraycopy:");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(""+result[i]);
        }
        // copy what's left
        System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.out.println("After arraycopy from first half:");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(""+result[i]);
        }
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
        System.out.println("After arraycopy from second half:");
        for(int i=0;i<result.length;i++)
        {
            System.out.println(""+result[i]);
        }
    }
    
    public static void main(String args[]) throws Exception
    {
        String list="";
        int i=0,n=0;
        
        //MergeSort s= new MergeSort();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
        elementlist=mergeSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Merge Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
    }
}