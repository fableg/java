package homework3;

/* Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
нельзя пользоваться вспомогательными массивами.
Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2
на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/


import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        shiftArray(new int[] {1, 2, 3, 4, 5}, 0);
        shiftArray(new int[] {1, 2, 3, 4, 5}, 1); // 5 1 2 3 4
        shiftArray(new int[] {1, 2, 3, 4, 5}, 2); // 4 5 1 2 3
        shiftArray(new int[] {1, 2, 3, 4, 5}, 5);
        shiftArray(new int[] {1, 2, 3, 4, 5}, 6);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -1);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -2);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -5);
        shiftArray(new int[] {1, 2, 3, 4, 5}, -6);
    }

    // 1 2 3 -> 3 1 2
    private static void shiftArray(int[] array, int n) {
        int shiftNumber = n % array.length;
        if (shiftNumber < 0) {
            shiftLeft(array, Math.abs(shiftNumber));
        }
        else {
            shiftRight(array, shiftNumber);
        }
        System.out.println(Arrays.toString(array) + "; shiftNumber = " + n);
    }

    private static void shiftRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }

    // 1 2 3 -> 2 3 1
    // 2 2 3
    // 2 3 3
    // 2 3 1
    private static void shiftLeft(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }
}
