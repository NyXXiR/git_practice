class Accounting1{ 
	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;


	
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
	
}class Accounting2{ 
	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;


	
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
class Accounting3{ 
	public static double vatRate;
	public static double valueOfSupply;
	public static double expenseRate;


	
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
public class AccountingClassApp {

	public static void main(String[] args) {
		
	Accounting1.valueOfSupply = Double.parseDouble(args[0]);
	Accounting1.vatRate = 0.1;
	Accounting1.expenseRate = 0.3;
	Accounting1.print();
	///...
	///...
	
	Accounting2.valueOfSupply = 20000.0;
	Accounting2.vatRate = 0.05;
	Accounting2.expenseRate = 0.2;
	Accounting2.print();
	///...
	Accounting3.valueOfSupply = 20000.0;
	Accounting3.vatRate = 0.05;
	Accounting3.expenseRate = 0.2;
	Accounting3.print();
	///...
	
	
	
	
	}

	
	
	
	
	}

//https://youtu.be/TOptBzGgJOw
	


