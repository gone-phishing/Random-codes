import java.io.*;
import java.util.*;
//completed
class ring
{
	BufferedReader br;
	int a=0;
	//@ gonephishing... like a boss :)
	ring()
	{
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		int n=0;
		int ans[]=new int[test];
		for(int i=0;i<test;i++)
		{
			n=Integer.parseInt(br.readLine());
			int ir[]=new int[n];
			int or[]=new int[n];
			for(int j=0;j<n;j++)
			{
				String x[]=br.readLine().split(" ");
				ir[j]=Integer.parseInt(x[0]);
				or[j]=Integer.parseInt(x[1]);
			}

			int ir_copy[]=new int[n];
			int or_copy[]=new int[n];
			for(int j=0;j<n;j++)
			{
				ir_copy[j]=ir[j];
				or_copy[j]=or[j];
			}
			Arrays.sort(ir);
			Arrays.sort(or);
			int p=n-1;
			for(int j=0;j<n;j++)
			{
				if(ir_copy[j]==ir[n-1])
				{
					a=j;
				}
			}
			if(or[n-1]==or_copy[a])
			{
				p=n-2;
			}
			if(ir[n-1]>or[p])
			{
				ans[i]=a+1;
			}
			else
			{
				ans[i]=(-1);
			}
		}
		for(int i=0;i<test;i++)
		{
			System.out.println(""+ans[i]);
		}
		}
		catch(Exception ex){}
	}
	public static void main(String args[])
	{
		new ring();
	}
}