public class Name 
{
	public static void main(String[]args)
	{
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("HotDog");
		
		//Food[] refrigerator = {food1,food2,food3};	Can do it immediately
		
		
		
		//Food[] refrigerator = new Food[3];			Can do it in steps
		
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		
	}
}


class Food
{
	String name;
	Food(String name)
	{
		this.name = name;
	}
}