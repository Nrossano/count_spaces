import java.util.Scanner;

public class CountSpaces
{

public static void main(String[] args) {
	
	String userString;

	
	int stringLength;
	int numSpaces = 0;

	Scanner input = new Scanner(System.in);

	System.out.print("Please enter a quote");
	userString = input.nextLine();
	stringLength = userString.length();

	for(int i = 0; i < stringLength; i++)
	{
		char ch = userString.charAt(i);
		if(ch == ' ')
		{
			numSpaces++;
		}
	}


	System.out.println("Your quote has " + numSpaces + " spaces in it.");

	}
}


