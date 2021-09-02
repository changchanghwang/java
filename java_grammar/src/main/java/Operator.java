public class Operator {
    public static void main(String[] args) {
        // + - * / %
        int result = 1 + 2;
        System.out.println(result);

        result -= 1;
        System.out.println(result);

        result *= 2;
        System.out.println(result);

        result /= 2;
        System.out.println(result);

        result += 8;
        result %= 7;
        System.out.println(result);

        String first = "This is ";
        String second = "HwnagChangHwan";
        String third = first + second;
        System.out.println(third);

        int a = 10;
        float b = 3.0F;

        System.out.println(a/b);
        System.out.println(++a);
        System.out.println(a++); //sout이 끝나고 +가됨
        System.out.println(a);
    }
}
