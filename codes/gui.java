import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class gui extends JFrame implements MouseListener,MouseMotionListener
{
	JLabel l;
	private int xc=0,yc=0;
	int lastX,lastY;
	gui()
	{
		super("Trial");
		//li=new Light();
		Container c=getContentPane();
		addMouseListener(this);
		addMouseMotionListener(this);
		l=new JLabel();
		c.setLayout(new BorderLayout());
		c.add(l,BorderLayout.SOUTH);
		//c.add(li,BorderLayout.CENTER);
		//Date();
		//System.out.println(x);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	new gui();
	}
	public void record(int a , int b)
	{
		lastX=a;
		lastY=b;
	}
	public void mouseDragged(MouseEvent e)
	{
		int a=e.getX();
		int b=e.getY();
		Graphics g=getGraphics();
		g.drawLine(lastX,lastY,a,b);
		record(a,b);
	}
	public void mouseMoved(MouseEvent e)
	{

	}
	public void mouseClicked(MouseEvent e)
	{
		xc=e.getX();
		yc=e.getY();
		l.setText("X-coordi: "+xc+"    Y-coordi: "+yc);
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
}
