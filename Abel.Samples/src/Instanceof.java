
public class Instanceof {

	public static void main(String[] args) {

		IB b = new IB();
		if (b instanceof IA)
		{
			IA a= (IA)b;
			System.out.println(a);
		}
		else
		{
			System.out.println("b not a instance of IA");
		}
	}

}


class IA
{
	public int a=0;
}

class IB extends IA
{
	int a=3;
}