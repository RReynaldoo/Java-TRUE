//Encapsulation = 	attributes of a class will be hidden or private,
//					Can be accessed only through methods (getters & setters)
//					You should make attributes private if you don't have a reason to make them public/protected
public class Name 
{
	public static void main(String[]args)
	{
		Car car = new Car("Chevrolet");
		
		car.getMake();			//to retrieve
		car.setMake("Chu CHu");	//to assign
	}
}

class Car
{
	private String make;
	
	Car(String make)		//There is two ways to do it
	{
		this.make = make;	//If we do not have setters we use this
		this.setMake(make);	//If we do have, then we call the method here and pass the variable
	}
	
	public String getMake()
	{
		return this.make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	
}
