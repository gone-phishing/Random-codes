import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.Pattern;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
* @author: gonephishing
* @contact: https://www.quora.com/Ritesh-Kumar-Singh-3
*/

class Solution
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	Solution()
	{
		int test = Integer.parseInt(read());
		while(test-- > 0)
		{
			int n = Integer.parseInt(read());
			long sum = 0;
			if(n == 1) sum =1;
			else
			{
				int inc =1;
				if(n%2 != 0) inc = 2;
				int root = (int)Math.sqrt(n);
				if(root*root == n)
				{
					sum+=root;
					root = root-1;
				}
				for(int j=1;j<=root;j+=inc)
				{
					if( n%j == 0 )
					{
						sum+=j;
						sum+=(n/j);
					}
				}
			}
			write(""+sum);
		}
	}


	public static void main(String args[])
	{
		new Solution();
	}

	public String read()
	{
		String x="";
		try
		{
			x=br.readLine();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return x;
	}

	public void write(String x)
	{
		try
		{
			bw.write(""+x+"\n");
			bw.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
