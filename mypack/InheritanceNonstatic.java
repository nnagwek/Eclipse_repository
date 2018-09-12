/*package mypack;

//Assignment 2  Inheritance Nonstatic
abstract class Vehicle
{
private String name;
public Vehicle(String name)
{
	this.name=name;
}
public String details()
{
	return "the name is "+name+" the speed is "+speed();
}
public abstract int speed();
}



class Bus extends Vehicle
{
	public Bus(String name)
	{
	super(name);
	}
	@Override public int speed()
	{
		return  80;
	}
}

class Bike extends Vehicle
{
	public Bike(String name)
	{
	super(name);
	}
	@Override public int speed()
	{
		return  220;
	}
}

class Cycle extends Vehicle
{
	public Cycle(String name)
	{
	super(name);
	}
	@Override public int speed()
	{
		return 20;
	}
}
	 


public class InheritanceNonstatic {

	public static void main(String[] args)
	{
		 Vehicle newbus=new Bus("TMT");
		  System.out.println(newbus.details());
		  
		   Vehicle newbike=new Bike("Yamaha 150");
		  System.out.println(newbike.details());
		  
		  Vehicle newcycle=new Cycle("Orion");
		  System.out.println(newcycle.details());

	}

}




		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
