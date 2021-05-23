//Дана вещественная квадратная матрица порядка 5. Найти наименьший элемент на
//побочной диагонали.
package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_32 {
    public static void main(String[] args) {

        double [][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println("Минимальный элемент побочной диагонали равен: " + searchMinElement(arr));
    }
    static double[][] setArray() { //Заполнение массива случайными числами

        double[][] arr = new double[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = -20 + random.nextInt(20 - (-20));
            }
        }
        return arr;
    }
    static void getArray(double[][] arr){
        for (double[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static double searchMinElement(double[][] arr){
        double minElement = arr[4][0];
        int j = 0;
        for(int i = 4;i >=0;i-- ){
            if(arr[i][j]< minElement){
                minElement = arr[i][j];
            }
            j++;
        }
        return minElement;
    }
}
