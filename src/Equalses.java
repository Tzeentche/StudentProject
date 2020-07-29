import java.util.HashMap;
import java.util.Map;

public class Equalses {

    int value;

    public static void main(String[] args) throws Exception {

        Equalses equalses = new Equalses();
        equalses.value = 5;
        System.out.println(equalses + "");
        Map<String, Equalses> map = new HashMap<>();

        Ticket ticket = new Ticket();
        ticket.number = 123;

        Book book = new Book();
        book.author = "Carnegy";
        book.name = "How to get friends";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);

        Ticket ticket2 = new Ticket();
        ticket2.number = 123;

        Book carnegyBook = library.get(book.name);
        System.out.println(carnegyBook.author);

        Book someBook = library.get(ticket2);
        System.out.println(someBook.author);

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

class Ticket {
    int number;
    String libraryName;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;
        return number == ticket.number;
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + (libraryName != null ? libraryName.hashCode() : 0);
        return result;
    }
}