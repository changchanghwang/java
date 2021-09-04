class Calculation{
    public int add(int x, int y){
        return x+y;
    }
    public int substract(int x, int y){
        return x-y;
    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here
        Calculation cal = new Calculation();
        System.out.println(cal.add(2,1));
        System.out.println(cal.substract(2,1));
    }
}