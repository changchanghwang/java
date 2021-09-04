class Animal{
    String name;
    String color;

    public Animal(String name) {
        this.name = name;
    }

    public void cry(){
        System.out.println(name + " is crying");
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void cry(){
        System.out.println(name + " is barking");
    }

    public void swim(){
        System.out.println(name + " is swimming.");
    }
}
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
}


public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("몽구");
        dog.cry();
        dog.swim();

        Animal dog2 = new Dog("짱아");
        dog2.cry();
//        dog2.swim;  //에러
    }
}
