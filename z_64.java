/*Даны числа n и m. Создайте массив int A[n][m] и заполните его следую- щим образом
        (ниже приведен пример для n=4 и m=6):
        0  1  3  6  10  14
        2  4  7  11 15  18
        5  8  12 16 19  21
        9  13 17 20 22  23*/

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_64 {
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
        //заполняем левую часть массива
        int count = 0;
        int k;
        for (int j = 0; j < column; j++) {
            k = j;
            for (int i = 0; i <line ; i++) {
                if(k<0) break;
                arr[i][k] = count;
                count++;
                k--;
            }
        }
        //заполняем правую часть массива
        for (int i = 1; i < line; i++) {
            k = i;
            for (int j = column-1; j >=0; j--) {
                if(k==line) break;
                arr[k][j] = count;
                count++;
                k++;
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
