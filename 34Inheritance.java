//Inheritance = the process where one class acquires,
//              the attributes and methods of another
public class Name 
{
	public static void main(String[]args)

	{
		Bicycle bike = new Bicycle();
		Car car = new Car();
		
		bike.go();		
		car.stop();		//Can use inheritance
		
		car.wheels();	//Because it is not inheriting from bike, it cannot use it
	}
}

class Vehicle
{
	double speed;
	
	void go()
	{
		System.out.print("You are speeding");
	}
	
	void stop()
	{
		System.out.print("You stopped suddenly");
	}
}



class Bicycle extends Vehicle //Due to inheritance now bike inherits the methods and variables of Vehicle
{
	int wheels = 2;
}

class Car extends Vehicle //Due to inheritance now car inherits the methods and variables of Vehicles
{
	int doors = 4;
}