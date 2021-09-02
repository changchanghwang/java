import java.util.Scanner;

public class AccountingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valueOfSupply = sc.nextDouble();
        double expenseRate = 0.3;
        double vatRate = 0.1;
        double VAT = valueOfSupply * vatRate;
        double Total = valueOfSupply + VAT;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = (income) * 0.5;
        double dividend2 = (income) * 0.3;
        double dividend3 = (income) * 0.2;

        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : " + VAT);
        System.out.println("Total : " + Total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);
        System.out.println("Dividend : "+ dividend1);
        System.out.println("Dividend : "+ dividend2);
        System.out.println("Dividend : "+ dividend3);
    }
}
