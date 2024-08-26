import java.util.Scanner;
public class Name {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);		//Creates a Scanner object
		
		String name = input.nextLine();	//Stores next line completely
		int number = input.nextInt();	//Stores next integers 
		
		//After using nextInt or similar add a nextLine() alone to fix the issue that there is with this command
		//The is a scanner command for any kind of input data
	}

}
