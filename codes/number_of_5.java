import java.io.*;
import java.util.*;
import java.math.BigInteger;

//@gonephishing: totally out of blues :)
//calculates total no. of times 5 appears as a factor in a number

class number_of_5
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Map<Integer,BigInteger> marry=new HashMap<Integer, BigInteger>();
    number_of_5()
    {
        try
        {
            int test=Integer.parseInt(br.readLine());
            int sol[]=new int[test];
            for(int i=0;i<test;i++)
            {
                int num=Integer.parseInt(br.readLine());
                int temp=num;
                int count=0;
                for(int j=1;temp>0;j++)
                {
                    //System.out.println(""+j);
                    count+=num/(int)Math.pow(5,j);
                    temp=temp/5;
                }
                sol[i]=count;
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
    public static void main(String[] args) {
        new number_of_5();
    }
}