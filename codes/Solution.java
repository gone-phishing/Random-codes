import java.io.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int num=Integer.parseInt(br.readLine());
            long val[]=new long[num];
            for(int i=0;i<num;i++)
            {
                String x=br.readLine();
                String mem[]=x.split(" ");
                val[i]=Long.parseLong(mem[i]);
            }
            long d1=val[1]-val[0];
            long d2=val[2]-val[1];
            long d=0;
            if(d1<d2)
            {
                d=d1;
            }
            else
                d=d2;
            int count=0;
            long diff=0;
            for(int i=0;i<num-1;i++)
            {
                diff=val[i+1]-val[i];
                if(diff!=d)
                {
                    count=i;
                    break;
                }
            }
            long miss=val[count]+d;
            System.out.println(""+miss);
        }
        catch(Exception e)
        {
        }
    }
}