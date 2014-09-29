import java.io.*;
import java.util.*;
class watertank
{
	BufferedReader br;
	//@gonephishing: even i dont know what's this shit... #feeling loled...
	watertank()
	{
		try
		{
			br=new BufferedReader(new InputStreamReader(System.in));
			int test=Integer.parseInt(br.readLine());
			int sol[]=new int[test];
			for(int i=0;i<test;i++)
			{
				int duration=Integer.parseInt(br.readLine());
				int volume_c1[]=new int[duration+1];
				int volume_c3[]=new int[duration+1];
				int volume_c2[]=new int[duration+1];
				for(int j=0;j<=duration;j++)
				{
					String x[]=br.readLine().split(" ");
					volume_c1[j]=Integer.parseInt(x[0]);
					volume_c3[j]=Integer.parseInt(x[1]);
				}
				volume_c2[0]=volume_c1[0];
				for(int j=1;j<=duration;j++)
				{
					volume_c2[j]=(volume_c1[j-1]-volume_c1[j])+(volume_c3[j-1]-volume_c3[j])+volume_c2[j-1];
					//System.out.println("volume_c2 -> "+volume_c2[j]);
				}
				int flag=0;
				ArrayList<Integer> break_points=new ArrayList<Integer>();
				for(int j=1;j<=duration;j++)
				{
					if(volume_c2[j]<volume_c2[0])
					{
						flag++;
						break_points.add(j);						
					}
				}
				if(flag==0)
				{
					Arrays.sort(volume_c2);
					sol[i]=volume_c2[volume_c2.length-1]-volume_c2[0];
				}
				else
				{
					ArrayList<Integer> volume_of_c2=new ArrayList<Integer>();
					for(int j=0;j<volume_c2.length;j++)
					{
						volume_of_c2.add(volume_c2[j]);
					}
					int lower=0;
					int higher=break_points.get(0);
					int diff[]=new int[break_points.size()];
					for(int j=0;(j<break_points.size())&&(lower<=higher);j++)
					{
						ArrayList<Integer> al3=new ArrayList<Integer>(volume_of_c2.subList(lower,higher));
						int maxim=Collections.max(al3);
						int minim=Collections.min(al3);
						diff[j]=maxim-minim;
						int qt=0;
						for(int p=higher;p<break_points.size();p++)
						{
							if(volume_c2[p]>=volume_c2[0])
							{
								lower=p;
								break;
							}
							else
							{
								lower=higher+1;
								qt=1;
							}
						}
						if(qt==1)
						{
							continue;
						}
						if(j<(break_points.size())-2)
						{
							for(int p=lower;p<break_points.size();p++)
							{
								if(volume_c2[p]<volume_c2[0])
								{
									higher=p;
									break;
								}
							}	
						}
						else
						{
							higher=break_points.get((break_points.size())-1);
						}
					}
					Arrays.sort(diff);
					sol[i]=diff[diff.length-1];
				}
			}
			for(int i=0;i<test;i++)
			{
				System.out.println(""+sol[i]);
			}
		}
		catch(Exception ex){ex.printStackTrace();}
	}
	public static void main(String[] args) {
		new watertank();
	}
}