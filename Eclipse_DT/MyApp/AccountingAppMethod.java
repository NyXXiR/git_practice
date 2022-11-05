
public class AccountingAppMethod {
	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;

	public static void main(String[] args) {
		
	valueOfSupply = Double.parseDouble(args[0]);
	vatRate = 0.1;
	expenseRate = 0.3;

	
	
	
	print();
	
	}

	
	
	
	
	
	public static void print() {
		System.out.println("Value of Supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " +getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Divided1 :" + getDivided1());
		System.out.println("Divided2 :" + getDivided2());
		System.out.println("Divided3 :" + getDivided3());
	}

	public static double getDivided3() {
		double divided3= getIncome() * 0.2;
		return divided3;
	}

	public static double getDivided1() {
		double divided1= getIncome() * 0.5;
		return divided1;
	}
	public static double getDivided2() {
			double divided2= getIncome() * 0.3;
			return divided2;		
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply*vatRate;
	}



}
