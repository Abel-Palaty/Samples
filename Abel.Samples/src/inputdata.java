import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class inputdata {

	public static void main(String[] args) throws IOException {

		Scanner n = new Scanner(System.in);
		System.out.println("enter integer data");
		try
		{
			System.out.println(n.nextInt());
		}
		catch (Exception e)
		{
			System.out.println("Exception is " + e);
		}
		
		InputStreamReader r = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(r);
		String str="";
		while(!str.equals("stop"))
		{
			
		
		System.out.println("Enter a string");
		str=br.readLine();
		System.out.println("the String is \n\n"  + str );
		
		}
		n.close();
		
	}

}
