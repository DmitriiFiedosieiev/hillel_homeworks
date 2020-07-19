package homework3;

public class Task3 {

    public static void main(String[] args) {

        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;

        for (int a: array) {
            for (int i = 2; i < array.length; i++) {
                array[i] = (array[i - 1] + array[i - 2]);
            }
            System.out.println(a);
        }

    }
}
