public class switchPrac {
    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default"); //1,2,3이 아니라면 default값이 출력됨
        }
    }
}
