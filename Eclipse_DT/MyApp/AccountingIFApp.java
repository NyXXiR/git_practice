
public class AccountingIFApp {
	public static void main(String[] args) {
		
	double ValueOfSupply = Double.parseDouble(args[0]);
	double vatRate = 0.1;
	double expenseRate = 0.3;
	
	double vat = ValueOfSupply*vatRate;
	double total = ValueOfSupply + vat;
	double expense = ValueOfSupply * expenseRate;
	double income = ValueOfSupply - expense;
	
	double[] dividedRates= new double[3];
	 dividedRates[0] = 0.5;
	 dividedRates[1] = 0.3;
	 dividedRates[2] = 0.2;

	if (income > 10000.0)
	{
		dividedRates[0] = income * 0.5;
	dividedRates[1] = income * 0.3;
	dividedRates[2] = income*0.2;
	} else {
		dividedRates[0] = income * 1.0;
		dividedRates[1] = income * 0.0;
		dividedRates[2] = income * 0.0;
		
	}
	
	
	
	
	
	
	
	System.out.println("Value of Supply : " + ValueOfSupply);
	System.out.println("VAT : " + (vat));
	System.out.println("Total : " + (total));
	System.out.println("Expense : " +(expense));
	System.out.println("Income : " + (income));
	System.out.println("Divided1 :" + (dividedRates[0]));
	System.out.println("Divided2 :" + (dividedRates[1]));
	System.out.println("Divided3 :" + (dividedRates[2]));
	
	
	}
}
