//Дана квадратная матрица N×N, состоящая из натуральных чисел. Зеркально отразить ее
//элементы относительно побочной диагонали. Вывести результат на экран.

        package zadachnic_2.zadachi_1_66;

import java.util.*;

public class z_58 {
    public static void main(String[] args) {

        //создаём матрицу
        int[][] matrix;
        matrix = setMatrix();
        getMatrix(matrix);
        System.out.println();
        mirrorMatrix(matrix);
        getMatrix(matrix);
    }
    static int[][] setMatrix () { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        System.out.print("Введите количество строк(столбцов): ");
        line = in.nextInt();
        int[][] matrix = new int[line][line];
        HashSet<Integer> set_ = new HashSet<>();
        Random random = new Random();
        int max;
        if(line*line>100) max = line*line + 100;
        else max = 100;
        int current;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                do  current = 10 + random.nextInt(max - 10);
                while ( ! set_.add(current));   //исключаем попадание в массив повторяющихся элементов
                matrix[i][j] = current;
            }
        }
        return matrix;
    }
    static void getMatrix ( int[][] matrix){ //выод массива на экран
        for (int[] item : matrix) {
            System.out.println(Arrays.toString(item));
        }
    }
    static int [][] mirrorMatrix(int[][] matrix){
        int line = matrix.length-1; //определяем номер последнего столбца
        int temp;
        int k = line;

        for (int i = 0; i < line; i++) {
            int l = line;
            for (int j = 0; j < line-i; j++) {
                temp = matrix[i][j];
                matrix[i][j]=matrix[l][k];
                matrix[l][k]=temp;
                l--;
            }
            k--;
        }
        return matrix;
    }
}
