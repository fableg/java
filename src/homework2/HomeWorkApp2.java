package homework2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
    within10and20();
    isNegativeOrPositive();
    isNegative();
    printWordNTimes();
    checkLeapYear();
    }
    // Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    public static boolean within10and20 (int a, int b){
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

//Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали
// или отрицательное. Замечание: ноль считаем положительным числом.

    public static void isNegativeOrPositive(int a){
        if (a >= 0){
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

//Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isNegative(int a){
       return a < 0;
    }

//Написать метод, которому в качестве аргументов передается строка и число,
//метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void printWordNTimes(String word, int times){
        for (int i = 0;i < times; i++){
            System.out.println(word);
        }
    }
// задание со *
    public static boolean checkLeapYear(int year){
            return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
    }
}

