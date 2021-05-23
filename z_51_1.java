//Разработать программу, реализующую обработку числового двухмерного произвольного
//массива тремя методами сортировки (пузырьком, вставкой, выбором).

// С преобразованием в одномерный массив
        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_51_1 {
    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println();
        //bubbleSort(arr);
        //choiceSort(arr);
        insertSort(arr);
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

    static void bubbleSort(int[][] arr){

       int [] cur_arr = transformationForward(arr);

        // определяем длину одномерного массива
        int length_arr=arr.length*arr[0].length;

        //сортируем одномерный массив
       int count=1;
        while (count!=0) {
            count = 0;
            for (int i = 0; i < length_arr-1; i++) {
                if (cur_arr[i] > cur_arr[i+1]) {
                    cur_arr[i] ^= cur_arr[i+1];
                    cur_arr[i+1] ^= cur_arr[i];
                    cur_arr[i] ^= cur_arr[i+1];
                    count++;
                }
            }
        }
        transformationBack(cur_arr,arr);
    }
    static void choiceSort(int[][] arr) {
        int [] cur_arr = transformationForward(arr);

        // определяем длину одномерного массива
        int length_arr=arr.length*arr[0].length;

        //сортируем одномерный массив
        int temp;
        for (int i = 0; i < length_arr; i++) {
            int min = cur_arr[i];
            int minIndex = i;
            for (int j = i; j < length_arr; j++) {
                if (cur_arr[j] < min) {
                    min = cur_arr[j];
                    minIndex = j;
                }
            }
            //меняем местами минимальный элемент с текущим
            temp = cur_arr[minIndex];
            cur_arr[minIndex]= cur_arr[i];
            cur_arr[i]= temp;
        }
        transformationBack(cur_arr,arr);
    }
    static void insertSort(int[][] arr){
        int[] cur_arr = transformationForward(arr);

        // определяем длину одномерного массива
        int length_arr=arr.length*arr[0].length;

        // сортируем одномерный массив
        int temp;
        for (int i = 1; i < length_arr; i++) {
            int j = i-1;
            temp=cur_arr[i];
            while (cur_arr[j]>temp){
               cur_arr[j+1] = cur_arr[j];
               j--;
               if(j<0) break;
            }
            cur_arr[j+1] = temp;
        }
        transformationBack(cur_arr,arr);
    }

    static int[] transformationForward(int[][] arr){   //преобразуем двухмерный массив в одномерный
        int line = arr.length;
        int column = arr[0].length;

        int length_arr=line*column;
        int[] cur_arr = new int[length_arr];
        int k = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                cur_arr[k] = arr[i][j];
                k++;
            }
        }
        return cur_arr;
    }
    static void transformationBack(int[]cur_arr,int[][]arr){
        //преобразуем одномерный отсортированный массив в двухмерный
        int line = arr.length;
        int column = arr[0].length;
        int k = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j]= cur_arr[k];
                k++;
            }
        }
    }
}
