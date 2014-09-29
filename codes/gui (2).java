import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class gui extends JFrame implements MouseListener,MouseMotionListener
{
	int xpos,ypos;
	gui()
	{
		super("Compre Fever");
		JPanel p=new JPanel();
		setContentPane(p);
		p.setBorder(BorderFactory.createLoweredBevelBorder());
		addMouseListener(this);
		addMouseMotionListener(this);
		p.setLayout(new BorderLayout());
		JMenuBar jmb=new JMenuBar();
		JMenu m1=new JMenu("File");
		JMenu m2=new JMenu("Edit");
		JMenu m3=new JMenu("Help");
		JMenuItem i1=new JMenuItem("Create New");
		JMenuItem i2=new JMenuItem("Open",KeyEvent.VK_O);
		JMenuItem i3=new JMenuItem("Save",KeyEvent.VK_S);
		JMenuItem i4=new JMenuItem("Cut",KeyEvent.VK_C);
		JMenuItem i5=new JMenuItem("Copy");
		JMenuItem i6=new JMenuItem("Paste",KeyEvent.VK_P);
		JMenuItem i7=new JMenuItem("Help Contents");
		m1.add(i1);
		m1.addSeparator();
		m1.add(i2);
		m1.addSeparator();
		m1.add(i3);
		m2.add(i4);
		m2.addSeparator();
		m2.add(i5);
		m2.addSeparator();
		m2.add(i6);
		m3.add(i7);
		jmb.add(m1);
		jmb.add(m2);
		jmb.add(m3);
		//JTextArea jt=new JTextArea(5,5);
		//p.add(new JScrollPane(jt,3,3),BorderLayout.EAST);
		//p.add(jt,BorderLayout.CENTER);
		p.add(jmb,BorderLayout.NORTH);
		//p.add(new JLabel("This is the north region"),BorderLayout.NORTH);
		Icon i=new ImageIcon("49139186.jpg");
		JPanel p1=new JPanel();
		p1.add(new JLabel("Lol",i,SwingConstants.LEFT));
		p1.add(new JButton("Yolo"));
		p1.add(new JButton("Swag"));
		JButton fancybutton=new JButton("I am different");
		fancybutton.setRolloverIcon(i);
		p1.add(fancybutton);
		p.add(p1,BorderLayout.SOUTH);

		/*
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
		p.add(new JButton("Lol"));
		p.add(new JButton("Yolo"));
		p.add(new JButton("Swag"));
		*/
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new gui();
	}
	public void mouseClicked(MouseEvent e)
	{
		record(e.getX(),e.getY());
	}
	public void mouseEntered(MouseEvent e)
	{
		requestFocus();
		record(e.getX(),e.getY());
	}
	public void mouseExited(MouseEvent e)
	{

	}
	public void mousePressed(MouseEvent e)
	{
		record(e.getX(),e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{

	}
	public void record(int a , int b)
	{
		xpos=a;
		ypos=b;
	}
	public void mouseDragged(MouseEvent e)
	{
		int a =e.getX();
		int b=e.getY();
		Graphics g=getGraphics();
		g.drawLine(xpos,ypos,a,b);
		record(a,b);
	}
	public void mouseMoved(MouseEvent e)
	{
		
	}
}