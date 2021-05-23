//Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр
//равна сумме последних трех цифр).

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_5 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное шестизначное число: ");
        n = in.nextInt();
        if(n/100000+n/10000%10+n/1000%10 == n%10+n%100/10+n%1000/100){
            System.out.println("Число является счастливым.");
        }
        else{
            System.out.println("Число не является счастливым.");
        }
    }
}
