//Дан двухмерный массив 5×6. Определить среднее арифметическое каждого столбца,
//определить максимум и минимум каждой строки.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_37 {
    public static void main(String[] args) {
        //--создаём массив---------
        int[][] arr = new int[5][6];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        getArray(arr);
        System.out.println();
        average(arr);
        System.out.println();
        minMax(arr);
    }
    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }

    static void average(int[][] arr){
        double mean;
        System.out.println("Среднее арифметическое столбцов");
        for(int j = 0;j<6;j++){
            mean = 0;
            for(int i=0;i<5;i++){
                mean += arr[i][j];
            }
            System.out.println(+j+"-й столбец: "+(mean/5));
        }
    }

    static void minMax(int[][] arr){    //определяем min и max в каждой строке
        int min;
        int max;
        for(int i = 0;i<5;i++){
            min=arr[i][0];
            max=arr[i][0];
            for(int j=0;j<6;j++){
                if(arr[i][j]<min) min=arr[i][j];
                if(arr[i][j]>max) max=arr[i][j];
            }
            System.out.println(i+"-я строка: min="+min+"  max="+max);
        }
    }
}
