//Дан квадратный массив из n элементов. Найти произведение элементов первой строки.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_44 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println("Произведение элементов первой строки равно "+productFirstLine(arr));

    }

    static int[][] setArray() { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        System.out.print("Введите количество строк (столбцов): ");
        line = in.nextInt();
        int[][] arr = new int[line][line];
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                arr[i][j] = 1 + random.nextInt(20 - 1);

            }
        }
        return arr;
    }

    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static int productFirstLine(int[][] arr){ //вычисление произведения элементов первой строки
        int prod = 1;
        int line = arr.length;
        for (int j = 0; j < line; j++) {
            prod *= arr[0][j];
        }
        return prod;
    }
}
