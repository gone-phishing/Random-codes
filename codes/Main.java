import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
 
 
public class Main {
 
	InputReader input;
	PrintWriter output;
	//BufferedReader inp;
 
	void run(){
		output = new PrintWriter(new OutputStreamWriter(System.out));
		input = new InputReader(System.in);
		//inp = new BufferedReader(new InputStreamReader(System.in));
		solve();
		output.flush();
	}
 
	public static void main(String[] args){
		new Main().run();
	}
	
	int[] bit;
	
	void solve() {
		int t = input.readInt();
		while(t-- > 0) {
			int n = input.readInt();
			long sum = 0;
			long[] v = new long[n+1];
			bit = new int[33];
			for(int i = 1; i <= n; i++){ 
				v[i] = input.readLong();
			}
			long[] a = new long[n+1];
			a[1] = v[1];
			setCount(a[1]);
			sum = (long)a[1];
			for(int i = 2; i <= n; i++) {
				a[i] = (a[i-1]^v[i]);
				sum += (long)a[i];
				setCount(a[i]);
			}
			long res = 0;
			res += sum;
			output.println(res+"\n");
			res += sol(n);
			output.println(res);
		}
	}
 
	
	void setCount(long a) {
		int mask = 1;
		for(int i = 0; i < 32; i++) {
			if((a & mask) != 0) {
				bit[i]++;
			}
			mask = mask<<1;
		}
	}
	
	long sol(int n) {
		long res = 0;
		int mask = 1;
		for(int i = 0; i < 32; i++) {
			int v = bit[i];
			long tmp = v;
			tmp = tmp * (n-v);
			tmp = tmp * mask;
			res += tmp;
			mask = mask<<1;
		}
		return res;
	}
	
	class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars)
			{
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int readInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-')
			{
				sgn = -1;
				c = read();
			}
			int res = 0;
			do
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public String readString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuffer res = new StringBuffer();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public Long readLong() {
			return Long.parseLong(readString());
		}
 
		public java.lang.Double readDouble() {
			return java.lang.Double.parseDouble(readString());
		}
 
		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}
 
 
} 
