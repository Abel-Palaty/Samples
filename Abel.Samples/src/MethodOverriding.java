
public class MethodOverriding {

	public static void main(String[] args) {
		
		bikes b1 = new bikes();
		b1.display();

	}

}


// good example would be bank interset rate, icici will have different than hdfc

class vehicles
{
	void display()
	{
		System.out.println(" Vehicle has multiple vehicles");
	}
}


class bikes 
{
	void display()
	{
		System.out.println("Bike has 2 bikes");
	}
}