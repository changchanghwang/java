class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod() {
        System.out.println(classVar);
//        System.out.println(instanceVar); // 에러
    }
    public void instanceMethod(){
        System.out.println(classVar);
        System.out.println(instanceVar);
    }
}

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar);
//        System.out.println(Foo.instanceVar); //에러
        Foo.classMethod();
//        Foo.instanceMethod(); //에러

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.instanceVar);
        System.out.println(f1.classVar);
        f1.instanceMethod();
        f1.classMethod();

        f1.classVar = "I classVar Changed by f1"; //클래스에서 바뀌어버림
        System.out.println(f1.classVar);
        System.out.println(Foo.classVar);

        f1.instanceVar = "I f1"; //인스턴스에서만 바뀜
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);
    }
}
