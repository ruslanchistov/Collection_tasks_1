//Дан квадратный массив из n элементов. Найти сумму элементов последнего столбца.

package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_43 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println("Сумма элементов последнего столбца равна "+sumLastColumn(arr));

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
    static int sumLastColumn(int[][] arr){ //вычисление суммы элементов последнего столбца
        int sum = 0;
        int line = arr.length;
        for (int i = 0; i < line; i++) {
            sum += arr[i][line-1];
        }
        return sum;
    }
}
