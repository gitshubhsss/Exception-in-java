class Shubham extends Exception {

    public Shubham(String s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        int res = a / b;

        try {
            if (a < b) {
                throw new Shubham("a should be greater that or equal to b");
            }
        } catch (Exception e) {
            System.out.println(e + "sdflaskdjflaskdfjalskdfjalsfjasdl;fkja'of");
        }

        System.out.println(res);
    }
}
