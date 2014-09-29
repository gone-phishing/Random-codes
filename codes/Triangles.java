import java.io.*;
import java.util.*;
class Triangles
{
	BufferedReader br, cordi;
	Triangles()
	{
		try{
		System.out.print("Enter number of triangles: ");
		br=new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		int cases=Integer.parseInt(x);
		int points[][]=new int[cases][6];
		int length[][]=new int[cases][3];
		for(int i=1;i<=cases;i++)
		{
			System.out.println("Enter CoOrdinates: ");
			cordi=new BufferedReader(new InputStreamReader(System.in));
			String[] fetch=cordi.readLine().split(" ");
			for(int j=0;j<6;j++)
			{
				points[i-1][j]=Integer.parseInt(fetch[j]);
			}
			length[i-1][0]=distance(points[i-1][0],points[i-1][1],points[i-1][2],points[i-1][3]);
			length[i-1][1]=distance(points[i-1][2],points[i-1][3],points[i-1][4],points[i-1][5]);
			length[i-1][2]=distance(points[i-1][0],points[i-1][1],points[i-1][4],points[i-1][5]);
		}
		System.out.println("\nOutput: ");
		String abc="";
		for(int i=1;i<=cases;i++)
		{
			abc=check(length[i-1][0],length[i-1][1],length[i-1][2]);
			System.out.println(""+abc);
		}
		}catch(Exception e){e.printStackTrace();}
	}




	private String check(int a,int b,int c)
	{
		String z="";
		if((a+b)==c)
		{
			z="YES";
		}
		else if((b+c==a))
		{
			z="YES";
		}
		else if((c+a)==b)
		{
			z="YES";
		}
		else
		{
			z="NO";
		}
		return z;
	}

//Distance function

	private int distance(int a, int b, int c, int d)
	{
		int difference1=(a-c);
		int difference2=(b-d);
		int square1=(int)Math.pow(difference1,2);
		int square2=(int)Math.pow(difference2,2);
		int sum=square1+square2;
		return sum;
	}

//Main function

	public static void main(String args[])
	{
		new Triangles();
	}
}