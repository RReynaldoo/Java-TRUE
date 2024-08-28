// toString =	special method that all objects inherit
//				that returns a string that "textually represents" an object
//				can be used both implicitly and explicitly
public class Name 
{
	public static void main(String[]args)
	{
		Car car = new Car();
		
		System.out.print(car);
	}

}

class Car
{
	String make = "Ford";
	int year = 2022;
	
	public String toString()		//Only works with toString and can be used to return the values of the object
	{
		return make+"\n"+year;
	}
}