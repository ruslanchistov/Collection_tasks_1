//В заданном массиве двоичных чисел определить количество чисел, стоящих между
//максимальным и минимальным элементами. Вывести сообщение, если таких чисел нет.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_26 {
    public static void main(String[] args) {
        Integer[] arr = {0b100, 0b11, 0b1010, 0b11, 0b111, 0b10, 0b111, 0b101, 0b10101, 0b10, 0b1, 0b11};
        getArray(arr);
        System.out.println();
        getMaxMin(arr);
    }

    static void getArray(Integer[] arr) {
        for (Integer i : arr) {
            System.out.print(Integer.toBinaryString((Integer) i) + " ");
        }
    }
    static void getMaxMin(Integer[] arr){
        int maxIndex = 0;
        int minIndex = 0;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i < arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        int result = java.lang.Math.abs(maxIndex-minIndex)-1;
        System.out.println("Количество элементов между максимальным и минимальным значениями: "+result);
    }
}