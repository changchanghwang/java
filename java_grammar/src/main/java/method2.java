public class method2 {
    public static String[] getMembers(){
        String[] members = {"hwang", "chang", "hwan"};
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(members[0]);
    }
}
