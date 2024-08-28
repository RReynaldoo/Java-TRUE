//Static = 	modifier. A single copy of a variable/method is created and shared
//			The class "owns" the static member

public class Name 
{
	public static void main(String[]args)

	{
		Friends friend1 = new Friends("Mark");
		Friends friend2 = new Friends("Doblas");
		
		friend1.show();		//nahhh
		Friends.show();		//Yes
	}
}

class Friends
{
	static int amount;		//Only one amount of friends exist and can be accessed by objects 
	String name;			//Multiple names exist and can be accessed by objects 
	
	Friends(String name)
	{
		amount++;
		this.name = name;
	}
	
	static void show()		//Only one show() method exist, therefore it is commonly accessed using the name of the class instead of using an object 
							//because there is no use in using an object when there is only one version of this method
	{
		System.out.println("You have "+amount+" friends");
	}
}