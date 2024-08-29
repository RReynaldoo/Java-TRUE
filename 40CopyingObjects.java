//Encapsulation = 	attributes of a class will be hidden or private,
//					Can be accessed only through methods (getters & setters)
//					You should make attributes private if you don't have a reason to make them public/protected
public class Name 
{
	public static void main(String[]args)
	{
		Car car1 = new Car("Chevrolet");
		
		Car car2 = new Car(car1);	//Copy way 1
		car2.copy(car1);			//copy way 2
	}
}

class Car
{
	private String make;
	
	Car(String make)		
	{
		this.setMake(make);
	}
	//################################

	Car(Car car)
	{
		this.copy(car);		//To do it since declaration we create a constructor that calls the method
	}
	//################################
	public String getMake()
	{
		return this.make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	//################################

	public void copy(Car car)	//The method receives a object
	{
		this.setMake(car.getMake());	//You set the object that is calling the method the values of the object you want to copy
										//		You have to do this for each attribute you want to copy
	}
	//################################

}
