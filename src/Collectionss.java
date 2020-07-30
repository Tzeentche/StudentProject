import java.util.*;

public class Collectionss {

    public static void main(String[] args) {

        int[] array = new int[15];

        List collection1 = new ArrayList<>();
        Set collection2 = new HashSet<>();
        for(int i = 0; i < collection1.size(); i++) {
            System.out.println(collection1.get(i));
        }

        Queue collection3 = new PriorityQueue();
        collection3.offer("1");
        collection3.offer("2");
        collection3.offer("3");
        collection3.offer("4");
        Iterator iterator = collection3.iterator();
        for(int i = 0; i < collection3.size(); i++) {
            System.out.println(collection3.poll());
        }

        while(iterator.hasNext()) {
            System.out.println(collection3.poll());

        }

        System.out.println("Num of elements " + collection3.size());

        Collection collection = new ArrayList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.remove("2");

        Iterator iterator2 = collection.iterator();

        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
