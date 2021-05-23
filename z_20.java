//Ввести массив чисел. Поменять местами максимальный и минимальный элементы.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_20 {
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
        int maxIndex = 0;
        int minIndex = 0;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i < n;i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
            arr[maxIndex] = arr[maxIndex] ^ arr[minIndex];
            arr[minIndex] = arr[maxIndex] ^ arr[minIndex];
            arr[maxIndex] = arr[maxIndex] ^ arr[minIndex];
        System.out.println(Arrays.toString(arr));
    }
}
