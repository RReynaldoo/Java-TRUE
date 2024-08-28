/*	local variable = 	declared inside a method (or constructor)
*						visible only to that method 
*	
*	global variable = 	declared outside a method, but within a class
*						visible to all parts of a class
*/
public class Name 
{
	public static void main(String[]args)
	{
		DiceRoller diceRoller = new DiceRoller();
		
	}

}

import java.util.Random;

public class DiceRoller		//This will instantly generate a number the moment a object is created, because the constructor, which is the first thing
							//you call when you declare an object, will immediately generate and display a random number
{
	//initialize in data field
	Random random;
	int number;
	
	DiceRoller()	//But set the values in the constructor, and declare the objects here as well
					//Here will execute first since is the first thing you use when creating an object, unless you don't call the constructor
	{
		random = new Random();
		roll();
	}
	
	void roll()
	{
		this.number = random.nextInt(6);
		System.out.print(number);
	}

}