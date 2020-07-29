import java.util.HashMap;
import java.util.Map;

public class Equalses {

    int value;

    public static void main(String[] args) {

        Equalses equalses = new Equalses();
        equalses.value = 5;
        System.out.println(equalses + "");

        Map<String, Equalses> map = new HashMap<>();

        Book book = new Book();
        book.author = "Carnegy";
        book.name = "How to get friends";
        Map<String, Book> library = new HashMap<>();

        library.put(book.name, book);

        Book carnegyBook = library.get(book.name);
        System.out.println(carnegyBook.author);

        System.out.println(book.hashCode());
        System.out.println(new Book().hashCode());
    }

    @Override
    public String toString() {
        return value + "value";
    }
}

class Book {
    String author;
    String name;
}
