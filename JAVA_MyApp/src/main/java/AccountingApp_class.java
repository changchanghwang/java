import java.util.Scanner;

class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        double[] dividendRates = new double[3];
        dividendRates[0]=0.5;
        dividendRates[1]=0.3;
        dividendRates[2]=0.2;
        for(int i=0; i<dividendRates.length; i++) {
            System.out.printf("Dividend %d : %.1f%n",i+1, getIncome()*dividendRates[i]);
        }
    }

    public double getIncome() {
        return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public double getTotal() {
        return valueOfSupply + getVat();
    }

    public double getVat() {
        return valueOfSupply * vatRate;
    }
}
public class AccountingApp_class {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Accounting.valueOfSupply = sc.nextDouble();
//        Accounting.vatRate = 0.1;
//        Accounting.expenseRate = 0.3;
//        Accounting.print();
//
        Accounting a1 = new Accounting();
        Scanner sc = new Scanner(System.in);
        a1.valueOfSupply = sc.nextDouble();
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
        System.out.println("----------");
        Accounting a2 = new Accounting();
        a2.valueOfSupply = a1.valueOfSupply *2;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();

    }
}
