// Assignment 8 a
package mypack;

import java.util.Scanner;

public class Custom_Checked_Example {
	
	public String myMethod ( String name) throws MyCustomCheckedException
	{
		if("".equals(name))
		{
			throw new MyCustomCheckedException("Name Should not be Empty");
		}
		return name;
	}

	public static void main(String[] args)
	{
	Custom_Checked_Example example=new Custom_Checked_Example();
	
	try {
		System.out.println(example.myMethod("niket"));
	} catch (MyCustomCheckedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try (Scanner sc1=new Scanner(System.in)){
		System.out.println(example.myMethod(sc1.nextLine()));
	} catch (MyCustomCheckedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}


class MyCustomCheckedException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public MyCustomCheckedException(String message)
	{
		super(message);
	}
}


