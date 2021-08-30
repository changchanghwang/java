public class conditional {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if(id.equals("hwang")){
            if(password.equals("chang")){
                System.out.println("right");
        }} else{
            System.out.println("wrong");
        }
    }
}
