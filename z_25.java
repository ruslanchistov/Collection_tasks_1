//Из заданного целочисленного массива вывести номер последнего из тех его элементов,
//которые удовлетворяют неравенству Ai–1<Ai<Ai+1. Если таких элементов нет – вывести
//«таких нет».

        package zadachnic_2.zadachi_1_66;

import java.io.IOError;
import java.util.Arrays;
import java.util.Scanner;

public class z_25 {
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
        int index = n;
        for(int i = 1;i<n-1;i++){
            if((arr[i-1]<arr[i])&&(arr[i]<arr[i+1])){
                index = i;
            }
        }
        if(index!= n){
            System.out.println("Номер последнего такого элемента: "+index);
        }
        else {
            System.out.println("Таких элементов нет.");
        }
    }
}

