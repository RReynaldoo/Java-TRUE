import java.io.FileWriter;
import java.io.IOException;
//	Writer =	To create and write on files. Two imports needed
//				
//				 		
public class Name 
{
	public static void main(String[]args)
	{
		try 		//It has to be surrounded by try and catch
		{
			FileWriter smth = new FileWriter("Poem.txt");		//To create it
			smth.write("There is something there");				//To write
			smth.append("/nMade with love");					//To append at the end
			smth.close();										//Doesn't work if you don't add this at the end
		} 
		
		catch (IOException e) 	//All this is default for this
		{
			e.printStackTrace();
		}

	}
	
}