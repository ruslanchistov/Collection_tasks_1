//Задан целочисленный массив. Определить, образуют ли значения его элементов
//арифметическую прогрессию. Если «да» – вывести разность прогрессии, если «нет» –
//ответ «не образуют».

        package zadachnic_2.zadachi_1_66;

import java.util.Arrays;
import java.util.Scanner;

public class z_22 {
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
        int k = arr[1]-arr[0];
        for(int i = 0;i<n-1;i++){
            if((arr[i+1]-arr[i])!= k){
                System.out.println("значения элементов не образуют арифметическую прогрессию.");
                k = 0;
                break;
            }
        }
        if(k!=0){
            System.out.println("значения элементов образуют арифметическую прогрессию, разность прогрессии: "+k);
        }
    }
}
