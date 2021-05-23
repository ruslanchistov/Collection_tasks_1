/*Дан квадратный массив из n строк и n столбцов. Необходимо элементам, находящимся на
        главной диагонали, проходящей из левого верхнего угла в правый нижний (то есть тем
        элементам A[i][j], для которых i=j) присвоить значение 1, элементам, находящимся выше
        главной диагонали – значение 0, элементам, находящимся ниже главной диагонали –
        значение раное расстоянию элемента от диагонали
        1 0 0 0
        2 1 0 0
        3 2 1 0
        4 3 2 1*/


        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_66 {
    public static void main(String[] args) {
        int [][] A = setArray();
        getArray(A);
    }
    static int [][] setArray(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер квадратного массива: ");
        int n = in.nextInt();
        int [][] A = new int [n][n];
        // заполняем массив под диагональю и саму диагональ
        for (int k = 1; k <=n; k++) {
            int i = k-1;
            for (int j = 0; j <=n-k; j++) {
                A[i][j] = k;
                i++;
            }
        }
        return A;
    }
    static void getArray ( int[][] arr){ //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
}
