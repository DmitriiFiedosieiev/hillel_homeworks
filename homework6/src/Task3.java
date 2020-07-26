package homework6;

public class Task3 {

    public static void main(String[] args) {

        int n = 1234;

        System.out.println(recurs(n));
    }

    private static int recurs(int i) {
        if (i == i % 10)
            return i;
        else
            return i % 10 + recurs(i / 10);
    }
}
