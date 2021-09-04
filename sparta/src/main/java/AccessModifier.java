import AccessModifier.Modi;

class Child extends Modi{
    void callParentProtected(){
        System.out.println("call parent's protected method");
        super.messageProtected();
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        //private --> default --> protected --> public 점점 범위가 넓어짐
        //private = 같은 클래스 내에서만 접근가능
        //default = 같은 패키지 내에서만 접근가능
        //protected = 같은 패키지 내에서, 다른패키지의 자손클래스에서 접근가능
        //public = 접근제한 x

        Modi modi = new Modi();
        modi.messageOutside();
//        modi.messageInside();
//        modi.messageProtected();
//        modi.messageDefault();
        System.out.println("---------------");
        Child child = new Child();
        child.callParentProtected();
    }
}
