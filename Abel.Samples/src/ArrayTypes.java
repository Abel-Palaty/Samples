import java.io.*;
import java.util.Scanner;


public class ArrayTypes {

	 int[] a;
	 
	
	public static void main( String args[]) throws IOException
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		
				System.out.println(n);
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for ( int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a.length);
	}

	
	
}
