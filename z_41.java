//Дан массив из n×m элементов. Найти наибольший элемент массива в каждом столбце.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_41 {
    public static void main(String[] args) {

        int [][] arr;
        arr = setArray();
        getArray(arr);
        maxElement(arr);

    }
    static int [][] setArray() { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        int column;
        System.out.print("Введите количество строк: ");
        line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        column = in.nextInt();
        int [][] arr = new int [line][column];
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = 1 + random.nextInt(20 - 1);

            }
        }
        return arr;
    }
    static void getArray ( int[][] arr){ //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static void maxElement(int[][] arr){    // поиск максимума в каждом столбце
        int line = arr.length;
        int column = arr[0].length;
        System.out.println("Максимальные элементы по столбцам:");
        for(int j = 0;j<column;j++) {
            int maxElement = arr[0][j];
            for (int i = 0; i < line; i++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                }
            }
            System.out.println(j+"столбец: "+maxElement);
        }

    }
}
