//overloaded methods = methods that share the same name but have different parameters
//					   method name + parameter = method signature
//They are called according to the arguments we pass to them, ""the amount, type and order""
public class Name 
{
	public static void main(String[]args)
	{
		add(1,2);		//This calls the first
		add(1,2,3);		//This calls the second
		add(1,2,3,4);	//This calls the third
		
		add(1.2, 1.3);	//This calls the double one
		
	}
//###################################################
	static int add(int a, int b)
	{
		return a+b;
	}
//	------------------------------------------------
	static double add(double a, double b)
	{
		return a+b;
	}
//###################################################
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
//###################################################	
	static int add(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}

}