class Parente {
    Parente() {
        System.out.println("Parent constructor");
    }
}

public class Initialistions extends Parente {

    static {
        System.out.println("Static init block");
    }
    {
        System.out.println("Init block");
    }
    Initialistions() {
        super();
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Initialistions();

    }
}
