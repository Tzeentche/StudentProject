public class Statics {

    static int i = 5;
    int j;

    static {
        System.out.println("Static initializer");
    }
    {
        System.out.println("Initializer");
    }

    Statics() {
        System.out.println("Constructor");
    }

    static void staticMethod() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        Statics statics = new Statics();
        Statics statics2 = new Statics();
        statics.j = 1;
        statics2.j = 2;
        System.out.println(statics.j);
        System.out.println(statics2.j);
    }
}
