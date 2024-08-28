//	object = an instance of a class that may contain attributes and methods
public class Name 
{
	public static void main(String[]args)
	{
		Car myCar1 = new Car();			//Like this you declare a instance of a class
		Car myCar2 = new Car();
		
		System.out.print(myCar1.color);	//You can access the variables of the instance of the class
		myCar1.drive();					//You can access the methods   of the instance of the class
		

	}

}











class Car {
	String make ="Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 20000.99;
	
	void drive()
	{
		System.out.println("You drive the car");
	}
	
	void brake()
	{
		System.out.println("You hit the brakes");
	}

}