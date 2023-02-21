import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Dividend: ");
			int dividend = scanner.nextInt();

			System.out.print("Divisor: ");
			int divisor = scanner.nextInt();
			int quotient = 0;
			try {
				quotient = (dividend / divisor);
			} catch (ArithmeticException e){
				System.out.println("Cannot divide by 0");
			}
				System.out.println("Quotient: " + quotient);
			}
		}
	}

