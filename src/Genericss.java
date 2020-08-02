import java.io.*;
import java.util.*;

class Cars extends Genericss implements Comparable, Serializable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Genericss <T extends Genericss & Comparable & Serializable> {

    T var;

    public static void main(String[] args) throws Exception {

        Genericss<Cars> genericss = new Genericss<>();
        genericss.var = new Cars();
        System.out.println(genericss.var);;
    }

    T method(T type) {
        type.someMethos();
        return type;
    }

    void someMethos() {
        System.out.println("Bla!");
    }
}
