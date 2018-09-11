package mypack;

public class Generics_Example {

	public static void main(String[] args)
	{
		Box<Integer> box= new Box<Integer>();
		box.setItem(100);
 System.out.println(box.getItem());
System.out.println("*******************************");
 Box<String> box1= new Box<String>();
	box1.setItem("new Item");
System.out.println(box1.getItem());
 
	}

	/**
	 * 
	 */


}
 
class Box<T>
{
	T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public Box(T item) {
		super();
		this.item = item;
	}
	 public Box()
	 {
		 
	 }
	
}