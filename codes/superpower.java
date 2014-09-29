import java.io.*;
import java.math.BigInteger;

class superpower
{
	BufferedReader br;
	//@ gonephishing : thnx manali :) :)
	superpower()
	{
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		int index[]=new int[cases];
		for(int i=0;i<cases;i++)
		{
			index[i]=Integer.parseInt(br.readLine());
		}
		String x=null;
		BigInteger seven=new BigInteger("7");
		BigInteger ten=new BigInteger("10");
		ten=ten.pow(9);
		ten=ten.add(seven);
		long ans=0;
		for(int i=0;i<cases;i++)
		{
			x=Integer.toBinaryString(index[i]);
			BigInteger a=new BigInteger("2");
			BigInteger b=new BigInteger(x);
			b=b.multiply(a);
			a=a.modPow(b,ten);
			ans=a.longValue();
			System.out.println(""+ans);
		}
		}catch(Exception ex){}
	}
	public static void main(String args[])
	{
		new superpower();
	}
}