package homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println(" _Orenge\n" + " _Banana\n" + " _Apple");
    }

    public static void chekSumSign() {
        int a = 5;
        int b = 15;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println(" Жёлтый");
        } else System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 19;
        int b = 17;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");
        }

    }
}



