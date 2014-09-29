import java.io.*;

class goo
{
	BufferedReader br;
	goo()
	{
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
			String sol[]=new String[test];
			for(int i=0;i<test;i++)
			{
				String x=br.readLine();
				if((x.contains("101"))||(x.contains("010")))
				{
					sol[i]="Good";
				}
				else
				{
					sol[i]="Bad";
				}
			}
			for(int i=0;i<test;i++)
			{
				System.out.println(""+sol[i]);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new goo();
	}
}