import java.io.IOException;

public class Overloads {

    int addTwoDigits(int a, int b) throws IOException {
        return a+b;
    }

    double addTwoDigits(double a, double b) throws RuntimeException {
        return a + b;
    }

    public static void main(String[] args) throws Exception {

        Overloads overloads = new Overloads();
        System.out.println(overloads.addTwoDigits(5, 6));
        System.out.println(overloads.addTwoDigits(5.4, 3.0));
        System.out.println(overloads.addTwoDigits(3, 1));
    }
}

class OverloadChild extends Overloads {

    void addTwoDigit(int i) {
        System.out.println("Overload method");
    }
}