import java.util.*;
import java.io.*;
public class Code
{
	Scanner ip;
	BufferedReader br;
	Code()
	{
		ip=new Scanner(System.in);
		br=new BufferedReader(new InputStreamReader(System.in));
		int test=ip.nextInt();
		int magic[]=new int[test];
		try{
		for(int i=1;i<=test;i++)
		{
			String x1=br.readLine();
			String arr1[]=x1.split(" ");
			int N=Integer.parseInt(arr1[0]);
			int K=Integer.parseInt(arr1[1]);
			int answer=Integer.parseInt(arr1[2]);
			//System.out.println("n: "+N+"\tk: "+K+"\tanswer: "+answer);
			int arr3[]=new int[N];
			String x2=br.readLine();
			String arr2[]=x2.split(" ");
			for(int p=0;p<N;p++)
			{
				arr3[p]=Integer.parseInt(arr2[p]);
			}
			String x3=br.readLine();
			for(int j=1;j<=K;j++)
			{
				for(int f=1;f<=N;f++)
				{
					answer=ans(answer,x3,arr3[f-1]);
					System.out.println(""+answer);
				}
			}
			magic[i-1]=answer;
		}
		}catch(Exception e){e.printStackTrace();}
		for(int i=0;i<test;i++)
		{
			System.out.println(magic[i]);
		}
	}
	private int ans(int answer,String x,int m)
	{
		String a=binary(answer);
		String b=binary(m);
		long c=0;
		if(x.equals("AND"))
		{
			c=and(a,b);
		}
		if(x.equals("OR"))
		{
			c=or(a,b);
		}
		if(x.equals("XOR"))
		{
			c=xor(a,b);
		}
		int out=revert(c);
		return out;
	}
	private int revert(long a)
	{
		int mat[]=new int[10];
		for(int i=1;a>0;i++)
		{
			mat[i]=(int)a%10;
			a=a/10;
		}
		int b=0;
		int c=0;
		for(int i=0;i<10;i++)
		{
			b=(int)Math.pow(2,i);
			c+=b*mat[i];
		}
		return c;
	}
	private String binary(int n)
	{
		int a;
		int count=0;
		int bin[]=new int[10];
		for(int i=0;n>0;i++)
		{
			bin[i]=n%2;
			count++;
			n=n/2;
		}
		int b;
		for(b=count;b<10;b++)
		{
			bin[b]=0;
		}
		String x="";
		for(int i=9;i>=0;i--)
		{
			x=x+bin[i];
		}
		return (x);
	}
	private long and(String a,String b)
	{
		char char1[]=a.toCharArray();
		char char2[]=b.toCharArray();
		int abin[]=new int[10];
		int bbin[]=new int[10]; 
		int cbin[]=new int[10];
		for(int i=0;i<10;i++)
		{
			abin[i]=Character.getNumericValue(char1[i]);
		}
		for(int i=0;i<10;i++)
		{
			bbin[i]=Character.getNumericValue(char2[i]);
		}
		for(int i=0;i<10;i++)
		{
			if((abin[i]==1)&&(bbin[i]==1))
			{
				cbin[i]=1;
			}
			else
			{
				cbin[i]=0;
			}
		}
		String cout="";
		for(int i=0;i<10;i++)
		{
			cout+=cbin[i];
		}
		long out=Long.parseLong(cout);
		return out;
	}
	private long or(String a,String b)
	{
		char char1[]=a.toCharArray();
		char char2[]=b.toCharArray();
		int abin[]=new int[10];
		int bbin[]=new int[10]; 
		int cbin[]=new int[10];
		for(int i=0;i<10;i++)
		{
			abin[i]=Character.getNumericValue(char1[i]);
		}
		for(int i=0;i<10;i++)
		{
			bbin[i]=Character.getNumericValue(char2[i]);
		}
		for(int i=0;i<10;i++)
		{
			if((abin[i]==0)&&(bbin[i]==0))
			{
				cbin[i]=0;
			}
			else
			{
				cbin[i]=1;
			}
		}
		String cout="";
		for(int i=0;i<10;i++)
		{
			cout+=cbin[i];
		}
		long out=Long.parseLong(cout);
		return out;
	}
	private long xor(String a,String b)
	{
		char char1[]=a.toCharArray();
		//System.out.println("Length: "+char1.length);
		/*for(int z=0;z<char1.length;z++)
		{
			System.out.print(""+char1[z]);
		}*/
		char char2[]=b .toCharArray();
		int abin[]= new int[10];
		int bbin[]= new int[10]; 
		int cbin[]= new int[10];
		for(int i=0;i<10;i++)
		{
			//System.out.println(""+i);
			abin[i]=Character.getNumericValue(char1[i]);
		}
		/*for(int i=0;i<10;i++)
		{
			System.out.print(""+abin[i]);
		}
		System.out.println("\n");
		*/
		for(int i=0;i<10;i++)
		{
			bbin[i]=Character.getNumericValue(char2[i]);
		}
		for(int i=0;i<10;i++)
		{
			if(abin[i]==bbin[i])
			{
				cbin[i]=0;
			}
			else
			{
				cbin[i]=1;
			}
		}
		String cout="";
		for(int i=0;i<10;i++)
		{
			cout+=cbin[i];
		}
		long out=Long.parseLong(cout);
		return out;
	}
	public static void main(String args[])
	{
		new Code();
	}
}