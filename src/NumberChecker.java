import java.util.Locale;
import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) {
		// Create an instance of the NumberChecker class
		NumberChecker numberChecker = new NumberChecker();

		// Call the methods to ask for a number three times
//		numberChecker.verifyIfNumberIsMultipleOf5();
//		numberChecker.verifyIfNumberIsEvenOrOdd();
//		numberChecker.verifyIAgeIsGreaterThan18();
//		numberChecker.verifyGrade();
		numberChecker.verifyMedia();
	}

	public void verifyIfNumberIsMultipleOf5() {
		// 1. Ask a number verify if it multiple of 5

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			// Prompt the user to enter a number
			System.out.print("Enter a number: ");

			// Read the input number from the user
			int number = scanner.nextInt();

			// Check if the number is a multiple of 5

			if (number % 5 == 0) {
				System.out.println(number + " is multiple of 5.");
			} else {
				System.out.println(number + " is not multiple of 5.");
			}
		}
	}

	public void verifyIfNumberIsEvenOrOdd() {
		// 2. Ask a number verify if it is even or odd

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			// Prompt the user to enter a number
			System.out.print("Enter a number: ");

			// Read the input number from the user
			int number = scanner.nextInt();

			// Check if the number is even or odd

			if (number % 2 == 0) {
				System.out.println(number + " is even.");
			} else {
				System.out.println(number + " is odd.");
			}
		}
	}

	public void verifyIAgeIsGreaterThan18() {
		// 3. Ask the user age and verify if he/she is older than 18

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			// Prompt the user to enter his/her age
			System.out.print("Enter your age: ");

			// Read the input number from the user
			int age = scanner.nextInt();

			// Check if the user is an adult
			if (age > 17) {
				System.out.println("You are an adult.");
			} else {
				System.out.println("Your are a child");
			}
		}
	}

	public void verifyGrade() {
		// 4. Ask the grade and verify whether the student has passed or failed

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the grade
		System.out.print("Enter your grade: ");

		// Read the input number from the user
		int grade = scanner.nextInt();

		// Check if the grade is equal or greater than 6
		if (grade >= 6) {
			System.out.println("You passed");
		} else {
			System.out.println("You failed");
		}
//
//		// Close the Scanner object to prevent resource leak
//		scanner.close();
	}

	public void verifyMedia() {
		// 5. Ask three grades and verify the average with these conditions

		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		// Prompt the user the grades
		System.out.print("Enter the first grade: ");
		double grade1 = scanner.nextDouble();

		System.out.print("Enter the second grade: ");
		double grade2 = scanner.nextDouble();

		System.out.print("Enter the third grade: ");
		double grade3 = scanner.nextDouble();

		double average = (grade1 + grade2 + grade3) / 3;
		double roundedNumber = Math.round(average * Math.pow(10, 2)) / Math.pow(10, 2);
		//double roundedNumber = Math.round(average);

			
		if (roundedNumber > 8) {
			System.out.println(roundedNumber + " CONCEPT A");
		} else if (roundedNumber > 7) {
			System.out.println(roundedNumber + " CONCEPT B");
		} else if (average > 5) {
			System.out.print(roundedNumber + " CONCEPT C");
		} else {
			System.out.print(roundedNumber + " Not enough");
		}

		// Close the Scanner object to prevent resource leak
		scanner.close();
	}
}