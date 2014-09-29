import java.util.*;
class Max
{
	Max()
	{
		System.out.print("Enter size of the array: ");
		Scanner size=new Scanner(System.in);
		int b,c,d;
		b=size.nextInt();
		System.out.println("Array size:"+b);
		int[] number=new int[b];
		for(int i=0;i<b;i++)
		{
			System.out.print("Enter "+(i+1)+"th number: ");
			Scanner ip=new Scanner(System.in);
			c=ip.nextInt();
			number[i]=c;
		}
		System.out.println("Array before sorting: ");
		for(int j=0;j<b;j++)
		{
			System.out.println((j+1)+"th number: "+number[j]);
		}
		for(int k=0;k<b;k++)
		{
			for(int l=(b-1);l>k;l--)
			{
				if(number[k]>number[l])
				{
					d=number[k];
					number[k]=number[l];
					number[l]=d;
				}
			}
		}
		System.out.println("///////////////////////////////////////////////////////////////////////////////");
		System.out.println("Array after sorting: ");
		for(int m=0;m<b;m++)
		{
			System.out.println((m+1)+"th number: "+number[m]);
		}
		System.out.println("///////////////////////////////////////////////////////////////////////////////");
		System.out.println("Largest number in the array: "+number[b-1]);
		System.out.println("Second largest in the array: "+number[b-2]);
	}
	public static void main(String args[])
	{
		new Max();
	}
}