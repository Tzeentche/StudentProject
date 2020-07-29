import java.util.HashMap;
import java.util.Map;

public class Equalses {

    int value;

    public static void main(String[] args) {

        Equalses equalses = new Equalses();
        equalses.value = 5;
        System.out.println(equalses + "");

        Map<String, Equalses> map = new HashMap<>();
        
    }

    @Override
    public String toString() {
        return value + "value";
    }
}

class Book {
    String author;
}
