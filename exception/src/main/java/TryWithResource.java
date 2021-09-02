import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        //try with resource statements
        try(FileWriter f = new FileWriter("data.txt")){ //try의 괄호 안에 close가 필요한 인스턴스를 집어넣음.
            f.write("Hello");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
