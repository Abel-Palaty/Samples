import java.util.*;
public class ThisKeyword {
	
	ThisKeyword()
	{
		this (1);
		System.out.println("contructor called by this()");
	}

	ThisKeyword(int a)
	{
		System.out.println("contructor called by this(1)"  + a);
	}
	
	int id;
	String name;
	
	void student (int id, String name)
	{
		
		this.id=id;
		this.name=name;
		System.out.println("id is :" + id + "\n name is : " + name);
		this.students();
	}
	
	
	void students()
	{
		System.out.println("STUDENTS");
	}
	
	public static void main(String[] args) {

		
		Scanner  n = new Scanner (System.in);
		System.out.println("Enter id <space>  name");
		
		int a = 0;
		String nam = null;
		try {
			a = n.nextInt();
			nam = n.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		ThisKeyword tk =new ThisKeyword();
		tk.student(a,nam);
		
		
		
		
	}

}
