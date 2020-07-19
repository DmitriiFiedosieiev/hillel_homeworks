package homework3;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {23, 218, 1, 5, 2, 18, 17, 25, 7, 200, 29, 4, 11, 157, 81};

        for (int i: array) {
            int count = 0;
            for (int j = 2; j <= i - 1; j++ ) {
                if (i % j == 0) {
                    count = ++count;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
