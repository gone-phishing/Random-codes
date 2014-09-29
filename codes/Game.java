import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Game extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JMenuBar jmb;
	JMenu m1,m2,m3;
	JMenuItem i1,i2,i3,i4;
	JTextField t1;
	int flag=0;
	int count=0;
	int matrix[]=new int[10];

	Game()
	{
		super("Rotation");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b3.setEnabled(false);
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b6.setEnabled(false);
		b7=new JButton("7");
		b7.setEnabled(false);
		b8=new JButton("8");
		b8.setEnabled(false);
		b9=new JButton("9");
		b9.setEnabled(false);
		t1=new JTextField();
		jmb=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Edit");
		m3=new JMenu("Help");
		i1=new JMenuItem("New        ");
		i2=new JMenuItem("Exit        ");
		i3=new JMenuItem("Help        ");
		i4=new JMenuItem("Restart        ");
		
		b1.setFont(new java.awt.Font("Castellar", 1, 30));
		b2.setFont(new java.awt.Font("Castellar", 1, 30));
		b3.setFont(new java.awt.Font("Castellar", 1, 30));
		b4.setFont(new java.awt.Font("Castellar", 1, 30));
		b5.setFont(new java.awt.Font("Castellar", 1, 30));
		b6.setFont(new java.awt.Font("Castellar", 1, 30));
		b7.setFont(new java.awt.Font("Castellar", 1, 30));
		b8.setFont(new java.awt.Font("Castellar", 1, 30));
		b9.setFont(new java.awt.Font("Castellar", 1, 30));
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		i2.addActionListener(this);
		i1.addActionListener(this);
		i4.addActionListener(this);
	
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);

		m1.add(i1);
		m1.add(i4);
		m2.add(i2);
		m3.add(i3);
		jmb.add(m1);
		jmb.add(m2);
		jmb.add(m3);
		add(jmb);
		add(t1);
	
		jmb.setBounds(0,0,600,30);
		b1.setBounds(0,30,200,200);
		b2.setBounds(200,30,200,200);
		b3.setBounds(400,30,200,200);
		b4.setBounds(0,230,200,200);
		b5.setBounds(200,230,200,200);
		b6.setBounds(400,230,200,200);
		b7.setBounds(0,430,200,200);
		b8.setBounds(200,430,200,200);
		b9.setBounds(400,430,200,200);
		t1.setBounds(0,630,600,30);
	
		matrix[0]=0;
		long min=(long)Math.pow(10,8);
		long max=(long)Math.pow(10,9);
		setLayout(null);
		setSize(600,695);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//////////////////////////////// ActionEvent //////////////////////////////////////////////////////////////////////////////	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,1);
			if(flag==1)
			{
				b1.setEnabled(false);
				b3.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b2)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,2);
			if(flag==1)
			{
				b2.setEnabled(false);
				b1.setEnabled(false);
				b4.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b3)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,3);
			if(flag==1)
			{
				b3.setEnabled(true);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b4)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,4);
			if(flag==1)
			{
				b4.setEnabled(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b6.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b5)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,5);
			if(flag==1)
			{
				b5.setEnabled(false);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b7.setEnabled(false);
				b9.setEnabled(false);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b6)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,6);
			if(flag==1)
			{
				b6.setEnabled(true);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b7)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,7);	
			if(flag==1)
			{
				b7.setEnabled(true);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b8)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,8);
			if(flag==1)
			{
				b8.setEnabled(true);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==b9)
		{
			buttonname();
			flag+=1;
			count+=1;
			check(flag,9);	
			if(flag==1)
			{
				b9.setEnabled(true);
			}
			else
			{
				change();
				match();
			}
		}
		if(e.getSource()==i2)
		{
			System.exit(0);
		}
		if(e.getSource()==i1)
		{
			new Game();
		}
		if(e.getSource()==i4)
		{
			buttonname();
			change();
		}
	}

//////////////////////// buttonname //////////////////////////////////////////////////////////////////////////////
	
	private void buttonname()
	{
		long randi=rand();
		String x=""+randi;
		char[] y=x.toCharArray();
		for(int i=1;i<=9;i++)
		{
		}
	}

/////////////////////// random ////////////////////////////////////////////////////////////////////////////////////

	private long rand()
	{
		Random randi=new Random();
		long random=randi.nextLong();
		return random;
	}
////////////////////// change /////////////////////////////////////////////////////////////////////////////////////

	private void change()
	{
		String x1=""+matrix[1];
		b1.setText(x1);
		String x2=""+matrix[2];
		b2.setText(x2);
		String x3=""+matrix[3];
		b3.setText(x3);
		String x4=""+matrix[4];
		b4.setText(x4);
		String x5=""+matrix[5];
		b5.setText(x5);
		String x6=""+matrix[6];
		b6.setText(x6);
		String x7=""+matrix[7];
		b7.setText(x7);
		String x8=""+matrix[8];
		b8.setText(x8);
		String x9=""+matrix[9];
		b9.setText(x9);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(false);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
	}

//////////////////////////// match ////////////////////////////////////////////////////////////////////////////////////

	private void match()
	{
		if((matrix[1]==1)&&(matrix[2]==2)&&(matrix[3]==3)&&(matrix[4]==4)&&(matrix[5]==5)&&(matrix[6]==6)&&(matrix[7]==7)&&(matrix[8]==8)&&(matrix[9]==9))
		{
			t1.setText("You won");
			JOptionPane.showMessageDialog(this,"You won DOUCHEBAG");
			int x=JOptionPane.showConfirmDialog(this,"Want to play again");
			if(x==0)
			{
				new Game();
			}
			else
			{
				System.exit(0);
			}
		}
	}
	
//////////////////////////// check ////////////////////////////////////////////////////////////////////////////////////

	private void check(int flag,int x)
	{
		if(flag==1)
		{
			t1.setText("Moves: "+count+"\tPress another button for direction");
			b3.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
		}
		else if(flag==2)
		{
			rotate(x);
		}
		else
		{
			System.out.println("Invalid Move");
		}
	}
	
/////////////////////////// rotate ///////////////////////////////////////////////////////////////////////////////////////
	
	private void rotate(int x)
	{
		t1.setText("Moves: "+count+"\tYour move was exceptional!!!");
		int temp1,temp2,temp3,temp4;
		temp1=matrix[x-1];
		temp2=matrix[x];
		temp3=matrix[x+2];
		temp4=matrix[x+3];
	
	
		matrix[x-1]=temp3;
		matrix[x]=temp1;
		matrix[x+2]=temp4;
		matrix[x+3]=temp2;
	
		flag=0;
	}
	
//////////////////////////// main //////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String args[])
	{
		 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		new Game();
	}
}