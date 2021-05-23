//Дано четырехзначное число. Определить:
//а) равна ли сумма двух первых его цифр сумме двух последних;
//б) кратна ли 7 сумма его цифр.

        package zadachnic_2.zadachi_1_66;

import java.util.Scanner;

public class z_11 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите  натуральное четырёхзначное число: ");
        n = in.nextInt();
        int sum_1_2 = n/1000+n%1000/100;//сумма первых двух цифр.
        int sum_3_4 = n%100/10+n%10;//сумма последних двух цифр.
        if(sum_1_2==sum_3_4){
            System.out.println("Сумма первых двух цифр числа равна !!! сумме двух последних цифр числа.");
        }
        else{
            System.out.println("Сумма первых двух цифр числа НЕ !!! равна сумме двух последних цифр числа.");
        }
        if((sum_1_2+sum_3_4)%7 == 0){
            System.out.println("Сумма цифр числа кратна 7.");
        }
        else{
            System.out.println("Сумма цифр числа  НЕ кратна 7.");
        }
    }
}
