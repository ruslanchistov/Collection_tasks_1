/*Даны числа n и m. Создайте массив int A[n][m] и заполните его следующей змейкой (ниже
        приведен пример для n=4 и m=6):
        0   1   2   3   4   5
        11  10  9   8   7   6
        12  13  14  15  16  17
        23  22  21  20  19  18*/

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_63 {
    public static void main(String[] args) {
        int[][] arr;
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

        int flag = 1;
        int count = 0;
        for (int i = 0; i < line; i++) {
            if (flag > 0) { //заполняем слева направо
                for (int j = 0; j < column; j++) {
                    arr[i][j] = count;
                    count++;
                }
            } else {    //заполняем справа налево
                for (int j = column - 1; j >= 0; j--) {
                    arr[i][j] = count;
                    count++;
                }
            }
        }
        return arr;
    }
    static void getArray ( int[][] arr){
        int line = arr.length;
        int column = arr[0].length;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
