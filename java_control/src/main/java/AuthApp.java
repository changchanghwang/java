import java.util.Scanner;

public class AuthApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String id = "hwang";
//        String inputID = sc.next();
//        String pass = "1111";
//        String inputPass = sc.next();
//        System.out.println("Hi");
//        if (inputID.equals(id)&&inputPass.equals(pass)) {
//            System.out.printf("%s님 환영합니다", inputID);
//        }else{
//            System.out.println("잘못입력하셨습니다.");
//        }

//        String[] users = {"hwang", "chang", "hwan"};
        String[][] users = {
                {"hwang", "1111"},
                {"chang","2222"},
                {"hwan", "3333"}
        };
        String inputId = sc.next();
        String inputPass = sc.next();
        boolean isLogined = false;
        for(int i=0; i<users.length; i++){
            String currentId = users[i][0];
            String currentPass = users[i][1];
            if(currentId.equals(inputId)&&currentPass .equals(inputPass)){
                isLogined = true;
                break;
            }
        }
        if(isLogined){
            System.out.println("환영합니다");
        }else{
            System.out.println("다시 확인해주세요");
        }

    }
}
