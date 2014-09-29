import java.util.*;
class Search
{
	Scanner test,str;
	Search()
	{
		String P="";
		int power1=(int)Math.pow(10,9);
		int power2=(int)Math.pow(10,5);
		for(int i=1;i<=power1;i++)
		{
			P=P+i;
			System.out.println(i+":"+P.length());
		}
		System.out.println("Input:");
		test=new Scanner(System.in);
		int cases=test.nextInt();
		if((cases<1)||(cases>10))
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int check;
		String searchstrings[]=new String[cases];
		String input="";
		for(int i=1; i<=cases;i++)
		{
			str=new Scanner(System.in);
			input=str.nextLine();
			searchstrings[(i-1)]=input;
			char[] verify=input.toCharArray();
			for(int j=0;j<input.length();j++)
			{
				if((verify[j]<48)||(verify[j]>57))
				{
					System.out.println("Not a valid input...");
					System.exit(0);
				}
			}
			check=Integer.parseInt(searchstrings[i-1]);
			if((check<1)||(check>power2))
			{
				System.out.println("Search string should be between 1 and 100000");
				System.exit(0);
			}
		}
		System.out.println("\nOutput: ");
		boolean found;
		String match[]=new String[cases];
		for(int i=1;i<=cases;i++)
		{
			found=P.contains(searchstrings[i-1]);
			match[i-1]=(""+found);
		}
		for(int i=0;i<cases;i++)
		{
			if(match[i].equals("true"))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
	public static void main(String args[])
	{
		new Search();
	}
	
}	