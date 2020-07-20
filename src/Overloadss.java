public class Overloadss {

    public static void main(String[] args) {

        Overloadss overloadss = new Overloadss();
        byte b = 5;
        overloadss.method(b);
    }

    void method(int i) {
        System.out.println("Int");
    }

    void method(long i) {
        System.out.println("Long");
    }

    void method(Integer i) {
        System.out.println("Integer");
    }

    void method(double i) {
        System.out.println("double");
    }

    void method(short... i) {
        System.out.println("byte...");
    }

    void method(Short i) {
        System.out.println("Short");
    }

    void method(Object i) {
        System.out.println("Object");
    }

    void method(Object... i) {
        System.out.println("Object...");
    }
}
