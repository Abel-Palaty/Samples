
public class ClassEg {
	
	int rollno;
	String name;
	
	void InsertRecord ( int rno, String nam)
	{
		rollno=rno;
		name=nam;
	}
	
	void DisplayInfo ()
	{
		System.out.println(rollno+ "   "+name);
	}

	public static void main(String[] args) {
		
		ClassEg s1= new ClassEg();
		ClassEg s2= new ClassEg();
		s1.InsertRecord(1, "abel");
		s1.DisplayInfo();
		s2.InsertRecord(2, "palaty");
		s2.DisplayInfo();

	}

}
