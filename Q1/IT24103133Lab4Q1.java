 javaimport java.util.Scanner;

public class IT24103133Lab4Q1 {

	public static void main(String[] args) {
 	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int number = input.nextInt();

if (number == 0)
// Zero;
	 System.out.println("The number is Zero ");

else if (number < 0)
// negative;
	System.out.println("The number is : negative ");

else if (number > 0)
// positive;
	System.out.println("The number is : positive ");


	}
}