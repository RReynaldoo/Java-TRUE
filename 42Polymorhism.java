//Polymorphism =	The ability of an object to identify as more than one type
//					
//				 
public class Name 
{
	public static void main(String[]args)
	{
		Boat boat = new Boat();
		Car car = new Car();
		
		Vehicle[] racers = {boat,car};		//Boat identifies as boat and as vehicle, so an array of boats or vehicles can contain boats
											//that is the whole point, you can include objects, classes, etc in stuff if they are identified or part
											//of such things
		for (Vehicle i: racers)
		{
			i.go();
		}
	}
}


//##########################################
class Vehicle
{
	void go()
	{
		System.out.print("It is moving!!!");
	}
	
}

class Boat extends Vehicle
{

}
class Car extends Vehicle
{
	
}