//Method overriding =	Declaring a method in sub class
//						which is already present in parent class.
//						done so that a child class can give its own implementation

//Which means to write the same method of the parent in a child in order to modify its behavior
public class Name 
{
	public static void main(String[]args)

	{
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		dog.speak();
	}
}

class Animal
{
	void speak()
	{
		System.out.println("The animal speaks");
	}
}

class Dog extends Animal		
{
	@Override
	void speak()	//Now dog will use this version, but if deleted it will use the parent version instead
	{
		System.out.println("The dog gos *bark*");
	}
}