class Human{
    int x,y;
    String name;
    int age;
    int speed;
    public void info(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        GetInfo();
    }
    public void walk(int x, int y){
        System.out.println("걷습니다.");
        this.x = x;
        this.y = y;
        GetInfo();
    }

    public void GetInfo() {
        System.out.println("현재위치 : " + "(" + x + ", " + y + ")");
        System.out.println("현재속도 : "+speed);
    }
}

class Children extends Human{
    int speed = 5;
    public void run(int x,int y){
        System.out.println("뜁니다.");
        this.x =x;
        this.y =y;
        speed += 2;
        GetInfo();
    }
    public void swim(int x,int y){
        System.out.println("수영합니다.");
        this.x =x;
        this.y = y;
        speed += 1;
        GetInfo();
    }
    public void GetInfo() {
        System.out.println("현재위치 : " + "(" + x + ", " + y + ")");
        System.out.println("현재속도 : "+speed);
    }
}
class Parents extends Human{
    int speed = 3;
    public void run(int x, int y){
        System.out.println("걷습니다.");
        this.x = x;
        this.y = y;
        speed += 2;
    }
    public void GetInfo() {
        System.out.println("현재위치 : " + "(" + x + ", " + y + ")");
        System.out.println("현재속도 : "+speed);
    }
}
class GrandParents extends Human{
    int speed = 1;
    public void GetInfo() {
        System.out.println("현재위치 : " + "(" + x + ", " + y + ")");
        System.out.println("현재속도 : "+speed);
    }
}



public class HomeWork {
    public static void main(String[] args) {
        GrandParents g = new GrandParents();
        Parents p = new Parents();
        Children c = new Children();

        g.info("GP", 70);
        System.out.println("--------");
        p.info("P", 40);
        System.out.println("--------");
        c.info("C", 10);
        System.out.println("--------");

        g.walk(1,1);
        p.walk(1,1);
        c.walk(1,1);
        p.run(2,2);
        c.run(2,2);
        c.swim(3,-1);
    }
}
