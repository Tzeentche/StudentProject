public class SomeEnums {

    enum CoffeSize {SMALL(100), MEDIUM(200), BIG(300);

        String coffeClass;
        int milliliters;
        CoffeSize(int milliliters) {
            this.milliliters = milliliters;
        }

        int getMilliliters() {
            return milliliters;
        }
        String getCoffeclass() {
            return coffeClass;
        }
        }

    public static void main(String[] args) {
        CoffeSize coffeSize = CoffeSize.BIG;
        System.out.println(coffeSize);
        System.out.println(coffeSize.getMilliliters());
    }
}
