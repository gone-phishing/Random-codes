import java.io.*;
import java.util.*;
// shit just got serious _/\_ _|_ _/\_ 
//finding max sum travelling down a triangle of numbers.
class max_sum_triangle
{
    public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    max_sum_triangle()
    {
        long start_time=System.currentTimeMillis();
        int test=Integer.parseInt(read());
        int sol[]=new int[test];
        for(int k=0;k<test;k++)
        {
            int lines=Integer.parseInt(read());
            int rows=lines;
            int cols=lines;
            int val[][]=new int[rows][cols];
            for(int i=0;i<rows;i++)
            {
                String x[]=read().split(" ");
                for(int j=0;j<x.length;j++)
                {
                    val[i][j]=Integer.parseInt(x[j]);
                }
                for(int j=x.length;j<cols;j++)
                {
                    val[i][j]=(-1);
                }
            }
            int sum[][]=new int[rows][cols];
            sum[0][0]=val[0][0];
            for(int i=1;i<rows;i++)
            {
                int j=0;
                while(j<cols)
                {
                    if(j==0)
                    {
                        sum[i][j]=val[i][j]+sum[i-1][j];
                    }
                    else if(j>i)
                    {
                        sum[i][j]=val[i][j];
                    }
                    else
                    {
                        //write(val[i-1][j]+" and "+val[i-1][j-1]);
                        sum[i][j]=val[i][j]+max(sum[i-1][j],sum[i-1][j-1]);
                    }
                    j++;
                }
            }
            int max=sum[rows-1][0];
            for(int i=1;i<cols;i++)
            {
                if(sum[rows-1][i]>max)
                {
                    max=sum[rows-1][i];
                }
            }
            sol[k]=max;
            //write("Max sum= "+max);
            //long end_time=System.currentTimeMillis();
            //write("Time taken: "+(end_time - start_time)+"ms");
        }
        for(int i=0;i<test;i++)
        {
            write(""+sol[i]);
        }
    }
    public int max(int a,int b)
    {
        if(a>=b)
        {
            return a;
        }
        else
        {
            return b;
        }
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
        new max_sum_triangle();
    }
}