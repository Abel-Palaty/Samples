
public class AbstractClass {

	public static void main(String[] args) {
		

	}

}


abstract class Banks
{
	abstract void GetInterestRate();
	abstract void BankName();
	
}

class PNB extends Banks
{
	void GetInterestRate()
	{
		System.out.println("9");
	}

	void BankName()
	{
		System.out.println("PNB");
	}
}

class SBI extends Banks
{
	void GetInterestRate()
	{
		System.out.println("8");
	}

	void BankName()
	{
		System.out.println("SBI");
	}
}