import java.io.*;
import java.math.BigInteger;
import java.util.*;
class fff
{
	public static void main(String[] args) {
		try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int test=Integer.parseInt(br.readLine());
            int num=0;
            BigInteger a;
            String sol[]=new String[test];
            
            for(int i=0;i<test;i++)
            {
                num=Integer.parseInt(br.readLine());
                String x="",y="",z="";
                if(num%2==0)
                {
                    for(int j=0;j<(num/2)+1;j++)
                    {
                    	if(j==0)
                    	{
                    		x=x+"1"+" ";
                    		continue;
                    	}
                        a=ncr(num,j);
                        x=x+a.toString()+" ";
                    }
                    String coelho[]=x.split(" ");
                    for(int k=1;k<coelho.length;k++)
                    {
                    	y=y+coelho[coelho.length-k-1]+" ";
                    }
                    z=x+y;
                }
                else
                {
                    for(int j=0;j<(num+1)/2;j++)
                    {
                    	if(j==0)
                    	{
                    		x=x+"1"+" ";
                    		continue;
                    	}
                        a=ncr(num,j);
                        x+=a.toString()+" ";
                    }
                    String coelho[]=x.split(" ");
                    for(int k=0;k<coelho.length;k++)
                    {
                    	y=y+coelho[coelho.length-k-1]+" ";
                    }
                    z=x+y;
                }
                sol[i]=z;
            }
            
            for(int i=0;i<test;i++)
            {
                System.out.println(""+sol[i]);
            }
            
        }
        catch(Exception ex){}
	}
	private static BigInteger ncr(int n, int r) {
        BigInteger top = BigInteger.ONE;
        BigInteger bot = BigInteger.ONE;
        BigInteger modu=new BigInteger("1000000000");
        BigInteger a;

        for(int i = n; i >(n-r); --i){
            top = top.multiply(BigInteger.valueOf(i));
        }
        for(int i = r; i > 1; --i){
            bot = bot.multiply(BigInteger.valueOf(i));
        }
        a=top.divide(bot);
        a=a.mod(modu);
        return a;
    }
}