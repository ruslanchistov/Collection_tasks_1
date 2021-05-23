//Дано трехзначное число. Определить:
//        а) является ли сумма его цифр двухзначным числом;
//        б) является ли произведение его цифр трехзначным числом.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_7 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное трёхзначное число: ");
        n = in.nextInt();
        int sum = n/100+n/10%10+n%10;
        int prod =n/100*(n/10%10)*(n%10);
        if(sum/10 != 0){
            System.out.println("Сумма цифр является двухзначной.");
        }
        else{
            System.out.println("Сумма цифр не является двухзначной.");
        }
        if(prod/100 != 0){
            System.out.println("Произведение цифр является трёхзначным.");
        }
        else{
            System.out.println("Произведение цифр не является трёхзначным.");
        }
    }
}
