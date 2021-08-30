public class loop {
    public static void main(String[] args) {
        //while문
//        while (조건. 언제까지?){
//            반복실행영역
//        }
        int a =0;
        while (a<10){
            System.out.println(a);
            a++;
        }
        System.out.println("-----------------");
        //for문
        for(int i=0; i<20; i+=2){
            System.out.println(i);
            if (i == 10)
                break;
            System.out.println("hello");
        }
        System.out.println("-----------------");
        //반복문 중첩
        for (int i=0; i<10; i++){
            for(int j =0; j<10; j++){
                System.out.println(i+""+j);
            }
        }
    }
}
