import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.println(bf.readLine());
        bf.close();
    }
}
