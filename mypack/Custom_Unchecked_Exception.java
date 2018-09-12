// Assignment 8 b
package mypack;

public class Custom_Unchecked_Exception {

	
	public int myMethod(int number1,int number2)throws MyUncheckedException
	{
		if(number1==0 && number2==0)
		{
			throw new MyUncheckedException("Numbers Cant be zero to divide");
		}
		else if (number2==0)
		{
			throw new MyUncheckedException("My Divide By Zeo Exception");
		}
		
		return number1/number2;
		
	}
	public static void main(String[] args) {
		
		Custom_Unchecked_Exception cuexample=new Custom_Unchecked_Exception();

	int result=	cuexample.myMethod(16,4);
	System.out.println("Result is "+result);
	}

}



 class MyUncheckedException extends RuntimeException
{
	
	

	public MyUncheckedException(String message)
	 {
		 super(message);
	 }
	
	public MyUncheckedException()
	 {
		 super();
	 }
}
