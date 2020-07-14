public class Methods {
    static int i = 5;
    static void method(int i, float f, boolean b, Object o, int... j) {
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(o);

        for(int k : j) {
            System.out.println(k);
        }
    }
}

class otherExample extends Methods {

    public static void main(String[] args) {
        Methods.method(5, 4.32464f, true, new Object(), 5, 46, 35, 36, 46, 534, 35, 63, 456, 53, 47,34);
    }
}
