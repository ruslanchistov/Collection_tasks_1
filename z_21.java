//Задан целочисленный массив. Определить разность между суммой значений элементов
//массива на участках, где элементы монотонно возрастают (каждое следующее число
//больше предыдущего) и суммой значений элементов массива на участках, где элементы
//монотонно убывают (каждое следующее число меньше предыдущего).

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_21 {
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
        int sum_rost = 0;
        int sum_spad = 0;
        if(arr[0]>arr[1]){

            sum_spad += arr[0];
        }
        else if(arr[0]<arr[1])
        {
            sum_rost += arr[0];

        }

        for( int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                sum_rost += arr[i+1];
            }
            if(arr[i]>arr[i+1]){
                sum_spad += arr[i+1];
            }
        }
        System.out.println("Разнисть между суммой элементов на участках возрастания и участках убывания равна: "+(sum_rost-sum_spad));
    }
}
