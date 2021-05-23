//Дана матрица N×M, состоящая из натуральных чисел. Выбрать в строках самые
//наименьшие элементы и поставить их в первый столбец.

        package zadachnic_2.zadachi_1_66;

import java.util.*;

public class z_59 {
    public static void main(String[] args) {
        Integer[][] arr;
        arr = setArray();
        getArray(arr);
        System.out.println();
        arr = searchMinElem(arr);
        getArray(arr);
    }
    static Integer[][] setArray() { //Создание и заполнение массива случайными числами
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set_= new HashSet<>(); //создаём множество для эксклюзивности элементов массива
        int line;
        int column;
        Integer current;
        System.out.print("Введите количество строк: ");
        line = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        column = in.nextInt();
        Integer[][] arr = new Integer[line][column];
        Random random = new Random();
        int max;
        if(line*column>100) max = line*column + 100;
        else max = 100;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                do  current = 10 + random.nextInt(max - 10);
                while ( ! set_.add(current));   //исключаем попадание в массив повторяющихся элементов
                arr[i][j] = current;
            }
        }
        return arr;
    }
    static void getArray(Integer[][] arr) { //выод массива на экран
        for (Integer[] item : arr) {
            System.out.println(Arrays.toString(item));
        }
    }
    static Integer[][] searchMinElem(Integer[][] arr){
        int line = arr.length;
        int column = arr[0].length;
        int temp;
        int min_j;
        int min;
        //находим минимальный элемент в каждой строке
        for (int i = 0; i < line; i++) {
            min_j=0;
            min=arr[i][0];
            for (int j = 0; j < column; j++) {
                if(arr[i][j]< min){
                    min=arr[i][j];
                    min_j=j;
                }
            }
            //ставим минимальный элемент в первый столбец
            temp=arr[i][0];
            arr[i][0]=arr[i][min_j];
            arr[i][min_j]=temp;
        }
        return arr;
    }
}
