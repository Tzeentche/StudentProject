import java.util.List;
import java.util.ArrayList;

public class Wrapperss {

    public static void main(String[] args) {

        Integer i = new Integer(5);
        Integer j = new Integer("6");
        int k = Integer.parseInt("2");
        int q = i.valueOf("3");
        short s = i.shortValue();

        System.out.println(i + " " + j + " " + k + " " + q + " " + s);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int ku : list) {
            System.out.println(ku);
        }

        String str = "string";
        String str2 = "string2";
        Object o1 = new Object();
        Object o2 = new Object();

        if(o1.equals(o2)) {
            System.out.println("equals");
        }
    }
}
