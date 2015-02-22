import java.io.*;
import java.util.Scanner;
public class Aggregation {

	public static void main(String[] args) {
		
		circle c=new circle();
		c.display();

	}

}

class square
{
	public int square( int n)
	{
		return (n*n);
	}
}

class circle
{
	int radius=0;
	Scanner in = new Scanner (System.in);
	public void display ()
	{
		square s=new square();
		System.out.println("enter radius");
		radius=in.nextInt();
		System.out.println("area is  " + s.square(radius));
	}
	
}