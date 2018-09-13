import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        changeArrayElements();
    }

    public static void changeArrayElements() {
        int[] array = new int[20];
        int x, min, max, operation;
        min = 1;
        max = 10;
        int[] randomOperations = {0, 1};
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            operation = randomOperations[rand.nextInt(2)];
            x = rand.nextInt((max - min) + 1) + min;
            if (x != 0) {
                if (operation == 0) x = Integer.parseInt("-" + x);
            }
            array[i] = x;
        }
        System.out.println("Сформированный из случайных чисел массив:\n" + Arrays.toString(array));

        int minValue = 10;
        int minPosition = 0;
        int maxValue = -10;
        int maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minPosition = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxPosition = i;
            }
        }
        System.out.println(String.format("Минимальное значение массива - '%s' \nМаксимальное значение массива - '%s'", minValue, maxValue));
        System.out.println();
        System.out.println("Меняем местами минимальное и максимальное значения:");
        array[minPosition] = maxValue;
        array[maxPosition] = minValue;

        System.out.println(Arrays.toString(array));
    }
}
