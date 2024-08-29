//abstract = 	abstract classes cannot be instantiated, but they can have a subclass
//				abstract methods are declared without an implementation and the subclass must override it
public class Name 
{
	public static void main(String[]args)
	{
		//Vehicle vehicle = new Vehicle();		now this class can't have instances
		Car car = new Car();
	}
}

abstract class Vehicle	
{
	abstract void go();							//The classes' methods cannot have bodies
}

class Car extends Vehicle
{
	@Override
	void go() 		//The child classes must override the abstract methods
	{
		System.out.println("The driver is driving the car");
	}
	
}

//This is a layer of security