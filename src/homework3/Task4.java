package homework3;
    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         и с помощью цикла(-ов) заполнить его диагональные элементы единицами
         (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно
          по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/


import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = array[i][lastIndex - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

