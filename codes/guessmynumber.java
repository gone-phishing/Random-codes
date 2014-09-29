import java.io.*;

class guessmynumber
{
	BufferedReader br;
	guessmynumber()
	{
		try{
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter lower bound: ");
		int lower=Integer.parseInt(br.readLine());
		System.out.print("Enter upper bound: ");
		int higher=Integer.parseInt(br.readLine());
		if(lower>higher)
		{
			System.out.println("You moron...");
			System.exit(0);
		}
		int f=(lower+higher)/2;
		System.out.println("Let me guess: "+f);
		String x=null;
		x=br.readLine();
		while(!(x.equalsIgnoreCase("shit")))
		{
			if(x.equalsIgnoreCase("high"))
			{
				lower=f+1;
				f=(lower+higher)/2;
				System.out.println("Let me guess: "+f);
			}
			else if(x.equalsIgnoreCase("low"))
			{
				higher=f-1;
				f=(lower+higher)/2;
				System.out.println("Let me guess: "+f);
			}
			else
			{
				System.out.println("You crazy dickhead...");
			}
			x=br.readLine();
		}
	}catch(Exception ex){}
	}
	public static void main(String[] args) {
		new guessmynumber();
	}
}