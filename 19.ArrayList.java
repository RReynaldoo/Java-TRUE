// ArrayList = a resizable array
// Items can be added and removed after compilation phase
// Only store reference data types
import java.util.ArrayList;
public class Name {
	public static void main(String[]args)
	{
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");		//Adds an element at the end of the array
		food.add("ham");
		food.add("hotdog");
		
		food.set(0, "sushi");	//Adds an element in a position in the array
		food.get(0);			//Returns a value of the array in the specified position
		food.remove(0);			//Removes an item in the specified position
		food.clear();			//Clears the entire array
		
		
	}

}
