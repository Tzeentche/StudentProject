import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p){
            return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person(" + " age " + age + ")";
    }
}

class ComparePerson implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}


public class Sortings {

    public static void main(String[] args) {

        Set set = new TreeSet<>(new ComparePerson());
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("1");
        set.add(3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
