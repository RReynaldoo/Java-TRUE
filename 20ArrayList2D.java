//A dynamic list of lists
import java.util.*;
public class Name {
	public static void main(String[]args)
	{
		
		ArrayList<String> bakeryList = new ArrayList();		//Creates an array list of strings
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();		//Creates an array list of strings
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();		//Creates an array list of strings
		drinksList.add("soda");
		drinksList.add("coffee");
		
		ArrayList<ArrayList<String>> groceryList= new ArrayList();		//Creates an array list of "array lists of strings"
		
		groceryList.add(bakeryList);	//Here the array lists are being added
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList);//Here they are displayed
		
	}
}