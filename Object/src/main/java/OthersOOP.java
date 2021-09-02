import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {
        // class : System, Math, FileWriter
        // instance : f1, f2

        System.out.println(Math.PI);
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello ");
        f1.write("Java");

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello ");
        f2.write("JavaOOP");


        f1.write("^^");
        f1.close();
        f2.close();
    }
}
