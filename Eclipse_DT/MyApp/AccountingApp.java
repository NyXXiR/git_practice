
public class AccountingApp {
	public static void main(String[] args) {
	
	//공급가액
	double ValueOfSupply = Double.parseDouble(args[0]);
	//부가가치세율
	double vatRate = 0.1;
	double expenseRate = 0.3;
	double vat = ValueOfSupply*vatRate;
	double total = ValueOfSupply + vat;
	double expense = ValueOfSupply * expenseRate;
	double income = ValueOfSupply - expense;
	
	double divided1= income * 0.5;
	double divided2= income * 0.3;
	double divided3= income * 0.2;
	
	
	
	
	
	
	System.out.println("Value of Supply : " + ValueOfSupply);
	System.out.println("VAT : " + (vat));
	System.out.println("Total : " + (total));
	System.out.println("Expense : " +(expense));
	System.out.println("Income : " + (income));
	System.out.println("Divided1 :" + (divided1));
	System.out.println("Divided2 :" + (divided2));
	System.out.println("Divided3 :" + (divided3));
	
	
	}
}
