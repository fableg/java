package homework3;

/*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len,
 каждая ячейка которого равна initialValue;*/

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 5;
        int[] arr = initArray(len, initialValue);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] initArray (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}

