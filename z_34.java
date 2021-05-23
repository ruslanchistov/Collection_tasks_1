//В матрице А(4-строки,3-столбца) поменять местами наибольшие элементы в первом и
//третьем столбцах.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_34 {
    public static void main(String[] args) {
        //--создаём массив---------
        int[][] arr = new int[4][3];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        getArray(arr);
        System.out.println();

        int index_1 = maxElement(arr,0);  //определяем строку максимального элемента в первом столбце
        int index_3 = maxElement(arr,2);  //определяем строку максимального элемента в третьем столбце

        int current = arr[index_1][0];      //меняем элементы местами
        arr[index_1][0] = arr[index_3][2];
        arr[index_3][2] = current;

        getArray(arr);
    }
        static int maxElement(int[][] arr,int j) {  //находим минимальный элемент в столбце
            int max = arr[0][j];
            int maxIndex = 0;
            for(int i =0;i<4;i++){
                for(int k=i;k<4;k++){
                    if(arr[k][j]>max){
                        max = arr[k][j];
                        maxIndex = k;
                    }
                }
            }
            return maxIndex;
        }

        static void getArray ( int[][] arr){ //выод массива на экран
            for (int[] item : arr) {
                System.out.println(Arrays.toString(item));
            }
        }
    }

