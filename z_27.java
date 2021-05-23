//Дан массив вещественных чисел. Определить элемент массива (значение и индекс),
//который наиболее близок к заданному вещественному числу R.

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class z_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i + " -й элемент :");
            arr[i] = in.nextDouble();
        }
        System.out.print("Введите контрольное число: ");
        double R = in.nextDouble();
        System.out.println(Arrays.toString(arr));

        double difference = Math.abs(arr[0]-R);
        int index = 0;
        double element = arr[0];
        for(int i =0;i<n;i++){

            if(Math.abs(arr[i]-R)<difference){
                difference = Math.abs(arr[i]-R);
                index = i;
                element = arr[i];
            }
        }

            System.out.println("Element: "+element+"  Index: "+index);

    }

}
