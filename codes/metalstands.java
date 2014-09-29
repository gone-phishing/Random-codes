import java.io.*;
class metalstands
{
	BufferedReader br;
	//@ gonephishing : #depressed...life sucks
	metalstands()
	{
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		int sol[]=new int[test];
		for(int i=0;i<test;i++)
		{
			String x[]=br.readLine().split(" ");
			int plates=Integer.parseInt(x[0]);
			int capacity=Integer.parseInt(x[1]);
			int req=plates/capacity;
			if((capacity*req)<plates)
			{
				req++;
			}
			if(req!=0)
			{
				req--;
				sol[i]=req;
			}
			else
			{
				sol[i]=req;
			}

		}
		for(int i=0;i<test;i++)
		{
			System.out.println(""+sol[i]);
		}
		}catch(Exception ex){}
	}
	public static void main(String[] args) {
		new metalstands();
	}
}