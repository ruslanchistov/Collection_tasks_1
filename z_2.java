//Дано двухзначное число. Определить:
//        а) входят ли в него цифры 3 и 7;
//        б) входят ли в него цифры ( 4 и 8) или цифра 9.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_2 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двухзначное число :");
        n = in.nextInt();
        func(n);
    }
    static void func(int n){
        if(n==37 || n == 73){
            System.out.println("В этом числе есть цифра три и цифра семь"); return;}
        if(n/10 ==3 || n%10 == 3){
            System.out.println("В этом числе есть цифра три"); return;}
        if(n/10 ==7 || n%10 == 7){
            System.out.println("В этом числе есть цифра семь"); return;}
        else{System.out.println("В этом числе нет цифры пять");}
    }
}
