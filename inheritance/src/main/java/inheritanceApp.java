class cal{
    int v1,v2;
    cal(int v1, int v2){
        System.out.println("cal init");
        this.v1 = v1; this.v2 = v2;
    }
    public int sum(){
        return this.v1+v2;
    }
}

class cal3 extends cal{
    cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("cal3 init");
    }
    public int minus(){
        return this.v1-v2;
    }
}

public class inheritanceApp {
    public static void main(String[] args) {
        cal c = new cal(2,1);
        System.out.println(c.sum());
        cal3 c3 = new cal3(2,1);
        System.out.println(c3.sum());
        System.out.println(c3.minus());
    }
}