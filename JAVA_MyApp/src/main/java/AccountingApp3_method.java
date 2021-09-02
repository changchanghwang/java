import java.util.Scanner;

public class AccountingApp3_method {
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        valueOfSupply = sc.nextDouble();
        vatRate = 0.1;
        expenseRate = 0.3;
        print();
        divPrint();

    }

    private static void divPrint() {
        double[] dividendRates = new double[3];
        dividendRates[0]=0.5;
        dividendRates[1]=0.3;
        dividendRates[2]=0.2;


        for(int i=0; i<dividendRates.length; i++) {
            System.out.printf("Dividend %d : %.1f%n",i+1, getIncome()*dividendRates[i]);
        }
    }

    private static void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    public static double getVat() {
        return valueOfSupply * vatRate;
    }
}
