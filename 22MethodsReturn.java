//Method = a block of code that is executed whenever it is called upon	
public class Name 
{
	public static void main(String[]args)
	{
		
		int x = 3;
		int y = 2;
		
		int z = addition(x,y);
	}
	
	static int addition(int x, int y)	//static because it is being called from a static method
	{									//int is the type of data type that will return and will change accordingly, like double and boolean
		return x + y;
	}
	
	
}