public class array {
    public static void main(String[] args) {
//        String[] classGroup = {"hwang", "chang", "hwan"};
//        System.out.println(classGroup[0]);
//        System.out.println(classGroup[1]);
//        System.out.println(classGroup[2]);

        String[] classGroup = new String[3];
        System.out.println(classGroup.length);
        classGroup[0] = "hwang";
        System.out.println(classGroup.length);
        classGroup[1] = "chang";
        System.out.println(classGroup.length);
        classGroup[2] = "hwan";
        System.out.println(classGroup.length);

        for (int i=0; i<classGroup.length; i++){
            System.out.println(classGroup[i]);
        }
        System.out.println("----------------------");
        for (String e : classGroup){  //for-each문
            System.out.println(e);
        }
    }
}
