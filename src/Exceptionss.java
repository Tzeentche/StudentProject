public class Exceptionss {

    public static void main(String[] args) {
        new Exceptionss().someMethod();
    }

    void someMethod() {
        try {
            Object o = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
