public class Rectangle {

	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int a,int b,int c,int d)
	{
		x=a;
		y=b;
		width=c;
		height=d;
	}
	
	public Rectangle()
	{
		x=0;
		y=0;
		width=0;
		height=0;
		
	}
	
	public Rectangle(int a,int b,int c)
	{
		x=a;
		y=b;
		width=c;
		height=c;
	}

	void Translate(int a,int b)
	{
		x=x+a;
		y=y+b;
	}
	
	int getWidth()
	{
		return width;
	}
	
	int getHeight()
	{
		return height;
	}
	
	void setWidth(int a)
	{
		width=a;
	}
	
	void setHeight(int a)
	{
		height=a;
	}
	
}


