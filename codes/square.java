import java.io.*;
class square
{
	BufferedReader br;
	square()
	{
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		int x=0;
		int var=0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<100000;i++)
		{
			x=i*i;
			String a=""+x;
			char check[]=a.toCharArray();
			int j=0;
			for(j=0;j<check.length;j++)
			{
				if((check[j]==0)||(check[j]==1)||(check[j]==4)||(check[j]==9))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if(j==check.length)
			{
				perfsquare[var++]=x;
			}
		}
		for(int i=0;i<perfsquare.length;i++)
		{
			System.out.println(""+perfsquare[i]);
		}
		}
		catch(Exception e){}
	}
	public static void main(String args[])
	{
		new square();
	}
}