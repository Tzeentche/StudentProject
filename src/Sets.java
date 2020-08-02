import java.io.ObjectInputStream;
import java.util.*;

public class Sets {

    public static void main(String[] args) {

        Set set2 = new HashSet();
        Set set = new LinkedHashSet();
        Set set3 = new TreeSet();

        set.add("6");
        set.add("2");
        set.add("3");
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("1");

        for(Object o : set) {
            System.out.println(o);
        }
    }
}
