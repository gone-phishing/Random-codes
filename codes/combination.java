import java.io.*;
import java.util.*;
import java.math.BigInteger;
class combination
{
	BufferedReader br;
	// like a boss....
	combination()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		long num[]=new long[test];
		long ans[]=new long[test];
		for(int i=0;i<test;i++)
		{
			num[i]=Long.parseLong(br.readLine());
		}
		
		//System.out.println(""+a);
		BigInteger b=BigInteger.valueOf(10);
		b=b.pow(9);
		BigInteger c=BigInteger.valueOf(7);
		b=b.add(c);
		//System.out.println(""+b);
		BigInteger z;
		for(int i=0;i<test;i++)
		{
			BigInteger a=BigInteger.valueOf(2);
			BigInteger d=BigInteger.valueOf(num[i]);
			BigInteger f=BigInteger.valueOf(1);
			a=a.modPow(d,b);
			a=a.subtract(f);
			num[i]=a.longValue();
		}
		for(int i=0;i<test;i++)
		{
			System.out.println(""+num[i]);
		}

	}catch(Exception ex){}
	}
	public static void main(String args[])
	{
		new combination();
	}
}