import java.io.*;
class parkingslots
{
	BufferedReader br;
	int count=0;
	int flag=0;
	String slot[]=new String[5];
	//@ gonephishing : "you have believe its gonna be all right in the end"
	parkingslots()
	{
		try{
		br=new BufferedReader(new InputStreamReader(System.in));
		int regular[]=new int[7];
		int ticket1[]=new int[6];
		int ticket2[]=new int[6];
		int ticket3[]=new int[6];
		int ticket4[]=new int[6];
		int ticket5[]=new int[6];

		String lucky[]=br.readLine().split(" ");
		for(int i=0;i<7;i++)
		{
			regular[i]=Integer.parseInt(lucky[i]);
		}
		String set1[]=br.readLine().split(" ");
		for(int i=0;i<6;i++)
		{
			ticket1[i]=Integer.parseInt(set1[i]);
		}
		String set2[]=br.readLine().split(" ");
		for(int i=0;i<6;i++)
		{
			ticket2[i]=Integer.parseInt(set2[i]);
		}
		String set3[]=br.readLine().split(" ");
		for(int i=0;i<6;i++)
		{
			ticket3[i]=Integer.parseInt(set3[i]);
		}
		String set4[]=br.readLine().split(" ");
		for(int i=0;i<6;i++)
		{
			ticket4[i]=Integer.parseInt(set4[i]);
		}
		String set5[]=br.readLine().split(" ");
		for(int i=0;i<6;i++)
		{
			ticket5[i]=Integer.parseInt(set5[i]);
		}
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(ticket1[i]==regular[j])
				{
					count++;
					break;
				}
			}
			if(ticket1[i]==regular[6])
			{
				flag++;
			}
		}
		check(count,0);
		count=0;
		flag=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(ticket2[i]==regular[j])
				{
					count++;
					break;
				}
			}
			if(ticket2[i]==regular[6])
			{
				flag++;
			}
		}
		check(count,1);
		count=0;
		flag=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(ticket3[i]==regular[j])
				{
					count++;
					break;
				}
			}
			if(ticket3[i]==regular[6])
			{
				flag++;
			}
		}
		check(count,2);
		count=0;
		flag=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(ticket4[i]==regular[j])
				{
					count++;
					break;
				}
			}
			if(ticket4[i]==regular[6])
			{
				flag++;
			}
		}
		check(count,3);
		count=0;
		flag=0;
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(ticket5[i]==regular[j])
				{
					count++;
					break;
				}
			}
			if(ticket5[i]==regular[6])
			{
				flag++;
			}
		}
		check(count,4);
		count=0;
		flag=0;
		}catch(Exception ex){}
	}
	public void check(int count , int a)
	{
		if((count==0)||(count==1)||(count==2))
		{
			slot[a]="No Parking slot";
			System.out.println(""+slot[a]);
		}
		else if(count==3)
		{
			slot[a]="Fifth Parking slot";
			count=0;
			flag=0;
			System.out.println(""+slot[a]);
		}
		else if(count==4)
		{
			slot[a]="Fourth Parking slot";
			count=0;
			flag=0;
			System.out.println(""+slot[a]);
		}
		else if(count==5)
		{
			if(flag==1)
			{
				slot[a]="Second Parking slot";
				count=0;
				flag=0;
				System.out.println(""+slot[a]);
			}
			else
			{
				slot[a]="Third Parking slot";
				count=0;
				flag=0;
				System.out.println(""+slot[a]);
			}
		}
		else if(count==6)
		{
			slot[a]="First Parking slot";
			count=0;
			flag=0;
			System.out.println(""+slot[a]);
		}
	}
	public static void main(String[] args) {
		new parkingslots();
	}
}