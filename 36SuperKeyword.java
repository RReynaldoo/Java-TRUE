//Super = 	keyword refers to the superclass (parent) of an object
//			very similar to "this" keyword
public class Name 
{
	public static void main(String[]args)

	{
		Hero hero1 = new Hero("Tobias", 23, "Materialization");
		System.out.println(hero1.toString());
	}
}
//########################################################
class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{		
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return this.name+" "+this.age+" ";
	}
}
//##########################################################
class Hero extends Person
{
	String power;
	
	Hero(String name, int age, String power)
	{
		super(name, age);           //super to send the name and age to the parent's contructor and save time
		this.power = power;
	}
	
	public String toString()
	{
		return super.toString()+power;      //Super calls the other elements in toString
	}
}