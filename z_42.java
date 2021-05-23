//Дан массив из n × m элементов. Найти индексы первого наименьшего элемента массива.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_42 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        firstMinElement(arr);

    }

    static int[][] setArray() { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        int column;
        System.out.print("Введите количество строк: ");
        line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        column = in.nextInt();
        int[][] arr = new int[line][column];
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = 1 + random.nextInt(10 - 1);

            }
        }
        return arr;
    }

    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }

    static void firstMinElement(int[][] arr) {
        int line = arr.length;
        int column = arr[0].length;
        int min = arr[line-1][column-1];
        int min_i = line-1;
        int min_j = column-1;
        for (int i = line-1; i >=0 ; i--) {
            for (int j = column-1; j >=0; j--) {
                if (arr[i][j]<=min) {
                    min=arr[i][j];
                    min_i = i;
                    min_j = j;
                }
            }
        }
        System.out.println("Индексы первого встречающегося наименьшего значения: "+min_i+" строка "+min_j+"столбец");
    }

}
