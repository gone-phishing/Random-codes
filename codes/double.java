import java.io.*;
class double
{
	BufferedReader br;
	double()
	{
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		int test =Integer.parseInt(br.readLine());
		int matrix[]=new int[test];
		for(int i=0;i<test;i++)
		{
			String x=br.readLine();
			int a=x.length;
			if(a%2==0)
			{
				matrix[i]=a;
			}
			else
			{
				matrix[i]=a-1;
			}
		}
		for(int i=0;i<test;i++)
		{
			System.out.println(""+matrix[i]);
		}
		}catch(Exception ex){}
	}
	public static void main(String args[])
	{
		new double();
	}
}