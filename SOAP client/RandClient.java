import client.FinanceService;
import client.FinanceServiceSoap;

import java.util.List;

public class RandClient {
    public static void main(String[ ] args) {
	// setup
	FinanceService service = new FinanceService();
	FinanceServiceSoap port = service.getFinanceServiceSoap();
	
	
	
	System.out.println("Enter amount: ");
	String aAmount = System.console().readLine();
	
	System.out.println("Enter interest: ");
	String aInterest = System.console().readLine();
	
	System.out.println("Enter months: ");
	String aMonths = System.console().readLine();
	
	double amount = Double.parseDouble(aAmount);
	double interest = Double.parseDouble(aInterest);
	double months =  Double.parseDouble(aMonths);
	
	double loan = port.loanMonthlyPayment(amount,interest,months);
	
		
	System.out.println("Your monthly payment will be " + loan); 
	
	
	
	
}
}