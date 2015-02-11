import java.util.Scanner;

public class calculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // Create a Scanner object named input and assign the value of input to whatever the user enters using the keyboard
		double num1;
		double num2;
		double sum;
		
		System.out.println("Enter first number: ");
		num1 = input.nextDouble();
		
		System.out.println("Enter second number: ");
		num2 = input.nextDouble();
		
		sum = num1 + num2;
		
		System.out.print(" The sum of these two numbers is ");
		System.out.println(sum);
		

	}

}
