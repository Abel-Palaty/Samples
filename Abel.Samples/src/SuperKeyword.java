
public class SuperKeyword {

	public static void main(String[] args) {

		Bike b1 = new Bike();
		b1.display();
	}

}

class Vehicle
{
	int speed = 50;
	Vehicle()
	{
		System.out.println("Initialize parent constructor");
	}
}

class Bike extends Vehicle
{
	Bike()
	{
		super(); // calls parent constructor
	}
	int speed =100;
	void display()
	{
		System.out.println(" bike speed is " + speed + " \n vehicle speed is" + super.speed);
	}
}