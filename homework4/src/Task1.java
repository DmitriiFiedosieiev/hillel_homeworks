package homework4;

public class Task1 {

    public static void main(String[] args) {

        int[] arrayOne = {1, 4, 7, 9, 15, 8, 0, 120, 18};
        int[] arrayTwo = {7, 9, 15, 8};


        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length - 1; j++) {
                if (arrayOne[i] == arrayTwo[j] && arrayOne[i + 1] == arrayTwo[j + 1]) {
                    System.out.println("Является");
                    break;
                }
                if (arrayOne[i] == arrayTwo[j] && arrayOne[i + 1] != arrayTwo[j + 1]) {
                    System.out.println("не является");
                }
            }
        }
    }
}
