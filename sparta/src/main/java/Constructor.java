class Phone {
    String model;
    String color;
    int price;

    public Phone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Phone galaxy = new Phone("galaxy", "black", 100);

        Phone iphone =new Phone("iphone", "black", 200);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}