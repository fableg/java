package homework3;
/*6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;*/
public class Task6 {
    public static void main(String[] args) {
        int[] array = {5, 2, 6, 10, 1, 3};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
