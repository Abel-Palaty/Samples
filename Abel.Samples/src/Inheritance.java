
public class Inheritance {

	public static void main(String args[])
	{
	System.out.println("INHERITANCE");
	SoftwareEngineer se= new SoftwareEngineer();
	se.display();
	}
	
}

class Employee
{
	int id=100001;
	String name="Abel";
}

class SoftwareEngineer extends Employee
{
	int bonus=10000;
	
	public void display()
	{
		System.out.println(name + id + bonus);
	}
	
}