import java.io.*;
import java.util.*;
import java.math.BigInteger;
class factorial
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Map<Integer,BigInteger> marry=new HashMap<Integer, BigInteger>();
    factorial()
    {
        try
        {
            precalculate();
            
            int test=Integer.parseInt(br.readLine());
            BigInteger sol[]=new BigInteger[test];
            for(int i=0;i<test;i++)
            {
                int val=Integer.parseInt(br.readLine());
                sol[i]=marry.get(val);
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
    public void precalculate()
    {
        marry.put(1,BigInteger.valueOf(1));
        for(int i=2;i<=100;i++)
        {
            marry.put(i,(BigInteger.valueOf(i)).multiply(marry.get(i-1)));
        }
    }
    public static void main(String[] args) {
        new factorial();
    }
}