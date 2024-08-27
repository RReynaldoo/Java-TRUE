//for-each = used to iterate through the elements in an array or collection
// less steps, more readable
// less flexible	
import java.util.*;
public class Name {
	public static void main(String[]args)
	{
//############################################################  Works for arrys
		Integer[] numbers = {1,2,3,4,5};    
		
		for(Integer i: numbers)
		{
			System.out.println(i);
		}
//############################################################  And other collections
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		for(Integer i: number)
		{
			System.out.println(i);
		}

	}
}
