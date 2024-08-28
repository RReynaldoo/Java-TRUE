/*
 * Overloaded constructors =	multiple constructors within a class with the same name,
 * 								but have different parameters
 * 								name + parameters = signature
 */

//When you create a object, you can have a constructor for each scenario, as long as the parameters are different in amount, data type or order
public class Name 
{
	public static void main(String[]args)
	{
		Pizza pizza = new Pizza("Thick","Tomato","Mozzarella","Pepperoni");
	}

}

class Pizza
{
	String bread;
	String sauce;
	String cheese;
	String topping;
	int x;
		
	Pizza(String bread,String sauce, String cheese, String topping)	//
	{
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
//############################################################
	Pizza(String bread,String sauce, String cheese, int x)	//
	{
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.x = x;
	}
//#############################################################
	Pizza(String bread,String sauce, String cheese)
	{
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread,String sauce)
	{
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread)
	{
		this.bread = bread;
	}
}






