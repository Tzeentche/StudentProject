import java.io.*;
import java.util.*;

class Parents {

}

class Childs extends Parents {

}

public class Genericss <T extends Genericss & Comparable & Serializable> {

    public static void main(String[] args) throws Exception {

        List<File> list = new ArrayList<>();

        Genericss genericss = new Genericss();
        genericss.method(list);
        
        List list2 = new ArrayList();
        list.add(new File(""));

        for(File file : list) {
            System.out.println(file.getAbsoluteFile());
        }
    }

    void method(List list) {
        list.add(new Genericss());
    }
}

class MyClass {

        Object t;

        Object method(Object t) {
        return t;
        }
}
