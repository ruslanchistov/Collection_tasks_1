//Сформируйте массив L(I,J) с помощью датчика случайных чисел. Увеличить каждый
//элемент массива в 3 раза и поменяйте знак на противоположный. Массив выведите на
//экран в виде таблицы.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_49 {
        public static void main(String[] args) {

                int[][] arr;
                arr = setArray();
                getArray(arr);
                System.out.println();
                transformation(arr);
        }

        static int[][] setArray() { //Создание и заполнение массива случайными числами
                Scanner in = new Scanner(System.in);
                int line;
                int column;
                System.out.print("Введите количество строк: ");
                line = in.nextInt();
                System.out.print("Введите количество столбцов: ");
                column = in.nextInt();
                int[][] arr = new int[line][column];
                Random random = new Random();
                for (int i = 0; i < line; i++) {
                        for (int j = 0; j < column; j++) {
                                arr[i][j] = -20 + random.nextInt(20 - (-20));

                        }
                }
                return arr;
        }
        static void getArray(int[][] arr) { //выод массива на экран
                for (int[] item : arr) {
                        System.out.println(Arrays.toString(item));
                }
        }
        static void transformation(int[][]arr){   //преобразование массива
                int line = arr.length;
                int column = arr[0].length;
                for (int i = 0; i < line; i++) {
                        for (int j = 0; j < column; j++) {
                               arr[i][j] *= (-3);
                                System.out.print(arr[i][j]);//выводим результат в виде таблицы
                                System.out.print("\t\t");
                        }
                        System.out.println();
                }
        }
}
