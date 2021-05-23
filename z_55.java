//Дана матрица размера 5×10. Вывести количество столбцов, элементы которых монотонно убывают.

package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Random;

public class z_55 {

    public static void main(String[] args) {

        int[][] arr;
        arr = setArray();
        getArray(arr);
        searchColumn(arr);
    }
    static int[][] setArray() { //Создание и заполнение массива случайными числами

        int[][] arr = new int[5][10];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = 10 + random.nextInt(100 - 10);
            }
        }
        return arr;
    }
    static void getArray(int[][] arr) { //выод массива на экран
        for (int[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static void searchColumn(int[][] arr){
        int line = arr.length;
        int column = arr[0].length;
        int count_column = 0;
        for (int j = 0; j < column; j++) {
            int count = 0;
            for (int i = 0; i < line-1; i++) {
                if(arr[i][j]>arr[i+1][j]) count++;
                else break;
            }
            if(count==4) count_column ++;
        }
        System.out.println("количество столбцов, элементы которых монотонно убывают: "+count_column);
    }
}
