package questionnaire;

public class Calculator {
	
	public void Calculate(double total_amount, double no_of_payments) {
		
		double regular_amount = Math.round((total_amount / no_of_payments) * 100) / 100.0;
		 
		double remainder = regular_amount + (total_amount - (regular_amount * no_of_payments));
		
		String str_last_amount = String.format("%.2f", remainder);
		double last_amount = Double.parseDouble(str_last_amount);
		
		System.out.println("Regular Amount: £" + regular_amount);
		if (regular_amount != last_amount)
			System.out.println("Last Amount: £" + last_amount);	
	}

}
