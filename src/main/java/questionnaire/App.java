package questionnaire;

import java.util.Scanner;

public class App extends Calculator {

	public static void main(String[] args) {
		App app = new App();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Total amount: ");
		double total_amount = scanner.nextDouble();
		System.out.print("No of payments: ");
		double no_of_payments = scanner.nextDouble();
		
		app.Calculate(total_amount, no_of_payments);

	}

}
