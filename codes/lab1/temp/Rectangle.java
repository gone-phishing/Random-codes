public class Rectangle 
{
	private int x,y,width,height;

	public Rectangle(int a,int b,int c,int d)
	{
		x =a ;y=b;width =c;height=d;
	
	}
	
	
	public Rectangle()
	{
		this(0,0,0,0);
	
	}
	
	
	public Rectangle(int a,int b,int c)
	{
		this(a,b,c,c);
	
	}

	
	public int getWidth()
	{
		return width;
	
	}
	
	public int getHeight()
	{
		return height;
	
	}

	
	public void setWidth(int a)
	{
		width = a;
	
	}
	
	public void setHeight(int a)
	{
		height = a;
	
	}
	
	
	public void Translate(int a,int b)
	{
		x = x+a;
		
			y = y+b;
	
	}
	
		

}
