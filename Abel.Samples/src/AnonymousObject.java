import java.util.Scanner;


public class AnonymousObject {

  static int fact ( int n)
	{
		if (n==0)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number for factorial to be computed \n");
		Scanner in = new Scanner(System.in);
		int factno=in.nextInt();
		System.out.println(" the factorial for number "+ factno + " is " + AnonymousObject.fact(factno));
	}

}
