import java.io.*;
import java.util.*;

class Parents {
    void method() {
        System.out.println("b");
    }
}

class Childs extends Parents {

}

class Sons extends Childs {

    void method() {
        System.out.println("Son");
    }
}
public class Genericss <T extends Genericss & Comparable & Serializable> {

    public static void main(String[] args) throws Exception {

        List<Parents> list = new ArrayList<>();
        list.add(new Parents());
        Genericss genericss = new Genericss();
        genericss.method(list);
    }

    void method(List<? super Childs> list) {
        list.add(new Sons());

        for(Object o : list) {
            Parents p = (Parents)o;
            p.method();
            
        }
    }
}