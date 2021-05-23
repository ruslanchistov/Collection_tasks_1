//Разработать программу, реализующую обработку числового двухмерного произвольного
//массива тремя методами сортировки (пузырьком, вставкой, выбором).

// Без преобразования в одномерный массив

package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_51_2 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println();
        //bubbleSort(arr);
        //choiceSort(arr);
        //insertSort(arr);
        getArray(arr);
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
                arr[i][j] = 1 + random.nextInt(50 - 1);

            }
        }
        return arr;
    }
    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }

    static void bubbleSort(int[][] arr){ //пузырьковая сортировка
        int line = arr.length;
        int column = arr[0].length;

        int count = 1;
        while (count!=0) {
            count = 0;
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    if ((j == column - 1) && (i < line-1)) { //если конец строки и не конец массива
                        if (arr[i][j] > arr[i + 1][0]) {//сравниваем последний элемент текущей строки
                            int temp = arr[i][j];       //с первым элементом следующей строки
                            arr[i][j] = arr[i + 1][0];
                            arr[i + 1][0] = temp;
                            count++;
                            break;
                        }
                    }
                    else if((j==column-1) && (i==line-1)) break; //если конец массива
                    else if (arr[i][j] > arr[i][j + 1]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                        count++;
                    }
                }
            }
        }
    }
    static void choiceSort(int[][] arr){
        int line = arr.length;
        int column = arr[0].length;

        for (int k = 0; k < line; k++) {
            int ban_j = 0;
            for (int l = 0; l < column; l++) {
                int min = arr[k][l];
                int min_i = k;
                int min_j = l;

                for (int i = k; i < line; i++) {
                    for (int j = 0; j < column; j++) {
                        if(j>ban_j || i!=k) {
                            if (arr[i][j] < min) {
                                min_i = i;
                                min_j = j;
                                min = arr[i][j];
                            }
                        }
                    }
                }
                ban_j = l;
                int temp = arr[k][l];
                arr[k][l] = arr[min_i][min_j];
                arr[min_i][min_j] = temp;
            }
        }
    }
    static void insertSort(int[][] arr){
        int line = arr.length;
        int column = arr[0].length;


            for (int i = 0; i < line; i++) {
                int cur = arr[i][1];
                for (int j = 1; j < column; j++) {
                    int k = j-1;
                    if ((j == column) && (i < line-1)) { //если конец строки и не конец массива
                        if (arr[i][j] > arr[i + 1][0]) {//сравниваем последний элемент текущей строки
                            int temp = arr[i][j];       //с первым элементом следующей строки
                            arr[i][j] = arr[i + 1][0];
                            arr[i + 1][0] = temp;
                            break;
                        }
                    }
                    else if((j==column-1) && (i==line-1)) break; //если конец массива
                    else {
                        while (arr[i][k]>cur){
                            arr[i][k+1] = arr[i][k];
                            k--;
                            if(k<0) break;
                        }
                        arr[i][k+1] = cur;
                    }
                }
            }
    }
}
