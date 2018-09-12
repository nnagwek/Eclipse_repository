/*
 * JAVA program demonstrating  composition by creating Employee and Address class
 */

package mypack;

public class CompositionExample {

	public static void main(String[] args) {
		
		
		Employee employee = new Employee("niket"); 
		int buildingno = employee.getbuildingno(); 
		String streetname=employee.getstreetname();
		int id=employee.getId();
		String name=employee.getName();
		System.out.println("   ID="+id+" Name:"+name+"   Streetname:"+streetname+"  buildingno="+buildingno);

	}

}

/*
 * Address  class  is immutable
 * 1.  No Setter Methods 
 * 2.final and private fields
 * 
 */

final class Address 
{ 
private final String streetname; 
private final int buildingno; 
private final int id; 

public Address(String streetname,int buildingno,int id)
{
this.streetname=streetname;
this.buildingno=buildingno;
this.id=id;	
		
}

public String getstreetname() { 
return streetname; 
} 

public int getbuildingno() { 
return buildingno; 
} 

public int getId() { 
return id; 
} 



} 

/*
 * Employee Class is also Immutable 
 * Here Composition is demonstrated as 
 * Employee class has an instance of Address
 */


final class Employee { 

	//composition has-a relationship 
	private Address address; 
	private String name;
	public Employee(String name){ 
	this.address=new Address("Panchpakdi",205,1); 
	this.name=name;
	} 
	public int getbuildingno() { 
	return address.getbuildingno(); 
	} 

	public String getstreetname() { 
	return address.getstreetname(); 
	} 

	public int getId() { 
	return address.getId(); 
	}

	public String getName() { 
	return name; 
	} 
	} 






































