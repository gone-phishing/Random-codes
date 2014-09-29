import java.util.Scanner;

public class UseRectangle {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("Enter the parameters for the four argument constructor");
		a=inp.nextInt();
		b=inp.nextInt();
		c=inp.nextInt();
		d=inp.nextInt();
		
		Rectangle r1= new Rectangle(a,b,c,d);
		
		System.out.println("Enter the parameters for the three argument constructor");
		a=inp.nextInt();
		b=inp.nextInt();
		c=inp.nextInt();
		
		Rectangle r2= new Rectangle(a,b,c);
		
		Rectangle r3= new Rectangle();
		
		

	}

}
