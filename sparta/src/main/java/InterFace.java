interface Flyable {
    void fly(int x, int y, int z);
}

class Pigeon implements Flyable {
    int x,y,z;
    public void fly(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    public void printLocation(){
        System.out.println("현재 위치 {" +x+ ", " +y + ", "+ z + ")");
    }
}


public class InterFace {
    public static void main(String[] args) {
        Pigeon p = new Pigeon();
        p.fly(1,2,3);
    }
}
