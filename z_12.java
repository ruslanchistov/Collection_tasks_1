//Дано четырехзначное число. Определить:
//а) кратно ли произведение его цифр трем;
//б) кратно ли числу а произведение его цифр.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_12 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное четырёхзначное число: ");
        n = in.nextInt();
        System.out.print("Введите число для проверки кратности : ");
        int a;
        a = in.nextInt();
        int prod = (n/1000)*(n%1000/100)*(n%100/10)*(n%10);//произведение цифр числа.
        if(prod%3==0){
            System.out.println("Произведение цифр числа кратно 3.");
        }
        else{
            System.out.println("Произведение цифр числа НЕ кратно 3.");
        }
        if(prod%a==0){
            System.out.println("Произведение цифр числа кратно "+a);
        }
        else{
            System.out.println("Произведение цифр числа НЕ кратно "+a);
        }
    }
}
