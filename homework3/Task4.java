package homework3;

public class Task4 {

    public static void main(String[] args) {

        int[] array = {49, 12, 482, 10, 95, 7, 55, 76, 110};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Наибольшее: " + max);
        System.out.println("Наименьшее: " + min);
    }
}
