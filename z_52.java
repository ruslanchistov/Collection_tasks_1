//Дана целочисленная матрица размера M × N, элементы которой могут принимать значения
//от 0 до 100. Различные строки матрицы назовем похожими, если совпадают множества
//чисел, встречающихся в этих строках. Найти количество строк, похожих на первую строку
//данной матрицы.


        package zadachnic_2.zadachi_1_66;

import java.util.*;

public class z_52 {
    public static void main(String[] args) {
        Integer[][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println();
        System.out.println("количество строк, похожих на первую строку данной матрицы: "+countLine(arr));
    }

    static Integer[][] setArray() { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        int line;
        int column;
        System.out.print("Введите количество строк: ");
        line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        column = in.nextInt();
        Integer[][] arr = new Integer[line][column];
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = 0+random.nextInt(100-0);

            }
        }
        return arr;
    }
    static void getArray(Integer[][] arr) { //выод массива на экран
        for (Integer[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static int countLine(Integer[][] arr){
        int line = arr.length;
        int column = arr[0].length;
        int count = 0;
        TreeSet<Integer> set_ = new TreeSet<>(Arrays.asList(arr[0]));
        for (Integer[] item:arr) {
            TreeSet<Integer> set_item = new TreeSet<Integer>(Arrays.asList(item));
           if(set_.equals(set_item)) count++;
        }

        return count-1;
    }
}
