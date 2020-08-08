public class Inners {

    private int i = 5;
    Inner inner = new Inner();

    public static void main(String[] args) {
        Inners inners = new Inners();
        inners.method();

        Inner inner = inners.new Inner();
        inner.method2();

    }

    void method() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
    }

    class Inner {
        private int k = 6;
        void method2() {
            System.out.println(i);
        }
    }
}

class Second {

    void method() {
        Inners.Inner inner = new Inners().new Inner();
        inner.method2();
    }
}
