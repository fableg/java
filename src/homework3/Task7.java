package homework3;

/*7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
части массива равны.*/

public class Task7 {
    public static void main(String[] args) {
        System.out.println((checkBalance(new int[] {2,2,2,2, 1, 1, 2})));

    }
    private static boolean checkBalance(int[] array) {
        boolean result = false;
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            if (leftSum == rightSum) {
                System.out.println("Common sum = " + leftSum + "; index = " + i);
                result = true;
                break;
            }
        }
        return result;
    }

    private static int sum(int[] array, int start, int end){
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}


