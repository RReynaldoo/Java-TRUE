//	Constructor = special method that is called when an object is instantiated (created)
public class Name 
{
	public static void main(String[]args)
	{
		Humans human1 = new Humans("Mike", 23,80);		//Sends arguments to the custom constructor to assign them to this object in concrete.
		Humans human2 = new Humans("Jessie",54, 90);
		
		human1.eat();
		human2.drink();

	}

}





class Humans {
	
	String name;
	int age;
	int weight;
	
	Humans(String name, int age, int weight)		//Custom constructor, needs parameters to be sent to him to assign them to the correspondent object
	{
		this.name = name;		//"This" assigns the variable the parameter was sent to the object that used the constructor
		this.age = age;
		this.weight = weight;
	}
	
	void eat()
	{
		System.out.print(this.name+" is eating");		//Calls only the name
	}
	
	void drink()
	{
		System.out.print(this.name+" is drinking   *gulp*");
	}
}