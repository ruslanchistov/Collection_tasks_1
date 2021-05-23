//Отсортировать по убыванию элементов последнего столбца целочисленный двухмерный
//массив 5×4.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_33 {
    public static void main(String[] args) {
        //--создаём массив---------
        int[][] arr = new int[5][4];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
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

    static void sortedArray(int[][] arr) { //сортировка массива по элементам последнего столбца

        int current;
        int max;
        int maxIndex;
        for(int i =0;i<4;i++){   //находим максимальный элемент в последнем столбце
            max = arr[i][3];
            maxIndex = i;
            for(int k=i;k<5;k++){
                if(arr[k][3]>max){
                    max = arr[k][3];
                    maxIndex = k;
                }
            }
            for(int j=0;j<4;j++) {   // меняем текущую строку со строкой с максимальным элементом
                current = arr[i][j];
                arr[i][j] = arr[maxIndex][j];
                arr[maxIndex][j] = current;
            }
        }
        getArray(arr);
    }
}

