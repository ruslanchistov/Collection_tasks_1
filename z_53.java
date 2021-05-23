//Дан массив А[3][3]. Найти строку, сумма элементов которой минимальна, и умножить на
//минимальную сумму каждый элемент матрицы.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_53 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        resultFunc(arr,minSumElemLine(arr));
        getArray(arr);
    }

    static int[][] setArray() { //Создание и заполнение массива случайными числами

        int[][] arr = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
    static int minSumElemLine(int[][]arr){ //поиск строки с минимальной суммой элементов
        int sum;
        int min_sum = 0;
        for (int j = 0; j < 3; j++) {
            min_sum += arr[0][j];
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            if (sum < min_sum) {
                min_sum = sum;
                index = i+1;
            }
        }
        System.out.println(index+"-я строка минимальная сумма: "+min_sum);
        return min_sum;
    }
    static void resultFunc (int[][] arr, int min_sum){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] *= min_sum;
            }
        }
    }
}
