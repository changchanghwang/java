import java.util.Scanner;

public class AccountingApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valueOfSupply = sc.nextDouble();
        double expenseRate = 0.3;
        double vatRate = 0.1;
        double VAT = valueOfSupply * vatRate;
        double Total = valueOfSupply + VAT;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double[] dividendRates = new double[3];
        dividendRates[0]=0.5;
        dividendRates[1]=0.3;
        dividendRates[2]=0.2;
        double dividend1 = (income) * dividendRates[0];
        double dividend2 = (income) * dividendRates[1];
        double dividend3 = (income) * dividendRates[2];

        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : " + VAT);
        System.out.println("Total : " + Total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);

        for(double dividend : dividendRates) {
            System.out.println("Dividend : " + income*dividend);
        }
    }
}
