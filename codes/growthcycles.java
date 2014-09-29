import java.io.*;

class growthcycles
{
	BufferedReader br;
	//@ gonephishing : life's sad out here # feeling depressed
	growthcycles()
	{
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
			int val[]=new int[test];
			for(int i=0;i<test;i++)
			{
				val[i]=Integer.parseInt(br.readLine());
			}
			for(int i=0;i<test;i++)
			{
				int height=1;
				if(val[i]==0)
				{
					System.out.println(""+height);
					continue;
				}
				for(int j=1;j<=val[i];j++)
				{
					if(j%2==0)
					{
						height++;
					}
					else
					{
						height*=2;
					}
				}
				System.out.println(""+height);
			}
		}
		catch(Exception ex)
		{

		}
	}
	public static void main(String[] args) {
		new growthcycles();
	}
}