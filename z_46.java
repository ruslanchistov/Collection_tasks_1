//Дан целочисленный квадратный массив 4×4. Найти строку с наименьшей суммой
//элементов.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_46 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        minSumElemLine(arr);
    }

    static int[][] setArray() { //Создание и заполнение массива случайными числами

        int[][] arr = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
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
    static void minSumElemLine(int[][]arr){ //поиск строки с минимальной суммой элементов
        int sum;
        int min_sum = 0;
        for (int j = 0; j < 4; j++) {
            min_sum += arr[0][j];
        }
        int index = 0;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            if (sum < min_sum) {
                min_sum = sum;
                index = i+1;
            }
        }
        System.out.println(index+"-я строка минимальная сумма: "+min_sum);
    }
}
