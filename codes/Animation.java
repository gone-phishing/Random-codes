import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Rect extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.ORANGE);
		g.fillRect(10,50,100,80);
		g.setColor(Color.BLUE);
		g.fillRect(30,30,60,40);
		g.setColor(Color.BLACK);
		g.fillOval(20,130,30,30);
		g.fillOval(70,130,30,30);
	}
}

class Light extends Canvas
{
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillOval(0,30,50,50);
		g.setColor(Color.BLACK);
		g.drawLine(25,80,25,160);
	}
}

class Animation extends JFrame implements ActionListener
{
	JButton b,b1,b2;
	Rect r;
	Light l;
	int i;
	Animation()
	{
		b=new JButton("Start");
		b1=new JButton("Stop");
		r=new Rect();
		l=new Light();
		b.addActionListener(this);
		b1.addActionListener(this);
		Container c=getContentPane();
		r.setBounds(0,0,176,250);
		l.setBounds(850,0,51,170);
		b.setBounds(200,500,200,50);
		b1.setBounds(450,500,200,50);
		c.add(r);
		c.add(l);
		c.add(b);
		c.add(b1);
		l.setForeground(Color.GREEN);
		setLayout(new BorderLayout());
		setSize(1000,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
			if(e.getSource()==b)
			{
				for(i=10;i<730;i++)
				{
					r.setBounds(i,0,120,170);
					System.out.println("Hello");
					try
					{
						Thread.sleep(5);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					if(i==729)
					{
						l.setForeground(Color.RED);
					}
				}
			}
			else if(e.getSource()==b1)
			{
				r.setBounds(10,0,120,170);
				l.setForeground(Color.GREEN);
			}
	}
	public static void main(String args[])
	{
		new Animation();
	}
}