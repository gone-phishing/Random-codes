import java.io.*;
import java.util.*;

class Anagram
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    Anagram()
    {
        String a=read();
        String b=read();
        String y=""+a+b;
        char x[]=y.toCharArray();
        ArrayList<Character> al=new ArrayList<Character>();
        for(int i=0;i<x.length;i++)
        {
            al.add(x[i]);
        }
        int size=al.size();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            //write(i+"th iteration");
            int p=al.indexOf(al.get(i));
            int q=al.lastIndexOf(al.get(i));
            if(p!=q)
            {
                /*
                al.remove(al.get(i));
                al.remove(al.get(i));
                */
                if(q>=a.length())
                {
                    count++;
                    al.remove(al.lastIndexOf(al.get(i)));
                    write("ArrayList is: "+al.toString());
                }
            }
        }
        write(""+(size-(2*count)));
        //write(""+(al.size()-a.length()));
    }
    public static void main(String[] args) {
        new Anagram();
    }
    public String read()
    {
        String x=null;
        try
        {
             x=br.readLine();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return x;
    }
    public void write(String x)
    {
        try
        {
            bw.write(x+"\n");
            bw.flush();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}