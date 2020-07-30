import java.util.*;

public class Collectionss {

    public static void main(String[] args) {

        int[] array = new int[15];

        List collection1 = new ArrayList<>();
        Set collection2 = new HashSet<>();
        for(int i = 0; i < collection1.size(); i++) {
            System.out.println(collection1.get(i));
        }

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
