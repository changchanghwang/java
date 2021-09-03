public class print {
    public String delimiter = "";
    public print(String delimiter){ //클래스와 동일한 method = constract method
        this.delimiter = delimiter;
    }
    public void A(){
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B(){
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
