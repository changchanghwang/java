public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println(1);
        int[] scores = {10, 20, 30};

        try {
            System.out.println(2);
            System.out.println(2 / 0); //이 밑은 실행 자체가 안됨
            System.out.println(4);
            System.out.println(scores[3]);
            System.out.println(5);
        }catch(ArithmeticException e){
            System.out.println("계산이 잘못되었습니다"+e.getMessage()); //우선순위가 더 높음.
            e.printStackTrace();
        }catch(Exception e){ //오류타입
            System.out.println("오류가 발생했습니다.");
        }
        System.out.println(3);


    }
}
