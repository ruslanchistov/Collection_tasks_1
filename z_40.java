//Дан двухмерный массив n ×m элементов. Определить, сколько раз встречается число 7
//среди элементов массива.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_40 {
    public static void main(String[] args) {

        int [][] arr;
        arr = setArray();
        getArray(arr);
        System.out.print("Введите искомый элемент: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        evenUneven(arr,n);
    }
    static int [][] setArray() { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        int column;
        System.out.print("Введите количество строк: ");
        line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        column = in.nextInt();
        int [][] arr = new int [line][column];
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = 1 + random.nextInt(10 - 1);

            }
        }
        return arr;
    }
    static void getArray ( int[][] arr){ //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static void evenUneven(int[][] arr,int n){    // подсчёт количества вхождений элемента
        int column = arr[0].length;
        int line = arr.length;
        int count = 0;
        for(int i=0;i<line;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j]==n) count++;
            }
        }
        System.out.println("Число "+n+" встречается "+count+"раз.");
    }
}
