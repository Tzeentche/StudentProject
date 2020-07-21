public class Branches {

    enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {

        int a = 1;
        int b = 6;
        boolean bl = a == b;
        Days days = Days.MONDAY;

        if(bl == true) {

            System.out.println(bl);
        } else {
            System.out.println(a != b);
        }

        switch (days) {
            case MONDAY:
                System.out.println("1");
            case TUESDAY:
                System.out.println("2");
            case WEDNESDAY:
                System.out.println("3");
            case THURSDAY:
                System.out.println("4");
            case FRIDAY:
                System.out.println("5");
            case SATURDAY:
                System.out.println("6");
            case SUNDAY:
                System.out.println("7");
                break;
            default:
                System.out.println("Default");
                break;
        }

        switch (b) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
