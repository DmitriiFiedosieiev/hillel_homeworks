package homework4;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {9, 15, 1298, 34, 97268, 142, 1234};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (Math.log10(array[i]) > Math.log10(max)) {
                max = array[i];
            }
            if (Math.log10(array[i]) < Math.log10(min)) {
                min = array[i];
            }

        }

        int maxLength = (int) Math.log10(max) + 1;
        int minLength = (int) Math.log10(min) + 1;

        System.out.println("Самое длинное: " + max + " Длинна: " + maxLength);
        System.out.println("Самое короткое: " + min + " Длинна: " + minLength);
    }
}
