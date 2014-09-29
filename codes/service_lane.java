import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class service_lane {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String x1[]=br.readLine().split(" ");
            int n=Integer.parseInt(x1[0]);
            int test=Integer.parseInt(x1[1]);
            ArrayList<Integer> al=new ArrayList<Integer>();
            String x2[]=br.readLine().split(" ");
            for(int i=0;i<x2.length;i++)
            {
                al.add(Integer.parseInt(x2[i]));
            }
            int sol[]=new int[test];
            for(int i=0;i<test;i++)
            {
                String x3[]=br.readLine().split(" ");
                int l=Integer.parseInt(x3[0]);
                int r=Integer.parseInt(x3[1]);
                List<Integer> al2=al.subList(l,r+1);
                //System.out.println(""+al2.toString());
                sol[i]=Collections.min(al2);
            }
            for(int i=0;i<test;i++)
            {
                System.out.println(""+sol[i]);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}