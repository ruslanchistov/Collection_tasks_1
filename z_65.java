/*Дан двухмерный массив, содержащий 8 строк и 8 столбцов. Элементами массива являются
  целые числа. Упорядочить массив по возрастанию элементов побочной диагонали.*/

        package zadachnic_2.zadachi_1_66;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class z_65 {
    public static void main(String[] args) {
       int[][] array;
       array = setArray();
       getArray(array);
       array = sortArray(array);
       getArray(array);
    }
    public static int[][] setArray(){
        int [][] arr = new int[8][8];
        Random rnd = new Random();
        Set<Integer> set =  new HashSet<>();
        int num;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                do num = 10+rnd.nextInt(90);
                while (! set.add(num));
                arr[i][j] = num;
            }
        }
        return arr;
    }
    public static void getArray(int[][] arr){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] copyArray(int[][]array,int [][] arr){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = array[i][j];
            }
        }
       return arr;
    }
    public static int[][] sortArray(int[][] array){
        int [][] arr = new int[8][8];
        arr = copyArray(array,arr);
        //сортируем массив переставляя столбцы
       int k=0,min_cur=0,temp,min=0,min_i=0,min_j=0;
        for (int i = 7; i >= 0; i--) {
            //находим первый элемент,
            // который больше минимума в предыдущей строке
            for (int m = k; m < 8; m++) {
                if(arr[i][m]>=min_cur){
                    min = arr[i][m];
                    min_j = m;
                    break;
                }
            }
            //находим минимальный элемент в каждой строке,
            // но который больше минимума в предыдущей строке
            for (int j = k; j < 8; j++) {
                if (arr[i][j] <= min && arr[i][j]>min_cur){
                    min=arr[i][j];
                    min_j=j;
                }
            }
            //меняем местами столбцы(текущий и с минимальным значением
            for (int l = 0; l < 8; l++) {
                temp = arr[l][k];
                arr[l][k] = arr[l][min_j];
                arr[l][min_j] = temp;
            }
            min_cur=arr[i][k];
            k++;
        }
        //проверяем,отсортирован ли массив
        boolean flag = true;
        for (int i = 6; i > 0 ; i--) {
            for (int j = 1; j < 7; j++) {
                if(arr[i][j]<arr[i+1][j-1] || arr[i][j]>arr[i-1][j+1]){
                    flag = false;
                    break;
                }
            }
        }

        //если массив не отсортирован,
        //сортируем перестановкой строк

        if(flag==true) return arr;
        else {
            arr = copyArray(array,arr);
            k = 7;
            min_cur = 0;
            min = 0;
            min_i = 0;
            for (int j = 0; j < 8; j++) {
                //находим первый элемент,
                // который больше минимума в предыдущем столбце
                for (int m = k; m >= 0; m--) {
                    if (arr[m][j] >= min_cur) {
                        min = arr[m][j];
                        min_i = m;
                        break;
                    }
                }
                //находим минимальный элемент в каждом столбце,
                // но который больше минимума в предыдущем столбце
                for (int i = k; i >= 0; i--) {
                    if (arr[i][j] <= min && arr[i][j] > min_cur) {
                        min = arr[i][j];
                        min_i = i;
                    }
                }
                //меняем местами строки(текущую и с минимальным значением
                for (int l = 0; l < 8; l++) {
                    temp = arr[k][l];
                    arr[k][l] = arr[min_i][l];
                    arr[min_i][l] = temp;
                }
                min_cur = arr[k][j];
                k--;
            }
        }
        //проверяем,отсортирован ли массив
        flag = true;
        for (int i = 6; i > 0 ; i--) {
            for (int j = 1; j < 7; j++) {
                if(arr[i][j]<arr[i+1][j-1] || arr[i][j]>arr[i-1][j+1]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag==true) return arr;
        else {
            System.out.println("Сортировка перестановкой строк и столбцов невозможна!!!");
            return array;
        }
    }
}
