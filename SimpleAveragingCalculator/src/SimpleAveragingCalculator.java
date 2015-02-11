import java.util.Scanner; // Import the class scanner from the java.util package. Scanner reads user input and stores it in a variable 
public class SimpleAveragingCalculator 
{
	public static void main(String[] args) 
	{
		// Variable definitions and declarations
		Scanner input = new Scanner(System.in); // Creates a variable "input" that stores information entered into the keyboard by the user
		double totalValue = 0.0; // Variable to store total value of all numbers entered
		double number; // Variable to store the value of the number entered
		int count = 0; // Counter variable
		double average; // Variable to store the average
		final int NUMBER_AMOUNT = 10; // In Java, constants are declared using the keyword final. Set the total amount of numbers that can be entered to 10  
		
		System.out.println("This program calculates the average of 10 number:");
		System.out.println("Please enter 10 non-negative numbers: "); // Prompt user to enter 10 non-negative numbers
		
		while (count < NUMBER_AMOUNT)
		{
			number = input.nextDouble(); // Scans in the next token as a double and stores it in the variable number
			
			if (number < 0.0)
			{
				System.out.println("You cannot enter a negative number\n Please re-enter a non-negative number: ");
				number = input.nextDouble();
			}
			
			else
			{
			totalValue += number; // Add the value of the number to the value of the total
			}
			count ++; // Increment the counter
		}
		
		average = totalValue / NUMBER_AMOUNT; // Calculate the average
		
		System.out.println("The average is "+average);
		
	
	
	
	}
	
	
}
