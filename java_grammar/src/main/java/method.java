import java.io.BufferedWriter;

public class method {
    public static String numbering(int init, int limit){
        String output ="";
        for(int i=init; i<limit; i++){
            output += i;
        }
        return output;
    }

    public static void main(String[] args) {
        String result = numbering(1,5);
        System.out.println(result);
    }
}
