package homework4;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static final char[][] map = new char[SIZE][SIZE];


    public static void main(String[] args) {
        initMap();
        printMap();
        humanTurn();

    }

    private static void printMap() {
        printHeader();
        printBody();
        System.out.println();
    }

    private static void humanTurn() {
        int x = -1;
        int y = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты в формате X Y");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt() - 1;
            } else {
                System.out.println("Координаты должны быть числом!");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                y = scanner.nextInt() - 1;
            } else {
                System.out.println("Координаты должны быть числом");
                scanner.nextLine();
            }

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно!");
            }
            else if (map[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }
        } while (true);
            map[x][y] = DOT_X;
    }

    private static

    private static void printBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
//            for (int j = 0; j < SIZE; j++) {
//                mai[i][j] = DOT_EMPTY;
//            }

        }
    }
}
