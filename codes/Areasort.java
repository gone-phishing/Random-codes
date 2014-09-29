//Helping Lira
import java.util.*;
import java.io.*;
class Areasort
{
	BufferedReader br;
	int cases;
	public Areasort()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		String x1=br.readLine();
		cases=Integer.parseInt(x1);	
		String test[][]=new String[cases][6];
		for(int i=1;i<=cases;i++)
		{
			String x2=br.readLine();
			String x3[]=x2.split(" ");
			for(int j=0;j<6;j++)
			{
				test[i-1][j]=x3[j];
			}
		}
		
		int cordi[][]=new int[cases][6];
		for(int i=0;i<cases;i++)
		{
			for(int j=0;j<6;j++)
			{
				cordi[i][j]=Integer.parseInt(test[i][j]);
			}
		}
		double area[]=new double[cases];
		for(int i=0;i<cases;i++)
		{
			area[i]=find_area(cordi,i);
		}
		double min=area[0];
		double max=area[0];
		for(int i=1;i<cases;i++)
		{
			if(min>area[i])
			{
				min=area[i];
			}
			if(max<area[i])
			{
				max=area[i];
			}
		}
		int count1=0,count2=0;
		for(int i=1;i<=cases;i++)
		{
			if(min==area[i-1])
			{
				count1=i;
			}
			if(max==area[i-1])
			{
				count2=i;
			}
		}
		
		System.out.print(""+count1+" "+count2);
		}catch(Exception e){e.printStackTrace();}
	}
	public double find_area(int[][] cordi,int i)
	{
		int x1=cordi[i][0];
		int y1=cordi[i][1];
		int x2=cordi[i][2];
		int y2=cordi[i][3];
		int x3=cordi[i][4];
		int y3=cordi[i][5];
		int val=x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
		int mod_val=0;
		if(val>=0)
		{
			mod_val=val;
		}
		else
		{
			mod_val=-(val);
		}
		double sol=0.5*mod_val;
		return sol;
	}
	public static void main(String args[])
	{
		new Areasort();
	}
}