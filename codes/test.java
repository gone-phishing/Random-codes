import java.awt.event.*;
import javax.swing.*;
class test extends JFrame implements ActionListener
{
	JButton b;
	JTextField t1;
	test()
	{
		b=new JButton("Coelho");
		t1=new JTextField("");
		b.addActionListener(this);
		t1.setBounds(10,10,200,30);
		b.setBounds(10,40,200,50);
		add(t1);
		add(b);
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			String x=b.getText();
			t1.setText("Button name : "+b);
		}
	}
	public static void main(String args[])
	{
		new test();
	}
}
