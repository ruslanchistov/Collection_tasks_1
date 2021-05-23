//Ввести массив чисел. Упорядочить элементы массива по возрастанию. Определить среднее
//значение чисел.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class z_19 {
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
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        double sum = 0;
        for(Integer i:arr){
            sum += i;
        }
        System.out.println("Среднее значение элементов массива равно "+sum/n);
    }
}
