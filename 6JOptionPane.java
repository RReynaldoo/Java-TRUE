import javax.swing.JOptionPane;

public class Name {
	public static void main(String[]args)
	{
		String string = JOptionPane.showInputDialog("Enter your name");	//To show a input window
		JOptionPane.showMessageDialog(null, "Your name is "+string);		//To show a message window
		
		Integer.parseInt(string);	//This is to convert from string to any number based data type. There is one for all the others.
									//In parenthesis you can put the entire JOptionPane.showInputDialog(); and convert the input.
		
	}

}