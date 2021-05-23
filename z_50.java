//Дана квадратная матрица. Сформировать одномерный массив, состоящий из элементов,
//расположенных ниже главной диагонали матрицы. Выполнить сортировку одномерного
//массива. Вывести матрицу, одномерный массив до сортировки, одномерный массив после
//сортировки.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_50 {
        public static void main(String[] args) {

                //создаём матрицу
                int [][] matrix;
                matrix = setMatrix();
                getMatrix(matrix);
                System.out.println();

                //создаём массив
                int [] array;
                array=setArray(matrix);
                System.out.println(Arrays.toString(array));
                System.out.println();

                //сортируем массив и выводим результат
                Arrays.sort(array);
                System.out.println();
                System.out.println(Arrays.toString(array));
        }
        static int [][] setMatrix() { //Создание и заполнение массива случайными числами
                Scanner in = new Scanner(System.in);
                int line;
                System.out.print("Введите количество строк(столбцов): ");
                line = in.nextInt();
                int [][] matrix = new int [line][line];
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
        static int[] setArray(int[][]matrix){
                int line = matrix.length;
                // определяем длину одномерного массива
                int length_arr = 0;
                int count=0;
                while (count<line) {
                        length_arr+=count;
                        count++;
                }
                // заносим элементы матрицы(под главной диагональю) в одномерный массив
                int[]array = new int [length_arr];
                int k=0;
                for (int i = 1; i < line; i++) {
                        for (int j = 0; j < i; j++) {
                               array[k] = matrix[i][j];
                               k++;
                        }
                }
                return array;
        }
}
