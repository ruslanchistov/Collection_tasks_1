//В матрице А(3-строки,4-столбца) поменять местами наименьшие элементы в первой и
//третей строке.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_35 {
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

        int index_1 = maxElement(arr,0);  //определяем столбца минимального элемента в первой строке
        int index_3 = maxElement(arr,2);  //определяем столбца минимального элемента в третьей строке

        int current = arr[0][index_1];      //меняем элементы местами
        arr[0][index_1] = arr[2][index_3];
        arr[2][index_3] = current;

        getArray(arr);
    }

    static int maxElement(int[][] arr,int i) {  //находим минимальный элемент в строке
        int min = arr[i][0];
        int minIndex = 0;
        for(int j =0;j<4;j++){
            for(int k=j;k<4;k++){
                if(arr[i][k]<min){
                    min = arr[i][k];
                    minIndex = k;
                }
            }
        }
        return minIndex;
    }

    static void getArray ( int[][] arr){ //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
}
