//Ввести массив, состоящий из 15-ти элементов (двузначные целые числа). Изменить
//        разрядность цифр, образующих элементы исходного массива и, таким образом,
//        сформировать новый массив. Например, исходный массив: 25 71 84…, новый массив: 52
//        17 48….

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_13 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.print("Введите " + i + " -й элемент двухзначное число :");
            arr[i] = in.nextInt();
        }
        getArray(arr);

        int[] new_arr = new int[15];
        for(int i=0;i<15;i++){
            new_arr[i] = arr[i]%10*10+arr[i]/10;
        }
        getArray(new_arr);
    }
    static void getArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
