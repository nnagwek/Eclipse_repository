

package mypack;

public class Contuctor_Chaining_Example {

	public static void main(String[] args)
	{
	
		 // invokes default constructor first 
	     new Contuctor_Chaining_Example(); 
	}
//default constructor 1
	Contuctor_Chaining_Example() 
	 { 
	     // calls constructor 2 
	     this(2); 
	     System.out.println("In  the  Default constructor"); 
	 } 

	 // parameterized constructor 2 
	Contuctor_Chaining_Example(int x) 
	 { 
	     // calls constructor 3 
	     this(2, 8); 
	     System.out.println(x); 
	 } 

	 // parameterized constructor 3 
	Contuctor_Chaining_Example(int x, int y) 
	 { 
	     System.out.println(x * y); 
	 } 

	
	
}






