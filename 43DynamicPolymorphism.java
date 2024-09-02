import java.util.Scanner;
//Dynamic polymorphism = you can choose the subclass of a object during the runtime
//						You first initialize the object as the superclass type and then
//				 		choose to which subclass it belongs
public class Name 
{
	public static void main(String[]args)
	{
		
		//***********************************	Basically the same
		Pokemon x = new Charmander();
		Charmander y = new Charmander();
		//***********************************
		
		
		//***********************************	This is how you'd implement it

		Pokemon poke = new Charmander();
		
		Scanner input = new Scanner(System.in);
		int someInput = input.nextInt();
		
		if(someInput == 1)
		{
			poke = new Charmander();
		}
		else if (someInput == 2)
		{
			poke = new Ratata();
		}
		//***********************************

	}

}

class Pokemon
{
	
}

class Charmander extends Pokemon
{
	
}
class Ratata extends Pokemon
{
	
}