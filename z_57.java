//Найти максимальный среди элементов тех столбцов, которые упорядочены либо по
//возрастанию, либо по убыванию. Если упорядоченные столбцы в матрице отсутствуют, то
//вывести 0.

        package zadachnic_2.zadachi_1_66;

import java.util.*;

public class z_57 {
    public static void main(String[] args) {
        Integer[][] arr;
        arr = setArray();
        getArray(arr);
        maxElement(arr);
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
    static int maxElement(Integer[][]arr){
        int line = arr.length;
        int column = arr[0].length;
        //создаём множество для номеров столбцов
        HashSet<Integer> set_column =  new HashSet<>();

        //ищем отсортированные столбцы
        for (int j = 0; j < column; j++) {
            int count_up = 0;
            int count_down = 0;
            for (int i = 0; i < line-1; i++) {
                if(arr[i][j]>arr[i+1][j]) count_up++;
                if(arr[i][j]<arr[i+1][j]) count_down++;

            }
            //если столбец отсортирован,заносим его номер в множество
            if(count_up==line-1 || count_down==line-1) set_column.add(j);
        }
        if(set_column.size()==0){
            System.out.println("Упорядоченных столбцов нет.");
            return 0;
        }
        //создаём множество,куда будем заносить элементы вывранных столбцов
        TreeSet<Integer> set_arr = new TreeSet<>();

        for (Integer j: set_column) {
            for (int i = 0; i < line; i++) {
                set_arr.add(arr[i][j]);
            }
        }
        System.out.println("Максимальный элемент среди упорядоченных столбцов: "+set_arr.last());
        return set_arr.last();
    }
}
