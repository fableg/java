package homework3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
                /*2. Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

        int[] arr2 = new int [100];
        int counter = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = counter;
            counter++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
