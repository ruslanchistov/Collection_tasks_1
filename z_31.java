//Дан двухмерный массив 5×6. Определить среднее арифметическое положительных
//элементов каждого столбца.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class z_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line;
        int column;
        System.out.print("Введите количество строк: ");
        line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        column = in.nextInt();
        int[][] arr = new int[line][column];

        arr = setArray(arr,line,column);
        getArray(arr);
        average(arr,line,column);
    }

    static int[][] setArray(int[][] arr,int line, int column) { //Заполнение массива случайными числами

        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = -50 + random.nextInt(50 - (-50) + 1);

            }
        }
        return arr;
    }
    static void getArray(int[][] arr){  //вывод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static void average(int[][] arr,int line, int column){
        double mean;
        double count;
        System.out.println("Среднее арифметическое положительных элементов по столбцам: ");
        for(int j =0;j< column;j++){
            mean = 0;
            count = 0;
            for (int i = 0;i<line;i++){
                if(arr[i][j]>0){
                    mean += arr[i][j];
                    count += 1;
                }
            }
            if(count==0){  //если в столбце нет положительных элементов
                System.out.println(j+" столбец: ---");
            }
            else {
                System.out.println(j + " столбец: " + (mean / count));
            }
        }
    }
}