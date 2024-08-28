// You can pass objects of a class to other classes' methods and perform actions as you would with primitive variables
// only difference is that you will then have to specify what you want to access

public class Name 
{
	public static void main(String[]args)

	{
		Guitar myGuitar = new Guitar("Blue");	//Create guitar object with a color
		Display display = new Display();		//Create a object like you do with Scanner to use the methods of this class
				
		display.show(myGuitar);					//Call the method of this class
	}
}

class Guitar
{
	String color;				
	
	Guitar(String color)		//Assign color to guitar
	{
		this.color = color;
	}
}

class Display
{
	 public void show(Guitar guitar)		//Receives a Guitar object 
	{
		System.out.print("Your guitar is color "+guitar.color);		//Accesses a guitar object property and displays it
	}
}