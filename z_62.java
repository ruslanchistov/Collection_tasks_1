/*Даны два числа n и m. Создайте двухмерный массив int C[n][m] и заполните его по
  следующим правилам: числа, стоящие в строке 0 или в столбце 0 равны 1 (A[0][j]=1,
  A[i][0]=1); для всех остальных элементов массива A[i][j]=A[i-1][j]+A[i][j-1], то есть
  каждый элемент равен сумме двух элементов, стоящих слева и сверху от него. Выведите
  данный массив на экран, отводя на вывод каждого числа ровно 6 символов.*/

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_62 {
    public static void main(String[] args) {
    int [][] arr;
    arr = setArray();
    getArray(arr);
    }

    static int[][] setArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ведите количество строк: ");
        int line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int column = in.nextInt();
        int[][] arr = new int[line][column];
        //заполняем нулевую строку и нулевой столбец
        for (int i = 0; i <line; i++) {
            for (int j = 0; j <column ; j++) {
                if(i==0 || j==0) arr[i][j] = 1;
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(i!=0 && j!=0)arr[i][j]=arr[i-1][j]+arr[i][j-1];
            }
        }

    return arr;
    }
    static void getArray(int[][] arr){
        int line = arr.length;
        int column = arr[0].length;
        int space ;
        String str;
        for (int i = 0; i <line ; i++) {
            for (int j = 0; j < column; j++) {
                str = ""+arr[i][j];
                space = 6 - str.length();
                System.out.print(str);
                for (int k = 0; k < space; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
