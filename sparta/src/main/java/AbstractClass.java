abstract class Bird{
    private int x,y,z;

    void fly(int x, int y, int z){
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if(flyable(z)) {
            this.z = z;
        }else{
            System.out.println("그 높이로는 날 수 없습니다.");
        }
        printLocation();
    }

    abstract boolean flyable(int z);

    public void printLocation(){
        System.out.println("현재 위치 {" +x+ ", " +y + ", "+ z + ")");
    }
}

class pigeon extends Bird{

    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class peacock extends Bird {

    @Override
    boolean flyable(int z) {
        return false;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bird pigeon = new pigeon();
        Bird peacock = new peacock();

        System.out.println("비둘기");
        pigeon.fly(1,1,2);
        System.out.println("공작새");
        peacock.fly(1,1,3);
        pigeon.fly(2,3,10000);
    }
}
