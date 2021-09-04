package AccessModifier;
//private --> default --> protected --> public 점점 범위가 넓어짐
//private = 같은 클래스 내에서만 접근가능
//default = 같은 패키지 내에서만 접근가능
//protected = 같은 패키지 내에서, 다른패키지의 자손클래스에서 접근가능
//public = 접근제한 x

public class Modi {
    public static void main(String[] args) {

    }
    private void messageInside(){

        System.out.println("private");
    }
    public void messageOutside(){
        System.out.println("public");
        messageInside();
    }

    protected void messageProtected(){
        System.out.println("protected");
    }
    void messageDefault(){
        System.out.println("default");
    }
}
