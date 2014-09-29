import java.io.*;
import java.math.BigInteger;
import java.util.*;
class plz
{
	BufferedReader br;
	plz()
	{
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
			String sol[]=new String[test];
			for(int i=0;i<test;i++)
			{
				String str[]=br.readLine().split(" ");
				double l=Double.parseDouble(str[0]);
				int d=Integer.parseInt(str[1]);
				int s=Integer.parseInt(str[2]);
				int c=Integer.parseInt(str[3]);
				double x=(Math.log(s))+((d-1)*(Math.log(c+1)));
				double y=Math.log(l);
				if(x>=y)
				{
					sol[i]="ALIVE AND KICKING";
				}
				else
				{
					sol[i]="DEAD AND ROTTING";
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
		new plz();
	}
}