import java.io.*;

class Birthday{
	BufferedReader br;
	Birthday()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		String x=br.readLine();
		String cases=br.readLine();
		int test=Integer.parseInt(cases);
		String[] name=new String[test];
		for(int i=0;i<test;i++)
		{
			name[i]=br.readLine();
		}
		int count=0;
		int p=0;
		/*for(int i=0;i<test;i++)
		{
			if(x.contains(name[i]))
			{
				count++;
			}
		}
		*/



		//I am taking first character of every name given and finding the indexOf
		//the first character of the name in the given string. Then I search for
		//the name at that specific index
		String y=null;
		for(int i=0;i<test;i++)
		{
			
			char arr[]=name[i].toCharArray();
			
			for(int index=x.indexOf(arr[0]);index>=0;index=x.indexOf(arr[0],index+1))
			{
				p=name[i].length()+index;
				y=x.substring(index,p);
				
				boolean b=y.equals(name[i]);
				
				if(y.equals(name[i]))
				{
					count++;
				}
				else
				{
					continue;
				}
				break;
			}
		}
		System.out.println(""+count);
		}catch(Exception e){}
	}
	public static void main(String args[])
	{
		new Birthday();
	}
}