//printf = 	an optional method to control, format, and display text to the console window 
//			two arguments =	format string + (object/variable/value)
//			%	[flags]	[precision]	[width]	[conversion-character]
public class Name 
{
	public static void main(String[]args)
	{
		boolean myBoolean = true;
		char myChar = 'w';
		String myString = "Tobias";
		int myInt = 999;
		double myDouble = 998;
		
		// 	[conversion-character]
		//The letter after the % indicates the data type that will be displayed
		System.out.printf("Check this out %b",myBoolean);		
		System.out.printf("Check this out %c",myChar);
		System.out.printf("Check this out %s",myString);
		System.out.printf("Check this out %d",myInt);
		System.out.printf("Check this out %f",myDouble);
		
		//	[width]
		// number between characters that determines the blank space before the variable, negative is for the space at the end
		System.out.printf("CHeck this out %-10s",myString);
		
		//	[precision]
		//	Number of digits after the point with floating-point values
		System.out.printf("CHeck this out %.2f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
	}

}
