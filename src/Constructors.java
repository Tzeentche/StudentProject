public class Constructors {

    int i;

    Constructors(String hello, int i) {
        this.i = i;
        System.out.println("Ron");
        System.out.println(hello);
    }

    Constructors() {
        this.i = i;
        System.out.println("Run");
    }
}

class Run {
    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        System.out.println(constructors.i);
    }
}
