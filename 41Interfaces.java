//Interfaces =	its a template that allows multiple inheritance
//				in practice, its like having a abstract class, and you can inherit from as many as you want
//				classes can implement more than one interface, but can only extend to one superClass 
public class Name 
{
	public static void main(String[]args)
	{
		Fish fish = new Fish();
		
		fish.hunt();	//Can use the Prey's methods
		fish.scape();	//Can use the Predator's methods
			
	}
}

interface Prey
{
	void scape();
}
interface Predator
{
	void hunt();
}



class Fish implements Prey,Predator	//It can implement both of them and inherit their methods, that also must override
{
	@Override
	public void hunt() {
	}

	@Override
	public void scape() {	
	}
	
}