import java.util.Scanner;
//Exception =	an event that occurs during the execution of a program that,
//				disrupts the normal flow of instructions
//				 		
public class Name 
{
	public static void main(String[]args)
	{
			
		try 							//Starts with try 
		{
			int x = 12;
			int y = 0;
			
			int result = x/y;
		}
		catch(ArithmeticException e)	//Copy the exception name and paste it inside the parenthesis of catch
		{
			System.out.println("This is a normal exeption catcher");
		}
		catch(Exception e)				//This one catches all exceptions
		{
			System.out.print("This catches all exeptions");
		}
		finally							//This one always executes in the end
		{
			System.out.print("This always executes in the end");
		}
		
	}
	
}