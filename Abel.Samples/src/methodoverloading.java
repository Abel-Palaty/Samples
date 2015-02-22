
public class methodoverloading {
	
	methodoverloading()
	{
		System.out.println("constructor intialized");
	}
	methodoverloading(int a)
	{
		System.out.println("contructor value intialized with " + a);
	}
	
	int sum (int a, int b, int c)
	{
		return(a+b+c);
	}

	int sum (int a, int b)
	{
		return (a+b);
	}
	public static void main(String[] args) {

		methodoverloading mo =new methodoverloading(5);
		System.out.println(mo.sum (1,2,3));
		System.out.println(mo.sum(1, 2));
		
	}

}
