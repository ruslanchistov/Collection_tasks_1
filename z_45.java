//Дан целочисленный квадратный массив 10×10. Найти сумму элементов каждой строки.

package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_45 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        sumElemLine(arr);
    }

    static int[][] setArray() { //Создание и заполнение массива случайными числами

        int[][] arr = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
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
    static void sumElemLine(int[][]arr){    //вычисление суммы элементов по строкам
        int sum;
        System.out.println("Суммы элементов по строкам");
        for (int i = 0; i < 10; i++) {
            sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += arr[i][j];
            }
            System.out.println((i+1)+"-я строка: "+sum);
        }
    }
}
