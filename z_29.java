//Отсортировать по возрастанию элементов последней строки целочисленный двухмерный
//массив 3×4.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;


public class z_29 {
    public static void main(String[] args) {
        //--создаём массив---------
        int[][] arr = new int[3][4];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        getArray(arr);
        System.out.println();
        sortedArray(arr);
    }

    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }

    static void sortedArray(int[][] arr) { //сортировка массива по элементам последней строки

        int current;
        int min;
        int minIndex;
        for(int j =0;j<4;j++){   //находим минимальный элемент в последней строке
            min = arr[2][j];
            minIndex = j;
           for(int k=j;k<4;k++){
               if(arr[2][k]<min){
                   min = arr[2][k];
                   minIndex = k;
               }
           }
            for(int i=0;i<3;i++) {   // меняем текущий столбец с минимальным
                current = arr[i][j];
                arr[i][j] = arr[i][minIndex];
                arr[i][minIndex] = current;
            }
        }
        getArray(arr);
    }
}
