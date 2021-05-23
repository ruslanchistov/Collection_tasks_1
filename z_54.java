//Дана целочисленная квадратная матрица порядка N. Переставить строки матрицы, чтобы
//их последние элементы располагались в порядке убывания.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_54 {
    public static void main(String[] args) {

        //создаём матрицу
        int[][] matrix;
        matrix = setMatrix();
        getMatrix(matrix);
        System.out.println();
        sortedMatrix(matrix);
        getMatrix(matrix);
    }
        static int[][] setMatrix () { //Создание и заполнение массива случайными числами
            Scanner in = new Scanner(System.in);
            int line;
            System.out.print("Введите количество строк(столбцов): ");
            line = in.nextInt();
            int[][] matrix = new int[line][line];
            Random random = new Random();
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < line; j++) {
                    matrix[i][j] = 1 + random.nextInt(30 - 1);

                }
            }
            return matrix;
        }
        static void getMatrix ( int[][] matrix){ //выод массива на экран
                for (int[] item : matrix) {
                    System.out.println(Arrays.toString(item));
                }
            }
        static void sortedMatrix(int[][] arr) { //сортировка массива по элементам последнего столбца
        int line = arr.length;
        int current;
        int max;
        int maxIndex;
        for(int i =0;i<line;i++){   //находим максимальный элемент в последнем столбце
            max = arr[i][line-1];
            maxIndex = i;
            for(int k=i;k<line;k++){
                if(arr[k][line-1]>max){
                    max = arr[k][line-1];
                    maxIndex = k;
                }
            }
            for(int j=0;j<line;j++) {   // меняем текущую строку со строкой с  максимальным элементом
                current = arr[i][j];
                arr[i][j] = arr[maxIndex][j];
                arr[maxIndex][j] = current;
            }
        }
    }
}


