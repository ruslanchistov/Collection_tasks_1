//Задан целочисленный массив. Вывести индексы тех элементов, значения которых больше,
//чем у стоящих справа от него. Определить количество таких чисел.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i + " -й элемент :");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int count = 0;
        System.out.print("индексы тех элементов, значения которых больше,чем у стоящих справа от него: ");
        for(int i = 0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.print(i+"  ");
                count += 1;
            }
        }
        System.out.println();
        System.out.println("количество таких чисел: "+count);
    }
}
