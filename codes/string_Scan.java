import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.lang.*;
import java.math.BigInteger;

/**
* @author: gonephishing
* @contact: https://www.quora.com/Ritesh-Kumar-Singh-3
* @question: http://www.codechef.com/LTIME17/problems/PHYSICS
*/

class test
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	test()
	{
		int test = Integer.parseInt(read());
		while(test>0)
		{
			int n = Integer.parseInt(read());
			String x = read();
			if(x.indexOf("Y")>=0)
			{
				write("NOT INDIAN");
			}
			else if(x.indexOf("I")>=0)
			{
				write("INDIAN");
			}
			else
			{
				write("NOT SURE");
			}
			test--;
		}
	}
	public static void main(String args[])
	{
		new test();
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
