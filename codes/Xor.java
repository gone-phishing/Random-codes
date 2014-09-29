import java.io.*;
import java.util.*;

class Xor
{
	BufferedReader br;
	long sum[];
	int sumsize=0;
	int size=0;
	long matrix[];
	public Xor()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		int cases=Integer.parseInt(x);
		long matrix[]=new long[cases];
		int count=0;
		
		for(int i=0;i<cases;i++)
		{
			String x1=br.readLine();
			size=Integer.parseInt(x1);
			sumsize=(((size)*(size-1))/2);
			
			String x2=br.readLine();
			String c1[]=x2.split(" ");
			long vals[]=new long[size];
			for(int j=0;j<size;j++)
			{
				vals[j]=Long.parseLong(c1[j]);
			}
			long k3=find(vals);
			//System.out.println(""+k3);
			matrix[count]=k3;
			count++;
			//System.out.println(""+cases);
		}
		//System.out.println(""+cases);
		for(int ritesh=0;ritesh<cases;ritesh++)
		{
			System.out.println(""+matrix[ritesh]);
		}
		}catch(Exception ex){ex.printStackTrace();}
	}
	
	public long find(long[] vals)
	{
		long sum[]=new long[sumsize];
		int k=0;
		for(int a=0;a<size;a++)
		{
			for(int b=(a+1);(b<size);b++)
			{
				long q=calxor(vals[a],vals[b]);
				sum[k]=q;
				k++;
			}
		}
		long findings=0;
		for(int l=0;l<sumsize;l++)
		{
			findings=findings+sum[l];
			//System.out.println(""+findings);
		}
		for(int abc=0;abc<size;abc++)
		{
			findings=findings+vals[abc];
		}

		//System.out.println(""+findings);
		return findings;
	}
	public long calxor(long m,long n)
	{
		long p=m^n;
		//System.out.println(""+p);
		return p;
	}
	public static void main(String args[])
	{
		new Xor();
	}
}