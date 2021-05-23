//Дано число n. Создайте массив int A[n][n], и заполните его по следующему правилу: числа
//на диагонали, идущей из правого верхнего в левый нижний угол равны 1; числа, стоящие
//выше этой диагонали, равны 0; числа, стоящие ниже этой диагонали, равны 2.
//0 0 0 1
//0 0 1 2
//0 1 2 3
//1 2 3 4

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_60 {
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
                        int j = k-1;
                        for (int i = n - 1; i >=k-1; i--) {
                                A[i][j] = k;
                                j++;
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
