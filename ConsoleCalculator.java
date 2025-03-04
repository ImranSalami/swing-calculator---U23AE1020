import java.util.Scanner;

public class ConsoleCalculator {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
			while (true) {
				System.out.println("Enter first number: ");
				double num1 = scanner.nextDouble();
				
				System.out.println("Enter operator (+, -, *, /): ");
				String operator = scanner.next();
				
				System.out.println("Enter second number: ");
				double num2 = scanner.nextDouble();
				
				double result = 0;
				switch (operator) {
					case "+": result = num1 + num2; break;
					case "-": result = num1 - num2; break;
					case "*": result = num1 * num2; break;
					case "/": 
						if (num2 != 0) result = num1 / num2;
						else {
							System.out.println("Error: Division by zero!");
							continue;
						}
						break;
					default:
						System.out.println("Invalid operator!");
						continue;
				}
				System.out.println("Result: " + result);
				
				System.out.println("Continue? (y/n): ");
				if (scanner.next().toLowerCase().charAt(0) != 'y') break;
			}
			scanner.close();
		}
}