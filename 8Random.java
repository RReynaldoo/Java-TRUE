import java.util.Random;

public class Name {
	public static void main(String[]args)
	{
		Random number = new Random();
		
		int x = number.nextInt();			//Generates a random number, put a number in () to limit the threshold
		double y = number.nextDouble();		//Generates a random number between 0 and 1
		boolean z = number.nextBoolean();	//Random true or false
		
	}

}