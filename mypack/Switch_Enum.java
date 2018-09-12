//Assignment 10 c
package mypack;

public class Switch_Enum {

	public static void main(String[] args) {
		
		Fruit c;
	      c = Fruit.Banana;
	      switch(c) {
	         case Apple:
	            System.out.println("You choose Apple!");
	            break;
	         case Banana:
	            System.out.println("You choose Banana!");
	            break;
	         case Guava:
	            System.out.println("You choose Guava!");
	            break;
	         case WaterMelon:
	            System.out.println("You choose WaterMelon!");
	            break;
	         default:
	            System.out.println("I don't know your fruit.");
	            break;
	      }
	}

}



enum Fruit {
	   Apple,Banana,Guava,WaterMelon;
	}
	
