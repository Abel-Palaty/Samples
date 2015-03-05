//wrapping data and code together into a single package
package com.abel.encap;

class student
{
	private String name;

	public String getName( )
	{
		return name;
	}
	
	public void setName( String name)
	{
		this.name=name;
	}
	
	
}

public class Encapsulation {
	
	public static void main(String args[])
	{
		student st = new student();
		st.setName("abel");
		System.out.println(st.getName());
	}

}
