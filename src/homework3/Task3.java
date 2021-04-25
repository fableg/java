package homework3;

public class Task3 {
    public static void main(String[] args) {
         /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        и числа меньшие 6 умножить на 2; */

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++){
            arr3[i] = (arr3[i] < 6) ? arr3[i] *= 2 : arr3[i];
            System.out.print(arr3[i] + " ");
        }
    }
}
