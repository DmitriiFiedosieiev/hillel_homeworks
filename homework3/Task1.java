package homework3;

public class Task1 {

    public static void main(String[] args) {

        int[] array = {7, 1, 24, 97, 14, 736, 3, 10, 17, 27, 82, 100, 533, 532};

        for (int i : array) {
            if (i %2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");

        for (int i: array) {
            if (i %2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
