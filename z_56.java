//Дана матрица порядка n×m, все элементы которой различны. В каждой строке выбирается
//элемент с наименьшим значением, затем среди этих чисел выбирается наибольшее.
//Указать индексы элемента с найденным значением.

        package zadachnic_2.zadachi_1_66;

import java.util.*;

public class z_56 {
    public static void main(String[] args) {
        Integer[][] arr;
        arr = setArray();
        getArray(arr);
        searchIndexElement(arr);
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
    static void searchIndexElement(Integer[][] arr){

        // определяем размеры массива
        int line = arr.length;
        int column = arr[0].length;

        //создаём массив для минимальных элементов по строкам
        Integer[] cur_arr = new Integer[line];
        int i =0;
        for (Integer[] item:arr){
            cur_arr[i] = Collections.min(Arrays.asList(item));
            i++;
        }
        //определяем максимальный элемент среди минимальных элементов
        Integer max_in_min = Collections.max(Arrays.asList(cur_arr));

        //определяем индексы найденного элемента
        int index_i = 0;
        int index_j = 0;
        for ( i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(arr[i][j]==max_in_min){
                    index_i = i;
                    index_j = j;
                }
            }
        }
        System.out.println("Индексы искомого элемента i: "+index_i+"  j: "+index_j);
    }
}
