//Ввести массив чисел, в котором имеются повторяющиеся элементы. Определить их
//местоположение.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class z_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i + " -й элемент :");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Позиции дублирующих элементов: ");
            Set<Integer> set_ = new HashSet<Integer>();
                   for (int i = 0; i < arr.length; i++) {
                       if (! set_.add(arr[i])) {
                           System.out.print(i+" ");
                       }
                   }

               }
           }

