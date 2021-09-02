public class OutputMethod {
    public static String a(){
        return "a";
    }
    public static int one(){ //static은 클래스의 메소드, static이 없으면 인스턴스의 메소드.
        return 1;
    }
    public static void main(String[] args) { //void는 return값이 없을때.
        System.out.println(a());
        System.out.println(one());
    }
}
