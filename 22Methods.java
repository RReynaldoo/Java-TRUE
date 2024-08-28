//Method = a block of code that is executed whenever it is called upon	
public class Name 
{
	public static void main(String[]args)
	{
		String name = "Luke";
		int age = 12;
		hello(name, age);
	

	}
	
	//It goes outside the main block
	//When called directly from main method it needs to be static
	static void hello(String name, int age)
	{
		System.out.println(name + age);
	}
	
}