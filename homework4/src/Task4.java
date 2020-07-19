package homework4;

public class Task4 {

    public static void main(String[] args) {

        final int N = 5;

        int[][] array = new int[N][N];

        int k = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array [i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
