//Method overriding having different return type is known as covariant return type.
public class CovariantReturnType {

	public static void main(String[] args) {
		B b = new B();
		System.out.println( b.get());

	}

}

class A{
	A get ( )
	{
		return (this);
	}
}

class B extends A
{
	B get ()
	{
		return (this);
	}
}