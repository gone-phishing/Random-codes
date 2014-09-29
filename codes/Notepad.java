import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Notepad extends JFrame implements ActionListener
{
	JMenuBar jmb;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17;
	JScrollPane jScrollPane1;
   	JTextArea jTextArea1;
	public Notepad()
	{
		super("Notepad");
		jScrollPane1 = new JScrollPane();
        	jTextArea1 = new JTextArea();
		jmb=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Edit");
		m3=new JMenu("Format");
		m4=new JMenu("View");
		m5=new JMenu("Help");
		i1=new JMenuItem("New");
		i2=new JMenuItem("Open");
		i3=new JMenuItem("Save");
		i4=new JMenuItem("SaveAs");
		i5=new JMenuItem("Print");
		i6=new JMenuItem("Exit");
		i7=new JMenuItem("Undo");
		i8=new JMenuItem("Cut");
		i9=new JMenuItem("Copy");
		i10=new JMenuItem("Paste");
		i11=new JMenuItem("Delete");
		i12=new JMenuItem("Find");
		i13=new JMenuItem("Replace");
		i14=new JMenuItem("Time/Date");
		i15=new JMenuItem("Font");
		i16=new JMenuItem("Status Bar");
		i17=new JMenuItem("Help");
		i6.addActionListener(this);

		 jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();

		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m1.add(i5);
		m1.add(i6);
		m2.add(i7);
		m2.add(i8);
		m2.add(i9);
		m2.add(i10);
		m2.add(i11);
		m2.add(i12);
		m2.add(i13);
		m2.add(i14);
		m3.add(i15);
		m4.add(i16);
		m5.add(i17);
		jmb.add(m1);
		jmb.add(m2);
		jmb.add(m3);
		jmb.add(m4);
		jmb.add(m5);
		add(jmb);
		add(jTextArea1);
		jmb.setBounds(0,0,1350,30);
		//jTextArea1.setBounds(0,30,1350,670);
		setLayout(null);
		setSize(1350,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i6)
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		new Notepad();
	}
}