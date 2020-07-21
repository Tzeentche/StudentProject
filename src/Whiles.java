public class Whiles {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = 0;
        while(i < arr.length) {
            System.out.println(i);
            i++;

        } do {
            System.out.println(arr[i]);
            i++;
        } while (i < arr.length);
    }
}
