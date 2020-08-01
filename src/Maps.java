import java.util.*;

public class Maps {

    public static void main(String[] args) {

        Map map = new HashMap();
        Map map2 = new Hashtable();
        Map map3 = new LinkedHashMap();
        Map map4 = new TreeMap();

        map.put("1", "One");
        map.put("3", "Three");
        map.put("2", "two");

        System.out.println(map.get(3));
    }
}
