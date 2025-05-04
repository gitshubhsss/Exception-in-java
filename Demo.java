public class Demo {

    public static void main(String args[]) {

        int a = 0;
        int b = 10;

        int arr[] = new int[5];

        try {
            System.out.println(arr[6]);
            int result = b / a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cannot devide by zero");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit" + e);
        } catch (Exception e) {
            System.out.println("Something wents wrong");
        }

        System.out.println("Byy");
    }
}