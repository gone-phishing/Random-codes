import java.io.*;

class trick
{
	BufferedReader br;
	trick()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		long low=0,high=0,sq=0;
		long vals[][]=new long[cases][2];
		for(int i=0;i<cases;i++)
		{
			String x=br.readLine();
			String y[]=x.split(" ");
			vals[i][0]=Long.parseLong(y[0]);
			vals[i][1]=Long.parseLong(y[1]);
		}
		String conv=null;
		for(int i=0;i<cases;i++)
		{
			int count=0;
			long a=(long)Math.sqrt(vals[i][0]);
			if(a*a==vals[i][0])
			{
				low=a;
			}
			else
			{
				low=a+1;
			}
			high=(long)Math.sqrt(vals[i][1]);
			for(long p=low;p<=high;p++)
			{
				int flag=0;
				sq=(long)Math.pow(p,2);
				conv=""+sq;
				char check[]=conv.toCharArray();
				for(int j=0;j<check.length;j++)
				{
					int k=((int)check[j])-48;
					if((k==0)||(k==1)||(k==4)||(k==9))
					{
						flag++;
						continue;
					}
					else
						break;
				}
				if(flag==check.length)
				{
					count++;
				}
			}
			System.out.println(""+count);
		}
	}catch(Exception e){}
	}
	public static void main(String args[])
	{
		new trick();
	}
}