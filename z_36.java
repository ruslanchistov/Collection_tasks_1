//Задана квадратная матрица А размером N×N (N<=10),состоящая из действительных
//чисел. Найти произведение наименьших элементов каждого столбца матрицы.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class z_36 {
    public static void main(String[] args) {

        double [][] matrix;
        matrix = setMatrix();
        getMatrix(matrix);
        System.out.println("Произведение минимальных элементов каждого столбца равно: "+searchMinElement(matrix));
    }

    static double[][] setMatrix() { //Заполнение матрицы случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        System.out.print("Введите количество строк (столбцов) квадратной матрицы (<=10): ");
        line = in.nextInt();

        double[][] matrix = new double[line][line];
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                matrix[i][j] =Math.ceil(((random.nextDouble()*50)-10)*100)/100  ;

            }
        }
        return matrix;
    }
    static void getMatrix(double[][] matrix){   //вывод матрицы на экран
        for (double[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }
    static double searchMinElement(double[][] matrix){  //поиск минимальных элементов в столбцах и их произведения

        double result = 1;
        int line = matrix.length;
        for(int j = 0;j<line;j++) {
            double minElement = matrix[0][j];

            for (int i = 0; i < line; i++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
            result *= minElement;
        }
        return result;
    }
}
