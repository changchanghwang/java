import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "hwang";
        String inputID = sc.next();
        String pass = "1111";
        String inputPass = sc.next();
        System.out.println("Hi");
        if (inputID.equals(id)&&inputPass.equals(pass)) {
            System.out.printf("%s님 환영합니다", inputID);
        }else{
            System.out.println("잘못입력하셨습니다.");
        }
    }
}
