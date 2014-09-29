import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
class ball extends JFrame implements ActionListener
{
	JButton b;
	ball()
	{
		super("Ball");
		try
		{
			Container c=getContentPane();
			c.setLayout(new FlowLayout());
			JButton b=new JButton("Move");
			c.add(b);
			b.addActionListener(this);
			setSize(1366,768);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Graphics g=getGraphics();
			ArrayList<Double> al=new ArrayList<Double>();
			for(int i=50;i<1200;i++)
			{
				double x=10*Math.sin(10000*i);
				al.add(x);
				g.fillOval(i,((int)x%200)+400,5,5);
				//g.drawString(""+i,i,((int)x%200)+400);
				Thread.sleep(10);
			}
			System.out.println("Max value: "+Collections.max(al)+"\tMin value: "+Collections.min(al));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void paint(Graphics g)
	{
		for(int i=0;i<1367;i+=30)
		{
			g.drawLine(i,0,i,768);
		}
		for(int i=0;i<769;i+=30)
		{
			g.drawLine(0,i,1366,i);
		}

	}
	public static void main(String[] args) {
		new ball();
	}
}