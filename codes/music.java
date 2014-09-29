import java.io.*;
import java.util.*;

class music
{
	BufferedReader br;
	music()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		int test=Integer.parseInt(x);
		//System.out.println(""+test);
		int flag[]=new int[test];
		for(int i=0;i<test;i++)
		{
			int n=Integer.parseInt(br.readLine());
			String y1=br.readLine();
			String y2[]=y1.split(" ");
			long num[]=new long[n];
			for(int j=0;j<n;j++)
			{
				num[j]=Long.parseLong(y2[j]);
			}
			int k=Integer.parseInt(br.readLine());
			long fav=num[k-1];
			Arrays.sort(num);
			for(int j=0;j<n;j++)
			{
				if(num[j]==fav)
				{
					flag[i]=j+1;
					break;
				}
				else
					continue;

			}
		}
		//System.out.println(""+test);
		for(int i=0;i<test;i++)
		{
			System.out.println(""+flag[i]);
		}
		
	}catch(Exception ex){ex.printStackTrace();}
	}
	public static void main(String args[])
	{
		new music();
	}
}