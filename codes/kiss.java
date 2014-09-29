import java.io.*;

class kiss
{
	BufferedReader br;
	int count = 0;
	kiss()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		//System.out.println("value of test: "+test);
		long matrix[][]=new long[test][2];
		//int op=new int[test];
		long l=0,r=0;
		for(int i=0;i<test;i++)
		{
			String x=br.readLine();
			String y[]=x.split(" ");
			matrix[i][0]=Long.parseLong(y[0]);
			matrix[i][1]=Long.parseLong(y[1]);
		}
		for(int i=0;i<test;i++)
		{
			l=matrix[i][0];
			r=matrix[i][1];
			//System.out.println("left: "+l+"\nright: "+r);
			for(long j=l;j<=r;j++)
			{
				System.out.println("the number is: "+j);
				check_prime(divisors(j));
			}
			System.out.println(""+count);
			count=0;
		}
		}catch(Exception ex){}
	}
	public int divisors(long x)
	{
		long limit=x;
		int numberOfDivisors=0;
		if(x==1)
		{
			numberOfDivisors=1;
			System.out.println("numberOfDivisors: "+numberOfDivisors);
			return numberOfDivisors;
		}
		else
		{
			numberOfDivisors=2;
    		for(int p=2;p<=(limit/2);p++)
    		{
    			if(x%p==0)
    			{
    				numberOfDivisors++;
    				x=x/p;
    			}
    		}
    		System.out.println("numberOfDivisors: "+numberOfDivisors);
    		return numberOfDivisors;
    	}
	}
	public void check_prime(int n)
	{
		int flag=0;
		if(n==1)
		{
			count=count;
		}
		else
		{
			for(int i=2;i<=(n/2);i++)
			{
				if(n%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				count++;
			}
			else
			{
				count=count;
			}
		}
	}
	public static void main(String args[])
	{
		new kiss();
	}
}