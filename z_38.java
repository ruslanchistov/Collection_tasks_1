//Дан двухмерный массив 7×8. Определить количество нечетных элементов каждого столбца.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_38 {
    public static void main(String[] args) {
        //--создаём массив---------
        int[][] arr = new int[7][8];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = random.nextInt(50);
            }
        }
        getArray(arr);
        counter(arr);
    }
    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static void counter(int[][] arr){   //подсчёт нечётных элементов по столбцам
        int count;
        for(int j = 0;j<8;j++){
            count = 0;
            for(int i=0;i<7;i++){
                if(arr[i][j]%2!=0) count ++;
            }
            System.out.println(+j+"-й столбец: "+count+" нечётных элементов");
        }
    }
}
