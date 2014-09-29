import java.io.*;
class car
{
	BufferedReader br;
	car()
	{
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		for(int i=1;i<=cases;i++)
		{
			int cars=Integer.parseInt(br.readLine());
			for(int j=1;j<=cars;j++)
			{
				String x=br.readLine();
				String y[]=x.split(" ");
				String cost[]=y[1].split("$");
				String tax[]=y[2].split("%");
				System.out.println("cost: "+cost[1]+"\ntax: "+tax[0]);
			}
		}
		}catch(Exception ex){}
	}
	public static void main(String args[])
	{
		new car();
	}
}