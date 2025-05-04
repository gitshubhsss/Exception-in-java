class A {
    public void show() throws ClassNotFoundException {

        Class.forName("Java exception class");

    }
}

public class Navin {

    static {
        System.out.println("class loaded in the memory");
    }

    public static void main(String[] args) {

        A a = new A();
        try {
            a.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
