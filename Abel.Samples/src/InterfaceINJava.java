//achieve full abstraction
//achieve multiple inheritance  as there is no ambiguity as implementation provided by implementation class
//IS-A Relationship
//used to achieve loose coupling

/*
 * Abstract class	Interface
1) Abstract class can have abstract and non-abstract methods.	Interface can have only abstract methods.
2) Abstract class doesn't support multiple inheritance.	Interface supports multiple inheritance.
3) Abstract class can have final, non-final, static and non-static variables.	Interface has only static and final variables.
4) Abstract class can have static methods, main method and constructor.	Interface can't have static methods, main method or constructor.
5) Abstract class can provide the implementation of interface.	Interface can't provide the implementation of abstract class.
6) The abstract keyword is used to declare abstract class.	The interface keyword is used to declare interface.
7) Example:
public class Shape{
public abstract void draw();
}	Example:
public interface Drawable{
void draw();
}
 */
interface printable
{
	void print();
}
interface showable
{
	void print();
}
interface asd extends printable
{
	void show();
}
class InterfaceINJava implements printable,showable{
	public void print()
	{
		System.out.println("print Interface method");
	}
	
	public void show ()
	{
		System.out.println("print Interface method2");
	}
	public static void main(String args[])
	{
		InterfaceINJava s = new InterfaceINJava();
		s.print();
	}

}
