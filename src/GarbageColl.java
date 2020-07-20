import java.util.Date;

public class GarbageColl {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory before " + runtime.totalMemory());
        System.out.println("Free memory before " + runtime.freeMemory());

        for (int i = 0; i < 1_000_000; i++) {
            Date date = new Date();
            date = null;
        }

        System.out.println("Total memory after " + runtime.totalMemory());
        System.out.println("Free memory after " + runtime.freeMemory());
        System.gc();
        System.out.println("Total memory after gc " + runtime.totalMemory());
        System.out.println("Free memory after gc " + runtime.freeMemory());
    }
}
