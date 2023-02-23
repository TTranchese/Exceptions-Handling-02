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
				throw new ArithmeticException();
			}
				System.out.println("Quotient: " + quotient);
			}
		}
	}

