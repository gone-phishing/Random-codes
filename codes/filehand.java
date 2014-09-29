import java.io.*;
class filehand
{
	BufferedReader br;
	BufferedWriter bw;
	filehand()
	{
		try
		{
			br=new BufferedReader(new FileReader("read.txt"));
			bw=new BufferedWriter(new FileWriter("write.txt"));
			String s=null;
			while((s=br.readLine())!=null)
			{
				//System.out.println(""+s);
				bw.write(s);
				bw.newLine();
			}
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		new filehand();
	}
}