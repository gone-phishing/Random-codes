import java.io.*;
import java.util.*;
import java.math.*;

class magic
{
	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
			BigInteger sol[]=new BigInteger[test];
			for(int i=0;i<test;i++)
			{
				BigInteger a=new BigInteger(br.readLine());
				BigInteger b=a.subtract(new BigInteger("1"));
				b=b.multiply(a);
				b=b.divide(new BigInteger("2"));
				sol[i]=b;
				br.readLine();
			}
			for(int i=0;i<test;i++)
			{
				System.out.println(""+sol[i]);
			}
		}
		catch(Exception ex){}
	}
}