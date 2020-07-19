package homework4;

public class Task3 {

    public static void main(String[] args) {

        int[] array = {332, 225, 376, 4465, 891, 777, 137};

        for (int i = 0; i < array.length; i++) {
            if (checkNumber(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    public static boolean checkNumber(int number) {
        while (number > 0) {
            int j = number % 10;
            for (int i = number / 10; i > 0; i = i / 10)
                if (i % 10 == j)
                    return false;
            number = number / 10;
        }
        return true;
    }
}
