import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectionss {

    public static void main(String[] args) {

        int[] array = new int[15];
        Collection collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");

        Iterator iterator = collection.iterator();

        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
