//Дано трехзначное число. Определить:
//а) является ли произведение его цифр больше числа b;
//б) кратна ли сумма его цифр трем.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_8 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное трёхзначное число: ");
        n = in.nextInt();
        System.out.print("Введите число b: ");
        int b;
        b = in.nextInt();
        int sum = n / 100 + n / 10 % 10 + n % 10;
        int prod = n / 100 * (n / 10 % 10) * (n % 10);
        if (sum % 3 == 0) {
            System.out.println("Сумма цифр кратна трём");
        } else {
            System.out.println("Сумма цифр не кратна трём");
        }
        if(prod > b){
            System.out.println("Произведение цифр больше "+b);
        }
        else{
            System.out.println("Произведение цифр не больше "+b);
        }
    }
}
