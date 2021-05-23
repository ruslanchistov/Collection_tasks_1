//Дан массив чисел. Определить элемент массива (значение и индекс), который наиболее
//удален от заданного двоичного числа D.

package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_28 {
    public static void main(String[] args) {
        Integer[] arr = {0b100, 0b11, 0b1010, 0b11, 0b111, 0b10, 0b111, 0b101, 0b10101, 0b10, 0b1, 0b11};
        getArray(arr);
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите контрольное число: ");
        int D = in.nextInt();

        int difference = Math.abs(arr[0]-D);
        int index = 0;
        for(int i =0;i< arr.length;i++){

            if(Math.abs(arr[i]-D)>difference){
                difference = Math.abs(arr[i]-D);
                index = i;
            }
        }
        System.out.println("Element: "+Integer.toBinaryString(arr[index])+"  Index: "+index);
    }

    static void getArray(Integer[] arr) {
        for (Integer i : arr) {
            System.out.print(Integer.toBinaryString((Integer) i) + " ");
        }
    }
}
