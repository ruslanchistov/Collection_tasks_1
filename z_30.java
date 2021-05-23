//Дан двухмерный массив 7×7. Найти сумму модулей отрицательных нечетных элементов.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.*;
public class z_30 {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        Random random = new Random();
        int sum =0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = -50 + random.nextInt(50-(-50)+1);
                if(arr[i][j]<0 && arr[i][j]%2!=0){
                    sum += abs(arr[i][j]);
                }
            }
        }
        getArray(arr);
        System.out.println("Сумма модулей отрицательных нечетных элементов: "+sum);
    }

    static void getArray(int[][] arr) {
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }


    }

