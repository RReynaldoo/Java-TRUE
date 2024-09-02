import java.io.File;
//	File =	An abstract representation of file and directory pathnames
//				
//				 		
public class Name 
{
	public static void main(String[]args)
	{
		File fileName = new File("TopSecret.txt"); 		//In parenthesis you put the name of the file with its extension .exe, .txt, etc
		
		fileName.exists();				//Evaluates if exists
		fileName.getPath();				//Gets its name
		fileName.getAbsolutePath();		//Gets its complete path 
		fileName.isFile();				//Checks if it is a file
		
	}
	
}