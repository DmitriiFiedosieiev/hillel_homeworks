public class Task3 {
	
    private static int[] array;

    public static void main(String[] args) {

        initVars();
        showArrayColumn();
        showArrayLine();
    }

    private static void initVars() {
        array = new int[] {1, 2, 3, 4, 5, 6, 7};
    }

    private static void showArrayLine() {
        for (int x: array) {
            System.out.print(x + " ");
        }
    }

    private static void showArrayColumn() {
        for (int x: array) {
            System.out.println(x);
        }
    }
}