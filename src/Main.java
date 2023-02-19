import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Dividend: ");
			int dividend = scanner.nextInt();

			System.out.print("Divisor: ");
			int divisor = scanner.nextInt();

			if (divisor == 0) {
				throw new ArithmeticException("Cannot divide by 0");
			} else {
				int quotient = (dividend / divisor);
				System.out.println("Quotient: " + quotient);
			}
		}
	}
}
