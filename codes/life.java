import java.io.*;

class life implements List
{
	BufferedReader br;
	life()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<int> al=new ArrayList<int>();
		int a=0;
		while((a=Integer.parseInt(br.readLine()))!=42)
		{
			al.add(a);
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println(""+al.get(i));
		}
	}
}