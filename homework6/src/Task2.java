package homework6;

public class Task2 {

    public static void main(String[] args) {

        int n = 5;

        recurs(n);
    }

    private static void recurs(int i) {
        if (i == 0) {
            return;
        }
        recurs(i - 1);
        System.out.print(i + " ");
    }
}
