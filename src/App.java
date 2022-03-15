import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws IOException {
		File file = new File("results.txt");
		PrintWriter pw = new PrintWriter(file);
		BufferedReader br = new BufferedReader(new FileReader("results.txt"));

		// Poor mans banner
		System.out.println("-------BASIC CALCULATOR------- ");

		// creates an object of Scanner
		Scanner input = new Scanner(System.in);
		char choice = 'y';

		/*
		 * System.out.print("Enter first number: ");
		 * 
		 * // takes 1st number int firstNumber = input.nextInt();
		 * 
		 * // prints the name System.out.println("Enter second number: ");
		 * 
		 * // takes 2st number int secondNumber = input.nextInt();
		 * 
		 * // operation add only int sum = firstNumber + secondNumber;
		 * 
		 * System.out.printf("Sum of %d and %d = %d", firstNumber, secondNumber, sum);
		 */
		while (choice == 'y') {
			System.out.println("1.Operations\n2.View\n3.Exit");
			System.out.print("\nEnter your choice:");
			int opt = input.nextInt();

			if (opt == 1) {
				System.out.print("OPERATIONS\n\n*:Multiplication\n/:Division\n+:Addition\n-:Subtraction");
				System.out.print("\nEnter your choice:");
				char ch = input.next().charAt(0);
				System.out.print("Enter first number:");
				int firstNumber = input.nextInt();
				System.out.print("Enter second number:");
				int secondNumber = input.nextInt();

				switch (ch) {
				case '*':
					int p = firstNumber * secondNumber;
					// System.out.print("Product=" + p);
					pw.print(ch);
					pw.print(',');
					pw.print(firstNumber);
					pw.print(',');
					pw.print(secondNumber);
					pw.print(',');
					pw.print(p);
					pw.println();
					break;
				case '/':
					p = firstNumber / secondNumber;
					// System.out.print("Quotient=" + p);
					pw.print(ch);
					pw.print(',');
					pw.print(firstNumber);
					pw.print(',');
					pw.print(secondNumber);
					pw.print(',');
					pw.print(p);
					pw.println();
					break;
				case '+':
					p = firstNumber + secondNumber;
					// System.out.print("Sum=" + p);
					pw.print(ch);
					pw.print(',');
					pw.print(firstNumber);
					pw.print(',');
					pw.print(secondNumber);
					pw.print(',');
					pw.print(p);
					pw.println();
					break;
				case '-':
					p = firstNumber - secondNumber;
					// System.out.print("Difference=" + p);
					pw.print(ch);
					pw.print(',');
					pw.print(firstNumber);
					pw.print(',');
					pw.print(secondNumber);
					pw.print(',');
					pw.print(p);
					pw.println();
					break;
				default:
					System.out.print("Invalid Entry");
					break;

				}
			}
			if (opt == 2) {
				pw.close();
				String str = br.readLine();
				while (str != null) {
					System.out.println(str);
					str = br.readLine();
				}
			}
			if (opt == 3) {
				break;
			}
			System.out.print("\nDo you want to continue(y/n)=");
			choice = input.next().charAt(0);

		}

		// closes the scanner
		input.close();

		br.close();

	}
}
