import java.util.Scanner;

public class IT24103133Lab4Q2 {

	public static void main(String[] args) {
 	
	Scanner input = new Scanner(System.in);


System.out.print("Please enter exam marks (out of 100): ");
	double examMarks = input.nextDouble();

if (examMarks < 0 || examMarks > 100){
	System.out.println("Invalid input for exam marks. Terminating program.");
	return;}

System.out.print("Please enter lab submission marks (out of 100): ");
	double labSubmissionMarks = input.nextDouble();

if (labSubmissionMarks < 0 || labSubmissionMarks > 100){
	System.out.println("Invalid input for lab submission marks. Terminating program.");
	return;}

System.out.print("Please enter the percentage given for the exam: ");
	double examPercentage = input.nextDouble();

System.out.print("Please enter the percentage given for the lab submission: ");
	double labSubmissionPercentage = input.nextDouble();

if (examPercentage + labSubmissionPercentage !=100){
	System.out.println("The percentage must add up to 100. Terminating program.");
	return;}


	double finalMark = (examMarks * examPercentage/100)+(labSubmissionMarks * labSubmissionPercentage/100);

	System.out.println("Final Exam Mark is: "+finalMark);
	}
}

